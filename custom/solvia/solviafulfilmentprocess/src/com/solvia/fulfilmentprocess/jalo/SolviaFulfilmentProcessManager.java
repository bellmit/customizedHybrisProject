/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.solvia.fulfilmentprocess.constants.SolviaFulfilmentProcessConstants;

public class SolviaFulfilmentProcessManager extends GeneratedSolviaFulfilmentProcessManager
{
	public static final SolviaFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SolviaFulfilmentProcessManager) em.getExtension(SolviaFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
