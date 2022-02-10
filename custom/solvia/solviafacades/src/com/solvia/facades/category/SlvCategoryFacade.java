package com.solvia.facades.category;

import de.hybris.platform.commercefacades.solviaCategories.data.SolviaCategoryData;

import java.util.List;

public interface SlvCategoryFacade {

    List<SolviaCategoryData> getSolviaCategoryDetails(final String slvCustomCategoryField);

}
