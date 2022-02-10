package com.solvia.v2.controller;

import com.solvia.facades.category.SlvCategoryFacade;
import com.solvia.queues.data.SlvCategoryDataList;
import com.solvia.queues.data.SlvProductDataList;
import de.hybris.platform.commercewebservicescommons.dto.slvCategory.SlvCategoryDataListWSDTO;
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
@RequestMapping(value = {"/{baseSiteId}"})
@Api(tags = "Solvia Categories")
public class SlvCategoryController extends BaseCommerceController {

    private static final Logger LOGGER = Logger.getLogger(SlvCategoryController.class);

    @Resource(name = "slvDefaultCategoryFacade")
    private SlvCategoryFacade categoryFacade;

    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "{slvCustomCategoryField}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getCategoryDetails", value="Get a specific category detail",
            notes =" Returns a specific product based on slvCustomCategoryField", authorizations =
            {    @Authorization(value="oauth2_client_credentials")})

    @ApiBaseSiteIdParam
    public SlvCategoryDataListWSDTO getCategoryDetails(@ApiParam(value = "slvCustomCategoryField", required = true)

                                                     @PathVariable
                                                     final String slvCustomCategoryField,
                                                       @ApiParam(value = "REsponse config. This is the list of fields that should be returnet in the response body", allowableValues = "BASIC,DEFAULT,FULL")
                                                     @RequestParam(defaultValue = DEFAULT_FIELD_SET)
                                                     final String fields){
        LOGGER.info("Product is: " + slvCustomCategoryField);
        final SlvCategoryDataList categoryDataList = new SlvCategoryDataList();
        categoryDataList.setSlvCategory(categoryFacade.getSolviaCategoryDetails(slvCustomCategoryField));
        return getDataMapper().map(categoryDataList, SlvCategoryDataListWSDTO.class, fields);
    }


}
