package com.solvia.v2.controller;

import com.solvia.facades.customer.SlvCustomerFacade;
import com.solvia.queues.data.SlvCustomerDataList;
import de.hybris.platform.commercewebservicescommons.dto.slvCustomer.SlvCustomerDataListWSDTO;
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
@RequestMapping(value = "/{baseSiteId}/customers")
@Api(tags = "Solvia Customer")
public class CustomerController extends BaseCommerceController{

    private static final Logger LOGGER = Logger.getLogger(CustomerController.class);

    @Resource(name = "slvDefaultCustomerFacade")
    private SlvCustomerFacade customerFacade;


    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "{slvCustomField}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getCustomerDetails", value="Get a specific customer detail",
            notes =" Returns a specific Customer based on slvCustomField", authorizations =
            {    @Authorization(value="oauth2_client_credentials")})

    @ApiBaseSiteIdParam
    public SlvCustomerDataListWSDTO getCustomerDetails(@ApiParam(value = "slvCustomField", required = true)

    @PathVariable
    final String slvCustomField,
                                                       @ApiParam(value = "REsponse config. This is the list of fields that should be returnet in the response body", allowableValues = "BASIC,DEFAULT,FULL")
    @RequestParam(defaultValue = DEFAULT_FIELD_SET)
                                                       final String fields){
        LOGGER.info("Customer is: " + slvCustomField);
        final SlvCustomerDataList customerDataList = new SlvCustomerDataList();
        customerDataList.setSlvCustomer(customerFacade.getSolviaCustomerDetails(slvCustomField));
        return getDataMapper().map(customerDataList, SlvCustomerDataListWSDTO.class, fields);
    }

}
