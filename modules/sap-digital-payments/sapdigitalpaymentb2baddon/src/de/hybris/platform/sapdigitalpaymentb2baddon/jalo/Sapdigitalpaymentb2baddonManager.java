/*
 *  
 * [y] hybris Platform
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sapdigitalpaymentb2baddon.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.sapdigitalpaymentb2baddon.constants.Sapdigitalpaymentb2baddonConstants;
import org.apache.log4j.Logger;

public class Sapdigitalpaymentb2baddonManager extends GeneratedSapdigitalpaymentb2baddonManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Sapdigitalpaymentb2baddonManager.class.getName() );
	
	public static final Sapdigitalpaymentb2baddonManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Sapdigitalpaymentb2baddonManager) em.getExtension(Sapdigitalpaymentb2baddonConstants.EXTENSIONNAME);
	}
	
}
