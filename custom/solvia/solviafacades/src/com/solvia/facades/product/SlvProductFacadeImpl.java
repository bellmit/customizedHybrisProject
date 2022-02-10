package com.solvia.facades.product;

import com.solvia.core.services.SlvProductServices;
import com.solvia.model.ProductDtlsModel;
import de.hybris.platform.commercefacades.solviaProducts.data.SolviaProductData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

public class SlvProductFacadeImpl implements SlvProductFacade {

    private SlvProductServices slvProductServices;
    private Converter<ProductDtlsModel, SolviaProductData> solviaProductConverter;

    public SlvProductServices getSlvProductServices() {
        return slvProductServices;
    }

    public void setSlvProductServices(SlvProductServices slvProductServices) {
        this.slvProductServices = slvProductServices;
    }

    public Converter<ProductDtlsModel, SolviaProductData> getSolviaProductConverter() {
        return solviaProductConverter;
    }

    public void setSolviaProductConverter(Converter<ProductDtlsModel, SolviaProductData> solviaProductConverter) {
        this.solviaProductConverter = solviaProductConverter;
    }

    @Override
    public List<SolviaProductData> getSolviaProductDetails(final String slvCustomProductField){
        final List<ProductDtlsModel> productDtlsModel = slvProductServices.getProductDtls(slvCustomProductField);

        return Converters.convertAll(productDtlsModel, getSolviaProductConverter());
    }

}
