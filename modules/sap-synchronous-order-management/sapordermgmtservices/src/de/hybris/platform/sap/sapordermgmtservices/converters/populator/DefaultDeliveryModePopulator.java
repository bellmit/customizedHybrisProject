/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.sapordermgmtservices.converters.populator;

import de.hybris.platform.commercefacades.order.data.DeliveryModeData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.Map.Entry;

import org.apache.log4j.Logger;


/**
 * 
 */
public class DefaultDeliveryModePopulator implements Populator<Entry<String, String>, DeliveryModeData>
{
	private static final Logger LOG = Logger.getLogger(DefaultDeliveryModePopulator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final Entry<String, String> source, final DeliveryModeData target) throws ConversionException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("populate called for " + source.getKey() + ", " + source.getValue());
		}
		target.setCode(source.getKey());
		target.setName(source.getValue());
	}



}
