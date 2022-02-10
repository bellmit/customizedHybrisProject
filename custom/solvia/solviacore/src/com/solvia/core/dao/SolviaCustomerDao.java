package com.solvia.core.dao;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

public interface SolviaCustomerDao extends Dao {

    List<CustomerModel> getCustomerDetailsByCode(String slvCustomField);

}
