package com.solvia.facades.populators.customer;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerReversePopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class SlvCustomerReversePopulator extends CustomerReversePopulator {
    @Override
    public void populate(CustomerData customerData, CustomerModel customerModel) throws ConversionException {
        super.populate(customerData, customerModel);
        customerModel.setSlvCustomField(customerData.getSolviaCustomField());
        customerModel.setSlvCustomFieldInteger(customerData.getSolviaCustomFieldInteger());
    }
}
