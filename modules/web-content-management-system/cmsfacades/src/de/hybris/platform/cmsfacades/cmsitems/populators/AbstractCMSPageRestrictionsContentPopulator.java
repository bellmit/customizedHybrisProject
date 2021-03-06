/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cmsfacades.cmsitems.populators;


import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.restrictions.AbstractRestrictionModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.List;
import java.util.Map;

/***
 * Default implementation to populate restrictions in a page. 
 */
public class AbstractCMSPageRestrictionsContentPopulator implements Populator<Map<String, Object>, AbstractPageModel>
{

    @Override
    public void populate(Map<String, Object> source, AbstractPageModel pageModel) throws ConversionException
    {
        if (pageModel == null)
        {
            throw new ConversionException("Item Model used in the populator should not be null.");
        }
        if (source == null)
        {
            throw new ConversionException("Source map used in the populator should not be null.");
        }

        List<AbstractRestrictionModel> restrictions = pageModel.getRestrictions();

        if (restrictions != null)
        {
            restrictions.stream()
                  .filter(restriction -> !restriction.getPages().contains(pageModel))
                  .forEach(restriction -> restriction.getPages().add(pageModel));
        }
    }
}
