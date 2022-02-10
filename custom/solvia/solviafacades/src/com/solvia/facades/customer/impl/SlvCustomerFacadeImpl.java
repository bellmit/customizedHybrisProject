package com.solvia.facades.customer.impl;

import com.solvia.core.services.SolviaCustomerServices;
import com.solvia.facades.customer.SlvCustomerFacade;
import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.commerceservices.event.UpdatedProfileEvent;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

public class SlvCustomerFacadeImpl extends DefaultCustomerFacade implements SlvCustomerFacade {

    private Populator<CustomerData, CustomerModel> slvCustomerReversePopulator;
    private SolviaCustomerServices customerServices;
    private Converter<CustomerModel, CustomerData> slvCustomerConverter;

    public SolviaCustomerServices getCustomerServices() {
        return customerServices;
    }

    public void setCustomerServices(SolviaCustomerServices customerServices) {
        this.customerServices = customerServices;
    }



    @Override
    public List<CustomerData> getSolviaCustomerDetails(final String slvCustomField){
        final List<CustomerModel> customerModel = customerServices.getSolviaCustomerDetails(slvCustomField);
        return Converters.convertAll(customerModel, getSlvCustomerConverter());

    }

    @Override
    public void updateFullProfile(final CustomerData customerData) throws DuplicateUidException
    {
        final CustomerModel customerModel = getCurrentSessionCustomer();
        slvCustomerReversePopulator.populate(customerData, customerModel);
        getModelService().save(customerModel);
        getEventService().publishEvent(initializeCommerceEvent(new UpdatedProfileEvent(), customerModel));
    }

    @Override
    public void isCustomerExist() {
        System.out.println("DO SOMETHING....");
        System.out.println("DO SOMETHING....");
    }


    public Populator<CustomerData, CustomerModel> getSlvCustomerReversePopulator() {
        return slvCustomerReversePopulator;
    }

    public void setSlvCustomerReversePopulator(Populator<CustomerData, CustomerModel> slvCustomerReversePopulator) {
        this.slvCustomerReversePopulator = slvCustomerReversePopulator;
    }

    public Converter<CustomerModel, CustomerData> getSlvCustomerConverter() {
        return slvCustomerConverter;
    }

    public void setSlvCustomerConverter(Converter<CustomerModel, CustomerData> slvCustomerConverter) {
        this.slvCustomerConverter = slvCustomerConverter;
    }
}
