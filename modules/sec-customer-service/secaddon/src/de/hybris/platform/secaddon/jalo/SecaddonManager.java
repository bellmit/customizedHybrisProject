/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.secaddon.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.secaddon.constants.SecaddonConstants;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class SecaddonManager extends GeneratedSecaddonManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( SecaddonManager.class.getName() );
	
	public static final SecaddonManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (SecaddonManager) em.getExtension(SecaddonConstants.EXTENSIONNAME);
	}
	
}
