/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.sap.hybris.sec.eventpublisher.b2b.handler.impl;

import java.io.IOException;

import com.sap.hybris.sec.eventpublisher.handler.impl.AfterAddressSaveEventHandler;

import de.hybris.platform.b2b.model.B2BCustomerModel;
import de.hybris.platform.b2b.model.B2BUnitModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.tx.AfterSaveEvent;

public class AfterB2BAddressSaveEventHandler extends AfterAddressSaveEventHandler
{


	@Override
	public boolean shouldHandle(final AfterSaveEvent event, final ItemModel model) throws IOException {

		if (model instanceof AddressModel && (model.getOwner() instanceof B2BUnitModel
				|| model.getOwner() instanceof B2BCustomerModel)) {
			return true;
		} else {
			return super.shouldHandle(event, model);
		}

	}



}
