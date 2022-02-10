/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.solvia.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.solvia.core.constants.SolviaCoreConstants;
import com.solvia.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class SolviaCoreManager extends GeneratedSolviaCoreManager
{
	public static final SolviaCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SolviaCoreManager) em.getExtension(SolviaCoreConstants.EXTENSIONNAME);
	}
}
