package com.solvia.v2.controller;


import com.solvia.facades.product.SlvProductFacade;
import com.solvia.queues.data.SlvProductDataList;
import de.hybris.platform.commercewebservicescommons.dto.slvProduct.SlvProductDataListWSDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.apache.log4j.Logger;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="/{baseSiteId}/controllers")
@Api(tags = "Solvia Products")
public class SlvProductController extends BaseCommerceController {

    private static final Logger LOGGER = Logger.getLogger(SlvProductController.class);

    @Resource(name = "slvDefaultProductFacade")
    private SlvProductFacade productFacade;


    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "{slvCustomProductField}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getProductDetails", value="Get a specific product detail",
            notes =" Returns a specific product based on slvCustomProductField", authorizations =
            {    @Authorization(value="oauth2_client_credentials")})

    @ApiBaseSiteIdParam
    public SlvProductDataListWSDTO getProductDetails(@ApiParam(value = "slvCustomProductField", required = true)

                                                       @PathVariable
                                                       final String slvCustomProductField,
                                                     @ApiParam(value = "REsponse config. This is the list of fields that should be returnet in the response body", allowableValues = "BASIC,DEFAULT,FULL")
                                                       @RequestParam(defaultValue = DEFAULT_FIELD_SET)
                                                       final String fields){
        LOGGER.info("Product is: " + slvCustomProductField);
        final SlvProductDataList productDataList = new SlvProductDataList();
        productDataList.setSlvProduct(productFacade.getSolviaProductDetails(slvCustomProductField));
        return getDataMapper().map(productDataList, SlvProductDataListWSDTO.class, fields);
    }

}
