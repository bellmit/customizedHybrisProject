/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import * as angular from 'angular';
import * as lo from 'lodash';
import {
	catalogEvictionTag,
	rarelyChangingContent,
	Cached,
	ContentCatalogRestService,
	GatewayProxied,
	IBaseCatalog,
	IBaseCatalogs,
	IBaseCatalogVersion,
	ICatalog,
	ICatalogService,
	ICatalogVersion,
	ISharedDataService,
	ISite,
	IStorageService,
	IUriContext,
	IUrlService,
	ProductCatalogRestService,
	SeInjectable,
	TypedMap,
} from 'smarteditcommons';
import {SiteService} from 'smarteditcontainer/services';

/** @internal */
@GatewayProxied()
@SeInjectable()
export class CatalogService extends ICatalogService {
	private SELECTED_SITE_COOKIE_NAME = 'seselectedsite';
	constructor(
		private $q: angular.IQService,
		private $log: angular.ILogService,
		private lodash: lo.LoDashStatic,
		private sharedDataService: ISharedDataService,
		private siteService: SiteService,
		private urlService: IUrlService,
		private contentCatalogRestService: ContentCatalogRestService,
		private productCatalogRestService: ProductCatalogRestService,
		private CONTEXT_SITE_ID: string,
		private CONTEXT_CATALOG: string,
		private CONTEXT_CATALOG_VERSION: string,
		private storageService: IStorageService,
		EVENTS: TypedMap<string>) {

		super();

	}

	getContentCatalogsForSite(siteUID: string): angular.IPromise<IBaseCatalog[]> {
		return this.contentCatalogRestService.get({
			siteUID
		}).then((catalogs: IBaseCatalogs) => {
			return catalogs.catalogs;
		});
	}

	getCatalogByVersion(siteUID: string, catalogVersionName: string): angular.IPromise<IBaseCatalog[]> {
		return this.getContentCatalogsForSite(siteUID).then((catalogs: IBaseCatalog[]) => {
			return catalogs.filter((catalog) => {
				return catalog.versions.some((currentCatalogVersion: IBaseCatalogVersion) => {
					return currentCatalogVersion.version === catalogVersionName;
				});
			});
		});
	}

	isContentCatalogVersionNonActive(_uriContext?: IUriContext): angular.IPromise<boolean> {
		return this._getContext(_uriContext).then((uriContext: IUriContext) => {
			return this.getContentCatalogsForSite(uriContext[this.CONTEXT_SITE_ID]).then((catalogs) => {
				const currentCatalog = catalogs.find((catalog) => {
					return catalog.catalogId === uriContext[this.CONTEXT_CATALOG];
				});
				const currentCatalogVersion = (currentCatalog) ? currentCatalog.versions.find((catalogVersion) => {
					return catalogVersion.version === uriContext[this.CONTEXT_CATALOG_VERSION];
				}) : null;

				if (!currentCatalogVersion) {
					throw new Error(`Invalid uriContext ${uriContext}, cannot find catalog version.`);
				}

				return !currentCatalogVersion.active;
			});
		});
	}

	getContentCatalogActiveVersion(_uriContext?: IUriContext): angular.IPromise<string> {
		return this._getContext(_uriContext).then((uriContext: IUriContext) => {
			return this.getContentCatalogsForSite(uriContext[this.CONTEXT_SITE_ID]).then((catalogs) => {
				const currentCatalog = catalogs.find((catalog) => {
					return catalog.catalogId === uriContext[this.CONTEXT_CATALOG];
				});

				const activeCatalogVersion = currentCatalog ? currentCatalog.versions.find((catalogVersion) => {
					return catalogVersion.active;
				}) : null;

				if (!activeCatalogVersion) {
					throw new Error(`Invalid uriContext ${uriContext}, cannot find catalog version.`);
				}

				return activeCatalogVersion.version;
			});
		});
	}

	getActiveContentCatalogVersionByCatalogId(contentCatalogId: string): angular.IPromise<string> {
		return this._getContext().then((uriContext: IUriContext) => {
			return this.getContentCatalogsForSite(uriContext[this.CONTEXT_SITE_ID]).then((catalogs) => {
				const currentCatalog = catalogs.find((catalog) => {
					return catalog.catalogId === contentCatalogId;
				});

				const currentCatalogVersion = (currentCatalog) ? currentCatalog.versions.find((catalogVersion) => {
					return catalogVersion.active;
				}) : null;

				if (!currentCatalogVersion) {
					throw new Error(`Invalid content catalog ${contentCatalogId}, cannot find any active catalog version.`);
				}

				return currentCatalogVersion.version;
			});
		});
	}

	getContentCatalogVersion(_uriContext?: IUriContext): angular.IPromise<IBaseCatalogVersion> {
		return this._getContext(_uriContext).then((uriContext: IUriContext) => {
			return this.getContentCatalogsForSite(uriContext[this.CONTEXT_SITE_ID]).then((catalogs) => {
				const catalog = catalogs.find((c) => {
					return c.catalogId === uriContext[this.CONTEXT_CATALOG];
				});
				if (!catalog) {
					throw new Error("no catalog " + uriContext[this.CONTEXT_CATALOG] + " found for site " + uriContext[this.CONTEXT_SITE_ID]);
				}
				const catalogVersion = catalog.versions.find((version) => {
					return version.version === uriContext[this.CONTEXT_CATALOG_VERSION];
				});
				if (!catalogVersion) {
					throw new Error(`no catalogVersion ${uriContext[this.CONTEXT_CATALOG_VERSION]} for catalog ${uriContext[this.CONTEXT_CATALOG]} and site ${uriContext[this.CONTEXT_SITE_ID]}`);
				}
				catalogVersion.catalogName = catalog.name;
				catalogVersion.catalogId = catalog.catalogId;
				return catalogVersion;
			});
		});
	}

	getCurrentSiteID(): Promise<string> {
		return this.storageService.getValueFromLocalStorage(this.SELECTED_SITE_COOKIE_NAME, false);
	}

    /**
     * Finds the ID of the default site configured for the provided content catalog.
     * @param contentCatalogId The UID of content catalog for which to retrieve its default site ID.
     * @returns The ID of the default site found.
     */

	getDefaultSiteForContentCatalog(contentCatalogId: string): angular.IPromise<ISite> {
		return this.siteService.getSites().then((sites: ISite[]) => {
			const defaultSitesForCatalog = sites.filter((site) => {
				// ContentCatalogs in the site object are sorted. The last one is considered
				// the default one for a given site. 
				const siteDefaultContentCatalog = this.lodash.last(site.contentCatalogs);
				return siteDefaultContentCatalog && (siteDefaultContentCatalog === contentCatalogId);
			});

			if (defaultSitesForCatalog.length === 0) {
				this.$log.warn(`[catalogService] - No default site found for content catalog ${contentCatalogId}`);
			} else if (defaultSitesForCatalog.length > 1) {
				this.$log.warn(`[catalogService] - Many default sites found for content catalog ${contentCatalogId}`);
			}

			return defaultSitesForCatalog[0];
		});
	}

	getCatalogVersionByUuid(catalogVersionUuid: string, siteId?: string): angular.IPromise<ICatalogVersion> {
		return this.getAllContentCatalogsGroupedById().then((contentCatalogsGrouped: ICatalog[][]) => {
			const catalogs = this.lodash.reduce(contentCatalogsGrouped, (allCatalogs, siteCatalogs) => {
				return allCatalogs.concat(siteCatalogs);
			}, []);

			const catalogVersionFound = this.lodash.flatten(catalogs.map((catalog) => {
				return this.lodash.cloneDeep(catalog.versions).map((version: ICatalogVersion) => {
					version.catalogName = catalog.name;
					version.catalogId = catalog.catalogId;
					return version;
				});
			})).filter((version) => {
				return catalogVersionUuid === version.uuid && (!siteId || siteId === version.siteDescriptor.uid);
			})[0];

			if (!catalogVersionFound) {
				const errorMessage = 'Cannot find catalog version with UUID ' + catalogVersionUuid + (siteId ? ' in site ' + siteId : '');
				throw new Error(errorMessage);
			}

			return this.getCurrentSiteID().then((defaultSiteID) => {
				catalogVersionFound.siteId = defaultSiteID;
				return catalogVersionFound;
			});
		});
	}

	getAllContentCatalogsGroupedById(): angular.IPromise<ICatalog[][]> {
		return this.siteService.getSites().then((sites: ISite[]) => {
			const promisesToResolve = sites.map((site: ISite) => {
				return this.getContentCatalogsForSite(site.uid).then((catalogs: ICatalog[]) => {
					catalogs.forEach((catalog) => {
						catalog.versions = catalog.versions.map((catalogVersion: ICatalogVersion) => {
							catalogVersion.siteDescriptor = site;
							return catalogVersion;
						});
					});

					return catalogs;
				});
			});

			return this.$q.all(promisesToResolve);
		});
	}

	getProductCatalogsBySiteKey(siteUIDKey: string): angular.IPromise<IBaseCatalog[]> {
		return this._getContext().then((uriContext: IUriContext) => {
			return this.getProductCatalogsForSite(uriContext[siteUIDKey]);
		});
	}

    /* =====================================================================================================================
      * `getProductCatalogsBySite` is to get product catalogs by site value
      * `siteUIDValue` - is the site value rather than site key
      * if you want to get product catalogs by site key, please refer to function `getProductCatalogsBySiteKey`
       =====================================================================================================================
    */
	@Cached({actions: [rarelyChangingContent], tags: [catalogEvictionTag]})
	getProductCatalogsForSite(siteUIDValue: string): angular.IPromise<IBaseCatalog[]> {
		return this.productCatalogRestService.get({
			siteUID: siteUIDValue
		}).then((catalogs: IBaseCatalogs) => {
			return catalogs.catalogs;
		});
	}

	getActiveProductCatalogVersionByCatalogId(productCatalogId: string): angular.IPromise<string> {
		return this.getProductCatalogsBySiteKey(this.CONTEXT_SITE_ID).then((catalogs) => {
			const currentCatalog = catalogs.find((catalog) => {
				return catalog.catalogId === productCatalogId;
			});

			const currentCatalogVersion = (currentCatalog) ? currentCatalog.versions.find((catalogVersion) => {
				return catalogVersion.active;
			}) : null;

			if (!currentCatalogVersion) {
				throw new Error(`Invalid product catalog ${productCatalogId}, cannot find any active catalog version.`);
			}

			return currentCatalogVersion.version;
		});
	}

	// =====================================================================================================================
	//  Helper Methods
	// =====================================================================================================================

	getCatalogVersionUUid(_uriContext?: IUriContext): angular.IPromise<string> {
		return this.getContentCatalogVersion(_uriContext).then((catalogVersion) => {
			return catalogVersion.uuid;
		});
	}

	retrieveUriContext(_uriContext?: IUriContext): angular.IPromise<IUriContext> {
		return this._getContext(_uriContext);
	}

	returnActiveCatalogVersionUIDs(catalogs: ICatalog[]): string[] {
		return catalogs.reduce((accumulator, catalog) => {
			accumulator.push(catalog.versions.find((version) => {
				return version.active;
			}).uuid);
			return accumulator;
		}, []);
	}

	private _getContext(_uriContext?: IUriContext): angular.IPromise<IUriContext> {
		// TODO: once refactored by Nick, use definition of experience
		return _uriContext ? this.$q.when(_uriContext) : this.sharedDataService.get('experience').then((experience: any) => {
			if (!experience) {
				throw new Error("catalogService was not provided with a uriContext and could not retrive an experience from sharedDataService");
			}
			return this.urlService.buildUriContext(experience.siteDescriptor.uid, experience.catalogDescriptor.catalogId, experience.catalogDescriptor.catalogVersion);
		});
	}

}