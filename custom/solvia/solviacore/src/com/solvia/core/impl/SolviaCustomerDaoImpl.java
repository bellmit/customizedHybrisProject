package com.solvia.core.impl;

import com.solvia.core.dao.SolviaCustomerDao;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SolviaCustomerDaoImpl extends AbstractItemDao implements SolviaCustomerDao {

    private static final Logger LOGGER = Logger.getLogger(SolviaCustomerDaoImpl.class);

    private static final String CUSTOMER_QUERY = "SELECT {" + CustomerModel.PK + "} FROM {"
            + CustomerModel._TYPECODE + "} WHERE {" + CustomerModel.SLVCUSTOMFIELD + "}= ?code ";

    @Override
    public List<CustomerModel> getCustomerDetailsByCode(String slvCustomField) {
        ServicesUtil.validateParameterNotNull(slvCustomField, "slvCustomField must not be null");

        final Map<String, Object> params = new HashMap<>();
        params.put("code", slvCustomField);

        LOGGER.info(getFlexibleSearchService().search(CUSTOMER_QUERY, params).getClass());
        final SearchResult<CustomerModel> customers = getFlexibleSearchService().search(CUSTOMER_QUERY, params);

        return customers.getResult() == null ? Collections.emptyList() : customers.getResult();

    }
}
