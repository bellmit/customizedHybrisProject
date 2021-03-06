/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.xyformsfacades.strategy.preprocessor;

import de.hybris.platform.xyformsfacades.form.YFormFacade;
import de.hybris.platform.xyformsservices.enums.YFormDataActionEnum;
import de.hybris.platform.xyformsservices.enums.YFormDataTypeEnum;
import de.hybris.platform.xyformsservices.exception.YFormServiceException;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;


/**
 * Before a form is sent to the browser a transformation can be applied to it.
 */
public abstract class TransformerYFormPreprocessorStrategy implements YFormPreprocessorStrategy
{
	@Resource(name = "yFormFacade")
	private YFormFacade yformFacade;

	/**
	 * Applies the actual transformation to a formData
	 *
	 * @param xmlContent
	 * @param params
	 * @throws YFormProcessorException
	 */
	protected abstract String transform(final String xmlContent, final Map<String, Object> params) throws YFormProcessorException;

	/**
	 * The algorithm is as follows:
	 * <ul>
	 * <li>It gets the content for a given formDataId</li>
	 * <li>Applies the transformation</li>
	 * <li>Creates a DRAFT record for the given formDataId</li>
	 * <li>If action is NEW, the formDataId should not exist.</li>
	 * </ul>
	 */
	@Override
	public void process(final String applicationId, final String formId, final YFormDataActionEnum action, final String formDataId)
			throws YFormServiceException, YFormProcessorException
	{
		process(applicationId, formId, action, formDataId, new HashMap<String, Object>());
	}

	/**
	 * The algorithm is as follows:
	 * <ul>
	 * <li>It gets the content for a given formDataId</li>
	 * <li>Applies the transformation</li>
	 * <li>Creates a DRAFT record for the given formDataId</li>
	 * <li>If action is NEW, the formDataId should not exist.</li>
	 * </ul>
	 */
	@Override
	public void process(final String applicationId, final String formId, final YFormDataActionEnum action, final String formDataId,
			final Map<String, Object> params) throws YFormServiceException, YFormProcessorException
	{
		validate(applicationId, formId, action, formDataId, params);

		final String content = this.getFormDataContent(applicationId, formId, formDataId, params);

		final String newContent = transform(content, params);

		this.save(applicationId, formId, formDataId, newContent, params);
	}

	protected void validate(final String applicationId, final String formId, final YFormDataActionEnum action,
			final String formDataId, final Map<String, Object> params) throws YFormServiceException
	{
		if (StringUtils.isEmpty(applicationId) || StringUtils.isEmpty(formId))
		{
			throw new YFormServiceException("neither applicationId nor formId can be null");
		}

		if (YFormDataActionEnum.EDIT.equals(action) || YFormDataActionEnum.VIEW.equals(action))
		{
			if (StringUtils.isEmpty(formDataId))
			{
				throw new YFormServiceException("for action EDIT and VIEW an already existing formDataId must be provided");
			}
		}
		else if (YFormDataActionEnum.NEW.equals(action))
		{
			if (StringUtils.isEmpty(formDataId))
			{
				throw new YFormServiceException("for action NEW an unused formDataId must be provided");
			}
		}
		else
		{
			throw new YFormServiceException("action cannot be a null value");
		}
	}

	protected String getFormDataContent(final String applicationId, final String formId, final String formDataId,
			final Map<String, Object> params) throws YFormServiceException
	{
		return yformFacade.getFormDataContent(applicationId, formId, formDataId);
	}

	protected void save(final String applicationId, final String formId, final String formDataId, final String content,
			final Map<String, Object> params) throws YFormServiceException
	{
		// We create or update always a DRAFT record, which is the one orbeon is going to pick up.

		// WARNING: this approach could fail if two or more users are trying to modify the *same* form at the *same*
		// time with different values.

		yformFacade.createOrUpdateYFormData(applicationId, formId, formDataId, YFormDataTypeEnum.DRAFT, content);
	}

	/**
	 * @return the yformFacade
	 */
	public YFormFacade getYFormFacade()
	{
		return yformFacade;
	}

	/**
	 * @param yformFacade
	 *           the yformFacade to set
	 */
	public void setYFormFacade(final YFormFacade yformFacade)
	{
		this.yformFacade = yformFacade;
	}
}