/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsfacades.cmsitems.populators;

import static de.hybris.platform.cmsfacades.constants.CmsfacadesConstants.*;

import de.hybris.platform.cms2.cloning.service.predicate.CMSItemCloneablePredicate;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.Map;

import org.springframework.beans.factory.annotation.Required;

/**
 * Populator that verifies that the ItemModel is cloneable and prepares the cloneable field
 */
public class CMSItemCloneableModelToDataAttributePopulator implements Populator<ItemModel, Map<String, Object>>
{
	private CMSItemCloneablePredicate cmsItemCloneablePredicate;
	
	@Override
	public void populate(final ItemModel itemModel, final Map<String, Object> itemMap) throws ConversionException
	{
		if (getCmsItemCloneablePredicate().test(itemModel))
		{
			itemMap.put(FIELD_CLONEABLE_NAME, true);
		}
		else
		{
			itemMap.put(FIELD_CLONEABLE_NAME, false);
		}
	}

	protected CMSItemCloneablePredicate getCmsItemCloneablePredicate()
	{
		return cmsItemCloneablePredicate;
	}

	@Required
	public void setCmsItemCloneablePredicate(final CMSItemCloneablePredicate cmsItemCloneablePredicate)
	{
		this.cmsItemCloneablePredicate = cmsItemCloneablePredicate;
	}
}
