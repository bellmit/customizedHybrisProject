package com.solvia.core.dao;

import com.solvia.model.ProductDtlsModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

public interface SlvProductDao extends Dao {

    List<ProductDtlsModel> getProductDtlsByCode(String slvCustomProductField);
}
