/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.b2b.dao;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.workflow.enums.WorkflowActionStatus;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import java.util.Collection;


/**
 * The Interface B2BWorflowActionDao.
 * 
 * @spring.bean b2bWorflowActionDao
 */
public interface B2BWorflowActionDao
{

	/**
	 * @deprecated As of hybris 4.4, replaced by {@link #findWorkflowActionByCode(String)}
	 */
	@Deprecated(since = "4.4")
	WorkflowActionModel getWorkflowActionByCode(final String code);

	/**
	 * Get the WorkFlowAction from its code.
	 * 
	 * @param code
	 *           the code of the WorkFlowAction
	 * @return WorkflowActionModel
	 * @deprecated Since 4.4. Use
	 *             {@link de.hybris.platform.workflow.WorkflowActionService#getActionForCode(de.hybris.platform.workflow.model.WorkflowModel, String)}
	 */
	@Deprecated(since = "4.4")
	WorkflowActionModel findWorkflowActionByCode(final String code);

	/**
	 * Finds a work flow action with a particular workflowaction status by user.
	 * 
	 * @param status
	 *           the status of the workflow
	 * @param user
	 *           the user
	 * @return WorkflowActionModel
	 * @deprecated Since 4.4. Use
	 *             {@link #findWorkflowActionsByUserActionCodeAndStatus(de.hybris.platform.workflow.enums.WorkflowActionStatus, String, de.hybris.platform.core.model.user.UserModel)}
	 */
	@Deprecated(since = "4.4")
	Collection<WorkflowActionModel> findActionByUserAndStatus(final WorkflowActionStatus status, final UserModel user);

	/**
	 * Finds a work flow action with a particular workflowaction status, user and template qualifier
	 */
	Collection<WorkflowActionModel> findWorkflowActionsByUserActionCodeAndStatus(final WorkflowActionStatus status,
			final String qualifier, final UserModel user);

	/**
	 * Find all the workflow actions for given user
	 */
	Collection<WorkflowActionModel> findWorkflowActionsByUser(UserModel user);

}
