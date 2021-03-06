/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.notificationservices.dao.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.notificationservices.dao.NotifyCustomerDao;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.Collections;
import java.util.List;


public class DefaultNotifyCustomerDao extends DefaultGenericDao<CustomerModel> implements NotifyCustomerDao
{
	private static final String FIND_OLD_CUSTOMER = "SELECT {" + CustomerModel.PK + "} FROM {" + CustomerModel._TYPECODE + "} "
			+ "WHERE {" + CustomerModel.NOTIFICATIONCHANNELS + "} IS NULL";

	public DefaultNotifyCustomerDao()
	{
		super(CustomerModel._TYPECODE);
	}

	@Override
	public List<CustomerModel> findOldCustomer()
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(FIND_OLD_CUSTOMER);
		final List<CustomerModel> oldCustomers = getFlexibleSearchService().<CustomerModel> search(query).getResult();
		if (null == oldCustomers)
		{
			return Collections.emptyList();
		}
		return oldCustomers;
	}

}