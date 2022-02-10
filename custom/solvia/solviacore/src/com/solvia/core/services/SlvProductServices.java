package com.solvia.core.services;

import com.solvia.core.dao.SlvProductDao;
import com.solvia.model.ProductDtlsModel;

import javax.annotation.Resource;
import java.util.List;

public class SlvProductServices {

    @Resource
    private SlvProductDao slvProductDao;

    public List<ProductDtlsModel> getProductDtls(final String slvCustomProductField){
        final List<ProductDtlsModel> productDtlsModels = slvProductDao.getProductDtlsByCode(slvCustomProductField);
        return productDtlsModels;
    }

}
