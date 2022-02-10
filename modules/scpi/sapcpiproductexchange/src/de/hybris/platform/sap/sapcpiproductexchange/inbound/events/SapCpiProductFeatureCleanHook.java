/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.sapcpiproductexchange.inbound.events;

import de.hybris.platform.classification.ClassificationService;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.odata2services.odata.persistence.hook.PrePersistHook;
import java.util.Optional;

public class SapCpiProductFeatureCleanHook implements PrePersistHook
{
	@Override
	public Optional<ItemModel> execute(ItemModel item)
	{
		return Optional.empty();
	}

	protected ClassificationService getClassificationService()
	{
		//NO-OP
		//for maintenance branch compatibles change
		return null;
	}

	public void setClassificationService(final ClassificationService classificationService)
	{
		//NO-OP
		//for maintenance branch compatibles change
	}
}