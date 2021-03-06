/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsfacades.cmsitems.populators;

import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;
import de.hybris.platform.cms2.model.restrictions.AbstractRestrictionModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.List;
import java.util.Map;

/***
 * Default implementation to populate restrictions in a CMS Component. 
 */
public class AbstractCMSComponentRestrictionsContentPopulator implements Populator<Map<String, Object>, AbstractCMSComponentModel>
{

    @Override
    public void populate(Map<String, Object> source, AbstractCMSComponentModel componentModel) throws ConversionException
    {
        if (componentModel == null)
        {
            throw new ConversionException("Component Model used in the populator should not be null.");
        }
        if (source == null)
        {
            throw new ConversionException("Source map used in the populator should not be null.");
        }

        List<AbstractRestrictionModel> restrictions = componentModel.getRestrictions();

        if (restrictions != null)
        {
            restrictions.stream()
                  .filter(restriction -> !restriction.getComponents().contains(componentModel))
                  .forEach(restriction -> restriction.getComponents().add(componentModel));
        }
    }
}
