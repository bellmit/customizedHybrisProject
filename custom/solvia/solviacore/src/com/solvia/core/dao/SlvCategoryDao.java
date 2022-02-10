package com.solvia.core.dao;

import com.solvia.model.CategoryDtlsModel;
import de.hybris.platform.servicelayer.internal.dao.Dao;

import java.util.List;

public interface SlvCategoryDao extends Dao {

    List<CategoryDtlsModel> getCategoryDtlsByCode(String slvCustomCategoryField);

}
