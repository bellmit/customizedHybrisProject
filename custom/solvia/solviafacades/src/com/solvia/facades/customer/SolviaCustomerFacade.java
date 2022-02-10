package com.solvia.facades.customer;

import de.hybris.platform.commercefacades.solviaCustomers.data.SolviaCustomerData;

import java.util.List;

public interface SolviaCustomerFacade {

    public List<SolviaCustomerData> getSolviaCustomerDetails(final String slvCustomField);
}
