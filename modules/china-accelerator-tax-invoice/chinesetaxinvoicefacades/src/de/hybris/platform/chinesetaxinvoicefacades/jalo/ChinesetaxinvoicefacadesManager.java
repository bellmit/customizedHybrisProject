/*
 *  
 * [y] hybris Platform
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.chinesetaxinvoicefacades.jalo;

import de.hybris.platform.chinesetaxinvoicefacades.constants.ChinesetaxinvoicefacadesConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

public class ChinesetaxinvoicefacadesManager extends GeneratedChinesetaxinvoicefacadesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( ChinesetaxinvoicefacadesManager.class.getName() );
	
	public static final ChinesetaxinvoicefacadesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ChinesetaxinvoicefacadesManager) em.getExtension(ChinesetaxinvoicefacadesConstants.EXTENSIONNAME);
	}
	
}
