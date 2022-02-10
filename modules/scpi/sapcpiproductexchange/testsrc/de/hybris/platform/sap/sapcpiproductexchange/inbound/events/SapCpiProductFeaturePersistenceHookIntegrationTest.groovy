/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
 
package de.hybris.platform.sap.sapcpiproductexchange.inbound.events

import de.hybris.bootstrap.annotations.IntegrationTest
import de.hybris.platform.catalog.dynamic.ProductFeatureValueAttributeHandler
import de.hybris.platform.servicelayer.ServicelayerTransactionalSpockSpecification
import de.hybris.platform.servicelayer.i18n.I18NService
import de.hybris.platform.servicelayer.i18n.impl.DefaultFormatFactory
import de.hybris.platform.servicelayer.internal.model.attribute.impl.DefaultDynamicAttributesProvider
import de.hybris.platform.servicelayer.model.ItemModelContextImpl
import de.hybris.platform.servicelayer.model.ModelContextUtils
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler
import de.hybris.platform.servicelayer.search.FlexibleSearchService
import spock.lang.Issue
import org.junit.Test
import spock.lang.Unroll

import javax.annotation.Resource
import de.hybris.platform.integrationservices.util.IntegrationTestUtil
import de.hybris.platform.catalog.model.CatalogModel
import de.hybris.platform.catalog.model.CatalogVersionModel
import de.hybris.platform.catalog.model.ProductFeatureModel
import de.hybris.platform.catalog.model.classification.*
import de.hybris.platform.core.model.ItemModel
import de.hybris.platform.core.model.product.ProductModel
import de.hybris.platform.sap.sapmodel.model.ERPVariantProductModel

import static de.hybris.platform.integrationservices.util.IntegrationTestUtil.importImpEx

@IntegrationTest
@Issue('https://cxjira.sap.com/browse/GRIFFIN-4353')
class SapCpiProductFeaturePersistenceHookIntegrationTest extends ServicelayerTransactionalSpockSpecification {
	private static final def CATALOG_VERSION_VERSION = 'Stage'
	private static final def CATALOG_ID = 'Default'
	private static final def BASE_PRODUCT_CODE = 'baseProduct'
	private static final def PRODUCT_CODE = 'VariantProduct'

	private static final def delimiterString = "|";

	private static final def CLASS_SYSTEM = 'ERP_CLASSIFICATION_001'
	private static final def CLASS_VERSION = 'ERP_IMPORT'
	private static final def CLASSIFICATION_CLASS = 'WEC_CDRAGON_CAR'
	private static final def CLASS_SYSTEM_VERSION = "$CLASS_SYSTEM:$CLASS_VERSION"
	private static final def CLASSIFICATION_ATTRIBUTE_SIZE_CODE = 'SIZE'
	private static final def CLASSIFICATION_ATTRIBUTE_COLOR_CODE = 'COLOR'
	private static final def CLASSIFICATION_ATTRIBUTEVALUE_COLOR_CODE = 'COLOR_BLACK'

	@Resource
	private SapCpiProductFeaturePersistenceHook sapCpiProductFeaturePersistenceHook;

	@Resource
	FlexibleSearchService flexibleSearchService;

	@Resource
	private I18NService i18nService;

	def setup() {
		importImpEx(
				'INSERT_UPDATE ClassificationSystem; id[unique = true]',
				"                                         ; $CLASS_SYSTEM",
				'INSERT_UPDATE ClassificationSystemVersion; catalog(id)[unique = true]; version[unique = true]; active',
				"                                         ; $CLASS_SYSTEM             ; $CLASS_VERSION        ; true",
				"INSERT_UPDATE Catalog; id[unique = true]",
				"                     ; $CATALOG_ID ",
				"INSERT_UPDATE CatalogVersion ; catalog(id)[unique = true]; version[unique = true]  ; active;",
				"                             ; $CATALOG_ID               ; $CATALOG_VERSION_VERSION; true"
		)

		importImpEx(
				'$CATALOG_VERSION_HEADER = catalogVersion(catalog(id), version)',
				'$CLASS_HEADER=classificationClass($CATALOG_VERSION_HEADER, code)',
				'$SYSTEM_VERSION_HEADER = systemVersion(catalog(id), version)',
				'$CLASS_ATTRIBUTE_HEADER = classificationAttribute($SYSTEM_VERSION_HEADER, code)',
				'INSERT_UPDATE ClassificationClass; code[unique = true]   ; $CATALOG_VERSION_HEADER[unique = true]',
				"                                        ; $CLASSIFICATION_CLASS ; $CLASS_SYSTEM_VERSION",
				'INSERT_UPDATE ClassificationAttribute; code[unique = true]                  ; name[lang = en]; $SYSTEM_VERSION_HEADER',
				"                                     ; $CLASSIFICATION_ATTRIBUTE_SIZE_CODE  ; Tire           ; $CLASS_SYSTEM_VERSION",
				"                                     ; $CLASSIFICATION_ATTRIBUTE_COLOR_CODE ; COLOR          ; $CLASS_SYSTEM_VERSION",
				'INSERT_UPDATE ClassificationAttributeValue; code[unique = true]                       ; name[lang = en]; $SYSTEM_VERSION_HEADER',
				"                                          ; $CLASSIFICATION_ATTRIBUTEVALUE_COLOR_CODE ; BLACK          ; $CLASS_SYSTEM_VERSION",
				'INSERT_UPDATE ClassAttributeAssignment; $CLASS_HEADER[unique = true]                ; $CLASS_ATTRIBUTE_HEADER[unique = true]                    ; attributeType(code); range; multiValued',
				"                                      ; $CLASS_SYSTEM_VERSION:$CLASSIFICATION_CLASS ; $CLASS_SYSTEM_VERSION:$CLASSIFICATION_ATTRIBUTE_SIZE_CODE ; number             ; true ; true ",
				"                                      ; $CLASS_SYSTEM_VERSION:$CLASSIFICATION_CLASS ; $CLASS_SYSTEM_VERSION:$CLASSIFICATION_ATTRIBUTE_COLOR_CODE; enum              ; false; false ",
				'INSERT_UPDATE Product; variantType(code);$CATALOG_VERSION_HEADER[unique=true]; code[unique=true]  ; supercategories(code,catalogVersion(catalog(id),version))',
				"                     ; ERPVariantProduct;Default:Stage                       ; $BASE_PRODUCT_CODE ; $CLASSIFICATION_CLASS:$CLASS_SYSTEM_VERSION"
		)
	}



	@Test
	@Unroll
	def "product feature #description"() {
		given:
		def exampleCatalog = new CatalogModel();
		exampleCatalog.setId(CATALOG_ID);
		def catalog = flexibleSearchService.getModelByExample(exampleCatalog);

		def exampleCatalogVersion = new CatalogVersionModel();
		exampleCatalogVersion.setCatalog(catalog);
		exampleCatalogVersion.setVersion(CATALOG_VERSION_VERSION);

		def catalogVersion = flexibleSearchService.getModelByExample(exampleCatalogVersion);

		and:
		def baseProductExample = new ProductModel()
		baseProductExample.setCode(BASE_PRODUCT_CODE)
		baseProductExample.setCatalogVersion(catalogVersion);

		def baseProduct = flexibleSearchService.getModelByExample(baseProductExample);

		def product = new ERPVariantProductModel()
		product.setCode(PRODUCT_CODE)
		product.setCatalogVersion(catalogVersion)
		product.setBaseProduct(baseProduct)

		def feature = prepareProductFeature();
		feature.setValuePosition(valuePosition);
		feature.setValue(featureValue);
		feature.setQualifier(qualifierValue);
		feature.setProduct(product);

		final List<ProductFeatureModel> features = new ArrayList<>();
		features.add(feature);
		product.setFeatures(features)

		when:
		sapCpiProductFeaturePersistenceHook.setCollectionDelimiter(delimiter);
		sapCpiProductFeaturePersistenceHook.execute((ItemModel) product);

		def productExample = new ERPVariantProductModel()
		productExample.setCode(PRODUCT_CODE)
		productExample.setCatalogVersion(catalogVersion)
		productExample.setBaseProduct(baseProduct)

		then:
		(flexibleSearchService.getModelByExample(productExample)).getFeatures().size() == expectResult

		where:
		description                                           | delimiter       | valuePosition | qualifierValue                                                                  |featureValue                                                         | expectResult
		"with two numeric attribute values and special split" | delimiterString | 1             |  CLASS_SYSTEM + '/' + CLASS_VERSION + '/' + CLASSIFICATION_ATTRIBUTE_SIZE_CODE  |"SIZE_1.000000000000000E+03"+delimiterString+"0.000000000000000E+00" | 2
		"with two numeric attribute values and default split" | null            | 1             |  CLASS_SYSTEM + '/' + CLASS_VERSION + '/' + CLASSIFICATION_ATTRIBUTE_SIZE_CODE  |"SIZE_1.000000000000000E+03,0.000000000000000E+00"                   | 2
		"with one numeric attribute value"                    | null            | 1             |  CLASS_SYSTEM + '/' + CLASS_VERSION + '/' + CLASSIFICATION_ATTRIBUTE_SIZE_CODE  |"SIZE_1.000000000000000E+03"                                         | 1
		"with one string attribute value"                     | null            | 1             |  CLASS_SYSTEM + '/' + CLASS_VERSION + '/' + CLASSIFICATION_ATTRIBUTE_COLOR_CODE |"COLOR_BLACK"                                                        | 1

	}

	protected ProductFeatureModel prepareProductFeature() {
		def productFeatureValueAttributeHandler = new ProductFeatureValueAttributeHandler();
		def defaultFormatFactory = new DefaultFormatFactory();
		defaultFormatFactory.setI18nService(i18nService)
		productFeatureValueAttributeHandler.setFormatFactory(defaultFormatFactory);

		final Map<String, DynamicAttributeHandler> dynamicAttributes = new HashMap<String, DynamicAttributeHandler>();
		dynamicAttributes.put("value", productFeatureValueAttributeHandler);
		def dynamicAttributesProvider = new DefaultDynamicAttributesProvider(dynamicAttributes);
		def feature = new ProductFeatureModel();
		feature.setProperty("valueType", 1);
		((ItemModelContextImpl) ModelContextUtils.getItemModelContext(feature))
				.setDynamicAttributesProvider(dynamicAttributesProvider);
		return feature;
	}
}
