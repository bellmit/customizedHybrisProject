package com.solvia.facades.populators.category;

import com.solvia.model.CategoryDtlsModel;
import de.hybris.platform.cmsfacades.products.populator.CategoryDataPopulator;
import de.hybris.platform.commercefacades.solviaCategories.data.SolviaCategoryData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class SlvCategoryPopulator implements Populator<CategoryDtlsModel, SolviaCategoryData> {
    @Override
    public void populate(CategoryDtlsModel source, SolviaCategoryData target) throws ConversionException {
        target.setSlvCustomCategoryField(source.getSlvCustomCategoryField());
        target.setSlvCustomCategoryFieldInteger(source.getSlvCustomCategoryFieldInteger());
    }
}
