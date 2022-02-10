package com.solvia.core.impl;

import com.solvia.core.dao.SlvCategoryDao;
import com.solvia.model.CategoryDtlsModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlvCategoryDaoImpl extends AbstractItemDao implements SlvCategoryDao {

    private static final Logger LOGGER = Logger.getLogger(SlvCategoryDaoImpl.class);

    private static final String CATEGORY_QUERY = "SELECT {" + CategoryDtlsModel.PK + "} FROM {" + CategoryDtlsModel._TYPECODE + "} WHERE {"
            + CategoryDtlsModel.SLVCUSTOMCATEGORYFIELD + "}= ?code";

    @Override
    public List<CategoryDtlsModel> getCategoryDtlsByCode(String slvCustomCategoryField) {

        ServicesUtil.validateParameterNotNull(slvCustomCategoryField, "Category Id must not be null");

        final Map<String, Object> params = new HashMap<>();
        params.put("code", slvCustomCategoryField);

        LOGGER.info(getFlexibleSearchService().search(CATEGORY_QUERY, params).getClass());
        final SearchResult<CategoryDtlsModel> categories = getFlexibleSearchService().search(CATEGORY_QUERY, params);

        return categories.getResult() == null ? Collections.emptyList() : categories.getResult();

    }
}
