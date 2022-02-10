/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapcpiproductexchange.inbound.events

import de.hybris.bootstrap.annotations.IntegrationTest
import de.hybris.platform.core.model.ItemModel
import de.hybris.platform.sap.sapmodel.model.ERPVariantProductModel
import de.hybris.platform.servicelayer.ServicelayerTransactionalSpockSpecification

import javax.annotation.Resource

@IntegrationTest
class SapCpiProductFeatureCleanHookIntegrationTest extends ServicelayerTransactionalSpockSpecification {
	@Resource
	private SapCpiProductFeatureCleanHook sapCpiProductFeatureCleanHook;


	def "Expect Empty Object"() {

		given:
		def product = Stub(ERPVariantProductModel)

		expect:
		sapCpiProductFeatureCleanHook.execute((ItemModel) product) == Optional.empty()
	}
}
