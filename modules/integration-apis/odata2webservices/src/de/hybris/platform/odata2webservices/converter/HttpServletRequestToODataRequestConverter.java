/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.odata2webservices.converter;

import de.hybris.platform.odata2services.converter.ContentTypeNotSupportedException;
import de.hybris.platform.odata2services.converter.PathInfoInvalidException;
import de.hybris.platform.odata2services.converter.RequestMethodNotSupportedException;
import de.hybris.platform.odata2webservices.odata.IntegrationODataRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllformedLocaleException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.olingo.odata2.api.commons.HttpHeaders;
import org.apache.olingo.odata2.api.commons.ODataHttpMethod;
import org.apache.olingo.odata2.api.exception.ODataException;
import org.apache.olingo.odata2.api.exception.ODataUnsupportedMediaTypeException;
import org.apache.olingo.odata2.api.processor.ODataRequest;
import org.apache.olingo.odata2.api.uri.PathInfo;
import org.apache.olingo.odata2.core.servlet.RestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;


public class HttpServletRequestToODataRequestConverter implements Converter<HttpServletRequest, ODataRequest>
{
	private static final Logger LOGGER = LoggerFactory.getLogger(HttpServletRequestToODataRequestConverter.class);
	private static final String METADATA_PATH = "$metadata";

	/**
	 * Converts a HttpServletRequest into a ODataRequest.
	 *
	 * @param request - HttpServletRequest that needs to be converted to a ODataRequest.
	 * @return - ODataRequest object based off of the request param and oDattaHttpMethod
	 * set during the instantiation of this class.
	 */
	@Override
	public ODataRequest convert(final HttpServletRequest request)
	{
		try
		{
			final IntegrationODataRequest integrationODataRequest = new IntegrationODataRequest();

			return integrationODataRequest.customBuilder().method(convertStringToODataHttpMethod(request.getMethod()))
					.httpMethod(request.getMethod())
					.contentType(extractContentType(request))
					.acceptHeaders(extractAcceptHeader(request))
					.acceptableLanguages(extractAcceptLanguageHeader(request))
					.pathInfo(extractPathInfo(request))
					.requestHeaders(RestUtil.extractHeaders(request))
					.allQueryParameters(extractQueryParametersNoFormEncoding(request))
					.body(request.getInputStream())
					.build();
		}
		catch (final IllegalArgumentException e)
		{
			throw new RequestMethodNotSupportedException(request.getMethod(), e);
		}
		catch (final ODataUnsupportedMediaTypeException e)
		{
			throw new ContentTypeNotSupportedException(request.getContentType(), e);
		}
		catch (final ODataException e)
		{
			throw new PathInfoInvalidException(request.getRequestURI(), e);
		}
		catch (final IOException e)
		{
			throw new IllegalArgumentException("Unable to process request content", e);
		}
	}

	/**
	 * Translates the name of the HttpServletRequest method into a ODataHttpMethod
	 *
	 * @param method - httpServletRequestMethod
	 * @return - equivalent ODataHttpMethod that has a name equal to the method String parameter.
	 */
	protected ODataHttpMethod convertStringToODataHttpMethod(final String method)
	{
		return ODataHttpMethod.valueOf(method);
	}

	protected String extractContentType(final HttpServletRequest req) throws ODataUnsupportedMediaTypeException
	{
		return RestUtil.extractRequestContentType(req.getContentType()).toContentTypeString();
	}

	protected PathInfo extractPathInfo(final HttpServletRequest req) throws ODataException
	{
		// Setting the pathSplit to 1 so the service path parameter of the URL is considered
		// part of the "preceding path segment" and only $metadata is a path segment
		return RestUtil.buildODataPathInfo(req, 1);
	}

	protected Map<String, List<String>> extractQueryParametersNoFormEncoding(final HttpServletRequest req)
	{
		final boolean requestsMetadata = req.getRequestURI().contains(METADATA_PATH);
		return RestUtil.extractAllQueryParameters(req.getQueryString(), String.valueOf(!requestsMetadata));
	}

	protected List<Locale> extractAcceptLanguageHeader(final HttpServletRequest req)
	{
		return extractLanguages(req.getHeader(HttpHeaders.ACCEPT_LANGUAGE));
	}

	protected List<String> extractAcceptHeader(final HttpServletRequest req)
	{
		return RestUtil.extractAcceptHeaders(req.getHeader(HttpHeaders.ACCEPT));
	}

	private List<Locale> extractLanguages(final String languages)
	{
		return StringUtils.isBlank(languages) ? new ArrayList<>() : createLocales(languages);
	}

	private List<Locale> createLocales(final String languages)
	{
		final List<String> list = Arrays.asList(languages.split(",\\s*"));
		try
		{
			return list.stream().map(this::createLocale).collect(Collectors.toList());
		}
		catch (final IllformedLocaleException e)
		{
			LOGGER.trace("An exception occurred while creating locales", e);
			return new ArrayList<>();
		}
	}

	private Locale createLocale(final String language)
	{
		final String[] languageRegion = language.split("[_-]");
		final Locale.Builder builder = new Locale.Builder();
		builder.setLanguage(languageRegion[0]);
		if (languageRegion.length > 1)
		{
			builder.setRegion(languageRegion[1]);
		}
		return builder.build();
	}
}
