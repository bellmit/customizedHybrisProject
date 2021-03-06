/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.productconfig.runtime.cps.client;

import com.hybris.charon.annotations.Control;
import com.hybris.charon.annotations.OAuth;


/**
 * Decorating the {@link KbDeterminationClientBase} with enforced authorization via OAuth.
 */
@OAuth
@Control(timeout = "${sapproductconfigruntimecps.charon.timeout:15000}")
public interface KbDeterminationClient extends KbDeterminationClientBase
{
	// empty - just to enfore authorization via OAuth
}
