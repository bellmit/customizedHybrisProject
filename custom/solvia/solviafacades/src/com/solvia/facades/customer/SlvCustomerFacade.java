package com.solvia.facades.customer;

import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;

import java.util.List;

public interface SlvCustomerFacade extends CustomerFacade {

    // This Method Not Exist Hybris Default CustomerFacade
    void isCustomerExist();
    List<CustomerData> getSolviaCustomerDetails(final String slvCustomField);
}
