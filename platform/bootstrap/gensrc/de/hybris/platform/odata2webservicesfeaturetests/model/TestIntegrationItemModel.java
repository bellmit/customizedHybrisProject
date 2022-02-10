/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 10, 2022, 8:39:43 PM                    ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.odata2webservicesfeaturetests.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.test.TestItemType2Model;
import de.hybris.platform.integrationservices.enums.HttpMethod;
import de.hybris.platform.odata2webservicesfeaturetests.enums.OData2webservicesFeatureTestPropertiesTypes;
import de.hybris.platform.odata2webservicesfeaturetests.model.TestIntegrationItemDetailModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Generated model class for type TestIntegrationItem first defined at extension odata2webservicesfeaturetests.
 * <p>
 * An item type for testing different scenarios around integration objects. This type has attributes of
 *                 numerous types
 *                 available in the type system and enables conditions, which otherwise would be possible only by picking
 *                 hard-to-find
 *                 modeling scenarios available in multiple types across possibly multiple *-items.xml.
 */
@SuppressWarnings("all")
public class TestIntegrationItemModel extends TestItemType2Model
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "TestIntegrationItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem.code</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String CODE = "code";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem.otherItem</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String OTHERITEM = "otherItem";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem.detail</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String DETAIL = "detail";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem.bigDecimal</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String BIGDECIMAL = "bigDecimal";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem.dateCollection</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String DATECOLLECTION = "dateCollection";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem.bigInteger</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String BIGINTEGER = "bigInteger";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem.enumList</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String ENUMLIST = "enumList";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem.details</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String DETAILS = "details";
	
	/** <i>Generated constant</i> - Attribute key of <code>TestIntegrationItem.testEnums</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. */
	public static final String TESTENUMS = "testEnums";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public TestIntegrationItemModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public TestIntegrationItemModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>TestIntegrationItem</code> at extension <code>odata2webservicesfeaturetests</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public TestIntegrationItemModel(final String _code)
	{
		super();
		setCode(_code);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _code initial attribute declared by type <code>TestIntegrationItem</code> at extension <code>odata2webservicesfeaturetests</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public TestIntegrationItemModel(final String _code, final ItemModel _owner)
	{
		super();
		setCode(_code);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.bigDecimal</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the bigDecimal
	 */
	@Accessor(qualifier = "bigDecimal", type = Accessor.Type.GETTER)
	public BigDecimal getBigDecimal()
	{
		return getPersistenceContext().getPropertyValue(BIGDECIMAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.bigInteger</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the bigInteger
	 */
	@Accessor(qualifier = "bigInteger", type = Accessor.Type.GETTER)
	public BigInteger getBigInteger()
	{
		return getPersistenceContext().getPropertyValue(BIGINTEGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.code</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the code - Unique identifier of the item because TestItemType2 does not have a unique identifier.
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.GETTER)
	public String getCode()
	{
		return getPersistenceContext().getPropertyValue(CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.dateCollection</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the dateCollection - Defines an optional date collection.
	 */
	@Accessor(qualifier = "dateCollection", type = Accessor.Type.GETTER)
	public Collection<Date> getDateCollection()
	{
		return getPersistenceContext().getPropertyValue(DATECOLLECTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.detail</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the detail - Defines optional one-to-one association between this item and a TestIntegrationItemDetail.
	 */
	@Accessor(qualifier = "detail", type = Accessor.Type.GETTER)
	public TestIntegrationItemDetailModel getDetail()
	{
		return getPersistenceContext().getPropertyValue(DETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.details</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the details
	 */
	@Accessor(qualifier = "details", type = Accessor.Type.GETTER)
	public Set<TestIntegrationItemDetailModel> getDetails()
	{
		return getPersistenceContext().getPropertyValue(DETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.enumList</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the enumList
	 */
	@Accessor(qualifier = "enumList", type = Accessor.Type.GETTER)
	public List<HttpMethod> getEnumList()
	{
		return getPersistenceContext().getPropertyValue(ENUMLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.otherItem</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * @return the otherItem - Reference to another TestIntegrationItem, which can be used for testing conditions when the
	 *                         integration
	 *                         object references itself (same instance) or another item (different instance).
	 */
	@Accessor(qualifier = "otherItem", type = Accessor.Type.GETTER)
	public TestIntegrationItemModel getOtherItem()
	{
		return getPersistenceContext().getPropertyValue(OTHERITEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.testEnums</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 * Consider using FlexibleSearchService::searchRelation for pagination support of large result sets.
	 * @return the testEnums
	 */
	@Accessor(qualifier = "testEnums", type = Accessor.Type.GETTER)
	public Set<OData2webservicesFeatureTestPropertiesTypes> getTestEnums()
	{
		return getPersistenceContext().getPropertyValue(TESTENUMS);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem.bigDecimal</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the bigDecimal
	 */
	@Accessor(qualifier = "bigDecimal", type = Accessor.Type.SETTER)
	public void setBigDecimal(final BigDecimal value)
	{
		getPersistenceContext().setPropertyValue(BIGDECIMAL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem.bigInteger</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the bigInteger
	 */
	@Accessor(qualifier = "bigInteger", type = Accessor.Type.SETTER)
	public void setBigInteger(final BigInteger value)
	{
		getPersistenceContext().setPropertyValue(BIGINTEGER, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem.code</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the code - Unique identifier of the item because TestItemType2 does not have a unique identifier.
	 */
	@Accessor(qualifier = "code", type = Accessor.Type.SETTER)
	public void setCode(final String value)
	{
		getPersistenceContext().setPropertyValue(CODE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem.dateCollection</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the dateCollection - Defines an optional date collection.
	 */
	@Accessor(qualifier = "dateCollection", type = Accessor.Type.SETTER)
	public void setDateCollection(final Collection<Date> value)
	{
		getPersistenceContext().setPropertyValue(DATECOLLECTION, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem.detail</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the detail - Defines optional one-to-one association between this item and a TestIntegrationItemDetail.
	 */
	@Accessor(qualifier = "detail", type = Accessor.Type.SETTER)
	public void setDetail(final TestIntegrationItemDetailModel value)
	{
		getPersistenceContext().setPropertyValue(DETAIL, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem.details</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the details
	 */
	@Accessor(qualifier = "details", type = Accessor.Type.SETTER)
	public void setDetails(final Set<TestIntegrationItemDetailModel> value)
	{
		getPersistenceContext().setPropertyValue(DETAILS, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem.enumList</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the enumList
	 */
	@Accessor(qualifier = "enumList", type = Accessor.Type.SETTER)
	public void setEnumList(final List<HttpMethod> value)
	{
		getPersistenceContext().setPropertyValue(ENUMLIST, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem.otherItem</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the otherItem - Reference to another TestIntegrationItem, which can be used for testing conditions when the
	 *                         integration
	 *                         object references itself (same instance) or another item (different instance).
	 */
	@Accessor(qualifier = "otherItem", type = Accessor.Type.SETTER)
	public void setOtherItem(final TestIntegrationItemModel value)
	{
		getPersistenceContext().setPropertyValue(OTHERITEM, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>TestIntegrationItem.testEnums</code> attribute defined at extension <code>odata2webservicesfeaturetests</code>. 
	 *  
	 * @param value the testEnums
	 */
	@Accessor(qualifier = "testEnums", type = Accessor.Type.SETTER)
	public void setTestEnums(final Set<OData2webservicesFeatureTestPropertiesTypes> value)
	{
		getPersistenceContext().setPropertyValue(TESTENUMS, value);
	}
	
}
