package de.hybris.platform.catalog.interceptors;

import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;

public class BackofficeCatalogVersionPrepareInterceptor extends CatalogVersionPrepareInterceptor
{
    @Override
    protected void assignCurrentUserReadWritePermissions(final CatalogVersionModel catalogVersion, final InterceptorContext ctx)
    {
        if (ctx.isNew(catalogVersion))
        {
            super.assignCurrentUserReadWritePermissions(catalogVersion, ctx);
        }
    }
}
