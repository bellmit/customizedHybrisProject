package com.solvia.facades.populators.customer;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.TitleModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.springframework.util.Assert;

import javax.validation.constraints.NotNull;

public class SlvCustomerPopulator implements Populator<CustomerModel, CustomerData> {

    @Override
    public void populate(CustomerModel customerModel, CustomerData customerData) throws ConversionException {
        customerData.setSolviaCustomField(customerModel.getSlvCustomField());
        customerData.setSolviaCustomFieldInteger(customerModel.getSlvCustomFieldInteger());
    }

}
