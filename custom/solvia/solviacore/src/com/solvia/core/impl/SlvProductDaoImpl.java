package com.solvia.core.impl;

import com.solvia.core.dao.SlvProductDao;
import com.solvia.model.ProductDtlsModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlvProductDaoImpl extends AbstractItemDao implements SlvProductDao {

    private static Logger LOGGER = Logger.getLogger(SlvProductDaoImpl.class);

    private static final String PRODUCT_QUERY = "SELECT {" + ProductDtlsModel.PK + "} FROM {" + ProductDtlsModel._TYPECODE + "} WHERE {"
            + ProductDtlsModel.SLVCUSTOMPRODUCTFIELD + "}= ?code ";

    @Override
    public List<ProductDtlsModel> getProductDtlsByCode(String slvCustomProductField) {

        ServicesUtil.validateParameterNotNull(slvCustomProductField, "custom field cannot be null");

        final Map<String, Object> params = new HashMap<>();
        params.put("code", slvCustomProductField);

        LOGGER.info(getFlexibleSearchService().search(PRODUCT_QUERY, params).getClass());
        final SearchResult<ProductDtlsModel> stores = getFlexibleSearchService().search(PRODUCT_QUERY, params);

        return stores.getResult() == null ? Collections.emptyList() : stores.getResult();

    }
}
