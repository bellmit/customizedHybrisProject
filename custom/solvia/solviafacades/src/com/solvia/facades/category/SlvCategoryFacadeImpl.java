package com.solvia.facades.category;

import com.solvia.core.services.SlvCategoryServices;
import com.solvia.core.services.SlvProductServices;
import com.solvia.model.CategoryDtlsModel;
import de.hybris.platform.commercefacades.solviaCategories.data.SolviaCategoryData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

public class SlvCategoryFacadeImpl implements SlvCategoryFacade{

    private SlvCategoryServices slvCategoryServices;
    private Converter<CategoryDtlsModel, SolviaCategoryData> solviaCategoryConverter;

    public SlvCategoryServices getSlvCategoryServices() {
        return slvCategoryServices;
    }

    public void setSlvCategoryServices(SlvCategoryServices slvCategoryServices) {
        this.slvCategoryServices = slvCategoryServices;
    }

    public Converter<CategoryDtlsModel, SolviaCategoryData> getSolviaCategoryConverter() {
        return solviaCategoryConverter;
    }

    public void setSolviaCategoryConverter(Converter<CategoryDtlsModel, SolviaCategoryData> solviaCategoryConverter) {
        this.solviaCategoryConverter = solviaCategoryConverter;
    }

    @Override
    public List<SolviaCategoryData> getSolviaCategoryDetails(final String slvCustomCategoryField){
        final List<CategoryDtlsModel> categoryDtlsModels  = slvCategoryServices.getCategoryDetails(slvCustomCategoryField);

        return Converters.convertAll(categoryDtlsModels, getSolviaCategoryConverter());
    }

}
