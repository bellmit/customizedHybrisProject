package com.solvia.facades.product;

import de.hybris.platform.commercefacades.solviaProducts.data.SolviaProductData;

import java.util.List;

public interface SlvProductFacade {

    List<SolviaProductData> getSolviaProductDetails(final String slvCustomProductField);

}
