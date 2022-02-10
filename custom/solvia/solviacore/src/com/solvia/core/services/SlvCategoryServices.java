package com.solvia.core.services;

import com.solvia.core.dao.SlvCategoryDao;
import com.solvia.model.CategoryDtlsModel;

import javax.annotation.Resource;
import java.util.List;

public class SlvCategoryServices {

    @Resource
    private SlvCategoryDao slvCategoryDao;

    public List<CategoryDtlsModel> getCategoryDetails(final String slvCustomCategoryField){
        final List<CategoryDtlsModel> categoryDtlsModels = slvCategoryDao.getCategoryDtlsByCode(slvCustomCategoryField);
        return categoryDtlsModels;
    }

}
