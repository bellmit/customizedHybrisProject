/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */

package de.hybris.platform.kymaintegrationservices.event;

import de.hybris.platform.servicelayer.event.ClusterAwareEvent;
import de.hybris.platform.servicelayer.event.PublishEventContext;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;


/**
 * Event for Credentials invalidation in @{@link de.hybris.platform.kymaintegrationservices.utils.RestTemplateWrapper}
 */
public class InvalidateCertificateCredentialsCacheEvent extends AbstractEvent implements ClusterAwareEvent
{
    private String consumedCertificateCredentialId;

    public InvalidateCertificateCredentialsCacheEvent(final String certificateCredentialModelId)
    {
        this.consumedCertificateCredentialId = certificateCredentialModelId;
    }

    @Override
    public boolean canPublish(final PublishEventContext publishEventContext)
    {
        return true;
    }

    public String getConsumedCertificateCredentialId()
    {
        return consumedCertificateCredentialId;
    }

    public void setConsumedCertificateCredentialId(String consumedCertificateCredentialId)
    {
        this.consumedCertificateCredentialId = consumedCertificateCredentialId;
    }
}
