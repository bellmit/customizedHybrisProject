package com.solvia.core.services;

import com.solvia.core.dao.SolviaCustomerDao;
import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

public class SolviaCustomerServices {

    private final SolviaCustomerDao solviaCustomerDao;

    public SolviaCustomerServices(SolviaCustomerDao solviaCustomerDao) {
        this.solviaCustomerDao = solviaCustomerDao;
    }

    public List<CustomerModel> getSolviaCustomerDetails(final String slvCustomField){
        final List<CustomerModel> customerModels = solviaCustomerDao.getCustomerDetailsByCode(slvCustomField);
        return customerModels;
    }

}
