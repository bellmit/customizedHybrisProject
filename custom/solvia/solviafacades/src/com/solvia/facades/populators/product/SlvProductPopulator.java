package com.solvia.facades.populators.product;


import de.hybris.platform.commercefacades.product.converters.populator.ProductPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class SlvProductPopulator extends ProductPopulator{
    @Override
    public void populate(ProductModel productModel, ProductData productData) throws ConversionException {
        super.populate(productModel,productData);
        productData.setSlvProductCustomField(productModel.getSlvProductCustomField());
        productData.setSlvProductCustomFieldInteger(productModel.getSlvProductCustomFieldInteger());
    }
}
