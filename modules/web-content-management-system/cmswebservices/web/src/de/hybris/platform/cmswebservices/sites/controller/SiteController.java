/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmswebservices.sites.controller;

import static de.hybris.platform.cmswebservices.constants.CmswebservicesConstants.API_VERSION;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import de.hybris.platform.cmsfacades.sites.SiteFacade;
import de.hybris.platform.cmswebservices.data.SiteData;
import de.hybris.platform.cmswebservices.data.SiteListData;
import de.hybris.platform.cmswebservices.dto.CatalogDataListWsDTO;
import de.hybris.platform.cmswebservices.security.IsAuthorizedCmsManager;
import de.hybris.platform.webservicescommons.cache.CacheControl;
import de.hybris.platform.webservicescommons.cache.CacheControlDirective;
import de.hybris.platform.webservicescommons.mapping.DataMapper;

import java.util.List;

import javax.annotation.Resource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to support the sites end point.
 */
@RestController
@IsAuthorizedCmsManager
@RequestMapping(API_VERSION + "/sites")
@CacheControl(directive = CacheControlDirective.PRIVATE)
public class SiteController {

	@Resource
	private SiteFacade siteFacade;
	@Resource
	private DataMapper dataMapper;

	/**
	 * Get all sites.
	 *
	 * @return A list of all sites configured; never <tt>null</tt>
	 */
	@RequestMapping(method = GET)
	@ApiOperation(value = "Get all sites", notes = "Get all sites.")
	@ApiResponses({
			@ApiResponse(code = 200, message = "A list of all sites configured, never null.", response = SiteListData.class)
	})
	public SiteListData getAllSites() {
		final List<SiteData> sites = getDataMapper().mapAsList(getSiteFacade().getAllSiteData(), SiteData.class, null);

		final SiteListData siteListData = new SiteListData();
		siteListData.setSites(sites);
		return siteListData;
	}

	@RequestMapping(method = GET, params = "catalogIds")
	@ApiOperation(value = "Get sites for catalogs", notes = "Get all sites for the given list of catalog ids.")
	@ApiResponses({
			@ApiResponse(code = 200, message = "List of all sites for the given list of catalog ids, never null", response = SiteListData.class)
	})
	public SiteListData getSitesForCatalogs(
			@ApiParam(value = "List of catalog identifiers", required = true) @RequestParam final List<String> catalogIds)
	{
		final List<SiteData> sites = getDataMapper().mapAsList(
				getSiteFacade().getSitesForCatalogs(catalogIds), SiteData.class,null);

		final SiteListData siteListData = new SiteListData();
		siteListData.setSites(sites);
		return siteListData;
	}

	@RequestMapping(value = "/catalogs", method = POST)
	@ResponseBody
	@ApiOperation(value = "Get sites for catalogs", notes = "Get all sites for the given list of catalog ids by posting the catalogIds in the request body.")
	@ApiResponses({
			@ApiResponse(code = 200, message = "List of all sites for the given list of catalog ids, never null", response = SiteListData.class)
	})
	public SiteListData getSitesForCatalogsInBody(
			@ApiParam(value = "List of catalog identifiers", required = true) @RequestBody final CatalogDataListWsDTO dto)
	{
		final List<SiteData> sites = getDataMapper().mapAsList(
				getSiteFacade().getSitesForCatalogs(dto.getCatalogIds()), SiteData.class,null);

		final SiteListData siteListData = new SiteListData();
		siteListData.setSites(sites);
		return siteListData;
	}

	public SiteFacade getSiteFacade() {
		return siteFacade;
	}

	public void setSiteFacade(final SiteFacade siteFacade) {
		this.siteFacade = siteFacade;
	}

	protected DataMapper getDataMapper()
	{
		return dataMapper;
	}

	public void setDataMapper(final DataMapper dataMapper)
	{
		this.dataMapper = dataMapper;
	}
}
