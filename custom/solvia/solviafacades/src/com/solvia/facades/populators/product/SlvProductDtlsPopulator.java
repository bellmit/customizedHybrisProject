package com.solvia.facades.populators.product;

import com.solvia.model.ProductDtlsModel;
import de.hybris.platform.commercefacades.solviaProducts.data.SolviaProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class SlvProductDtlsPopulator implements Populator<ProductDtlsModel, SolviaProductData> {
    @Override
    public void populate(ProductDtlsModel source, SolviaProductData target) throws ConversionException {
        target.setSlvCustomProductField(source.getSlvCustomProductField());
        target.setSlvCustomProductFieldInteger(source.getSlvCustomProductFieldInteger());
    }
}
