/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import * as angular from 'angular';
import * as lo from 'lodash';
import {pageDeletionEvictionTag, pageRestoredEvictionTag, rarelyChangingContent, Cached, CrossFrameEventService, IAlertService, IBaseCatalog, ICatalogService, ICatalogVersion, IExperience, IPageInfoService, IRestService, IRestServiceFactory, ISharedDataService, IUriContext, IWaitDialogService, Page, SeInjectable, SystemEventService, TypedMap, ValidationError} from 'smarteditcommons';
import {ICMSPage} from 'cmscommons/dtos/ICMSPage';

import {PageRestoreModalService} from './pageRestore/PageRestoreModalService';
import {PageRestoredAlertService} from '../actionableAlert';
import {HomepageService, HomepageType} from '../pageDisplayConditions/HomepageService';
import {WorkflowService} from 'cmssmarteditcontainer/components/workflow/services/WorkflowService';

/**
 * @ngdoc service
 * @name cmsSmarteditServicesModule.service:ManagePageService
 * 
 * @description
 * This service is used to manage a page.
 */
@SeInjectable()
export class ManagePageService {

	private resourcePageOperationsURI: string;
	private pageOperationsRESTService: IRestService<any>;

	constructor(
		private $location: ng.ILocationService,
		private $log: angular.ILogService,
		private $q: angular.IQService,
		private alertService: IAlertService,
		private cmsitemsRestService: any,
		private systemEventService: SystemEventService,
		private crossFrameEventService: CrossFrameEventService,
		private pageInfoService: IPageInfoService,
		private confirmationModalService: any,
		private pagesVariationsRestService: any,
		private waitDialogService: IWaitDialogService,
		private pageRestoreModalService: PageRestoreModalService,
		private pageRestoredAlertService: PageRestoredAlertService,
		private homepageService: HomepageService,
		private workflowService: WorkflowService,
		private catalogService: ICatalogService,
		private restServiceFactory: IRestServiceFactory,
		private sharedDataService: ISharedDataService,
		private catalogVersionRestService: any,
		private lodash: lo.LoDashStatic,
		private EVENTS: TypedMap<string>,
		private EVENT_CONTENT_CATALOG_UPDATE: string,
		private PAGE_CONTEXT_SITE_ID: string,
		private PAGE_CONTEXT_CATALOG: string
	) {
		this.resourcePageOperationsURI = `/cmssmarteditwebservices/v1/sites/${this.PAGE_CONTEXT_SITE_ID}/catalogs/${this.PAGE_CONTEXT_CATALOG}/pages/:pageId/operations`;
	}

	// ------------------------------------------------------------------------
	// Service Methods
	// ------------------------------------------------------------------------

    /** 
     * @ngdoc method
     * @name cmsSmarteditServicesModule.service:ManagePageService#softDeletePage
     * @methodOf cmsSmarteditServicesModule.service:ManagePageService
     *
     * @description
     * This method triggers the soft deletion of a CMS page.
     *
     * @param {Object} pageInfo The page object containing the uuid and the name of the page to be deleted.
     * @param {Object} uriContext A {@link resourceLocationsModule.object:UriContext uriContext}
     */
	softDeletePage(pageInfo: ICMSPage, uriContext: IUriContext): angular.IPromise<any> {

		const _pageInfo: any = this.lodash.cloneDeep(pageInfo);

		const builtURIContext: IUriContext = {
			catalogId: uriContext.CURRENT_CONTEXT_CATALOG,
			catalogVersion: uriContext.CURRENT_CONTEXT_CATALOG_VERSION,
			siteId: uriContext.CURRENT_CONTEXT_SITE_ID
		};

		return this.getConfirmationModalDescription(_pageInfo, uriContext).then((confirmationModalDescription) => {
			return this.confirmationModalService.confirm({
				description: confirmationModalDescription,
				descriptionPlaceholders: {
					pageName: pageInfo.name
				},
				title: "se.cms.actionitem.page.trash.confirmation.title"
			}).then(() => {

				_pageInfo.identifier = pageInfo.uuid;
				_pageInfo.pageStatus = "DELETED";

				return this.cmsitemsRestService.update(_pageInfo).then(() => {
					this.crossFrameEventService.publish(this.EVENTS.PAGE_DELETED);
					this.alertService.showSuccess({
						message: "se.cms.actionitem.page.trash.alert.success.description",
						messagePlaceholders: {
							pageName: pageInfo.name
						}
					});

					this.$location.path("/pages/:siteId/:catalogId/:catalogVersion"
						.replace(":siteId", builtURIContext.siteId)
						.replace(":catalogId", builtURIContext.catalogId)
						.replace(":catalogVersion", builtURIContext.catalogVersion));

				});
			});
		});
	}

    /** 
     * @ngdoc method
     * @name cmsSmarteditServicesModule.service:ManagePageService#hardDeletePage
     * @methodOf cmsSmarteditServicesModule.service:ManagePageService
     *
     * @description
     * This method triggers the permanent deletion of a CMS page.
     * 
     * @param {Object} pageInfo The page object containing the uuid and the name of the page to be deleted.
     */
	hardDeletePage(pageInfo: ICMSPage): angular.IPromise<void> {
		return this.confirmationModalService.confirm({
			title: "se.cms.actionitem.page.permanently.delete.confirmation.title",
			description: "se.cms.actionitem.page.permanently.delete.confirmation.description",
			descriptionPlaceholders: {
				pageName: pageInfo.name
			}
		}).then(() => {
			return this.cmsitemsRestService.delete(pageInfo.uuid).then((response: void) => {
				this.alertService.showSuccess('se.cms.page.permanently.delete.alert.success');
				this.systemEventService.publishAsync(this.EVENT_CONTENT_CATALOG_UPDATE, response);
				this.crossFrameEventService.publish(this.EVENTS.PAGE_DELETED);
			});
		});
	}

    /** 
     * @ngdoc method
     * @name cmsSmarteditServicesModule.service:ManagePageService#restorePage
     * @methodOf cmsSmarteditServicesModule.service:ManagePageService
     *
     * @description
     *  This method triggers the restoration a CMS page. 
     * 
     * @param {Object} pageInfo The page object containing the uuid and the name of the page to be restored.
     */
	restorePage(pageInfo: ICMSPage): angular.IPromise<void> {
		const _pageInfo: any = this.lodash.cloneDeep(pageInfo);

		_pageInfo.pageStatus = 'ACTIVE';
		_pageInfo.identifier = pageInfo.uuid;

		this.waitDialogService.showWaitModal(null);

		return this.cmsitemsRestService.update(_pageInfo).then((response: any) => {
			// show success
			this.waitDialogService.hideWaitModal();
			this.systemEventService.publishAsync(this.EVENT_CONTENT_CATALOG_UPDATE, response);

			this.pageRestoredAlertService.displayPageRestoredSuccessAlert(_pageInfo);
			this.crossFrameEventService.publish(this.EVENTS.PAGE_RESTORED);
		}, (result: any) => {
			// failure
			const errors: ValidationError[] = result.data.errors;
			this.waitDialogService.hideWaitModal();
			this.pageRestoreModalService.handleRestoreValidationErrors(_pageInfo, errors);
		});
	}

	/**
	 * @ngdoc method
	 * @name cmsSmarteditServicesModule.service:ManagePageService#isPageTrashable
	 * @methodOf cmsSmarteditServicesModule.service:ManagePageService
	 *
	 * @description
	 * This method indicates whether the given page can be soft deleted.
	 * Only the following pages are eligible for soft deletion:
	 * 1. the variation pages 
	 * 2. the primary pages associated with no variation pages
	 * 3. the page is not in a workflow
	 *
	 * @param {ICMSPage} cmsPage The page content
	 * @returns {Promise} A promise resolved with a boolean indicating whether the selected page can be soft deleted.
	 */
	isPageTrashable(cmsPage: ICMSPage, uriContext: IUriContext): angular.IPromise<boolean> {
		const hasFallbackHomepageOrIsPrimaryWithoutVariationsPromise = this.homepageService.getHomepageType(cmsPage, uriContext).then((homepageType: HomepageType) => {
			if (homepageType !== null || cmsPage.homepage) {
				return this.homepageService.hasFallbackHomePage(uriContext);
			} else {
				return this.pagesVariationsRestService.getVariationsForPrimaryPageId(cmsPage.uid).then((variationPagesUids: string[]) => {
					return (variationPagesUids.length === 0);
				});
			}
		});

		const isInWorkflowPromise = this.workflowService.isPageInWorkflow(cmsPage);

		return this.$q.all([hasFallbackHomepageOrIsPrimaryWithoutVariationsPromise, isInWorkflowPromise]).then((result) => {
			return result[0] && !result[1];
		}, () => false);
	}

	/**
	 * Determines whether page can be cloned or not
	 *
	 * Checks if there is permission for given page in given catalog version to be cloned
	 * This method uses only "outer" parts for that check so there is no need for iframe to be available
	 *
	 * !NOTE: Logic here is very similar to logic used in RulesAndPermissionsRegistrationService where "se.cloneable.page" rule is registered. So if any changes are done here it should be considered to adjust those changes in mentioned service as well.
	 *
	 */
	public async isPageCloneable(pageUuid: string, catalogVersion: string): Promise<boolean> {
		const catalogDescriptor = ((await this.sharedDataService.get('experience')) as IExperience).catalogDescriptor;
		const pageUriContext = {
			CURRENT_CONTEXT_SITE_ID: catalogDescriptor.siteId,
			CURRENT_CONTEXT_CATALOG: catalogDescriptor.catalogId,
			CURRENT_CONTEXT_CATALOG_VERSION: catalogDescriptor.catalogVersion
		};

		const [catalogs, pageInfo, targets] = await Promise.all([
			this.catalogService.getContentCatalogsForSite(catalogDescriptor.siteId),
			this.cmsitemsRestService.getById(pageUuid),
			this.catalogVersionRestService.getCloneableTargets(pageUriContext)
		]);

		// Inspired by ExperienceServiceOuter#updateExperiencePageContext
		const pageContext: ICatalogVersion = catalogs
			// flattening versions
			.reduce(
				(acc: ICatalogVersion[], catalog: IBaseCatalog) => acc.concat(catalog.versions),
				[]
			)
			// finding demanded version
			.find((version: ICatalogVersion) => version.uuid === catalogVersion);

		if (pageContext && pageContext.active) {
			return (
				targets.versions.length > 0 &&
				pageInfo.defaultPage &&
				!pageInfo.copyToCatalogsDisabled
			);
		}

		return targets.versions.length > 0;
	}

    /**
     * @ngdoc method
     * @name cmsSmarteditServicesModule.service:ManagePageService#getSoftDeletedPagesCount
     * @methodOf cmsSmarteditServicesModule.service:ManagePageService
     *
     * @description
     * Get the number of soft deleted pages for the provided context.
     * 
     * @param {Object} uriContext A  {@link resourceLocationsModule.object:UriContext uriContext}
     * @returns {object} containing the total number of soft deleted pages
     */
	@Cached({actions: [rarelyChangingContent], tags: [pageDeletionEvictionTag, pageRestoredEvictionTag]})
	getSoftDeletedPagesCount(uriContext: IUriContext): angular.IPromise<number> {
		const requestParams = {
			pageSize: 10,
			currentPage: 0,
			typeCode: 'AbstractPage',
			itemSearchParams: 'pageStatus:deleted',
			catalogId: uriContext.CONTEXT_CATALOG,
			catalogVersion: uriContext.CONTEXT_CATALOG_VERSION
		};

		return this.cmsitemsRestService.get(requestParams).then((result: Page<ICMSPage>) => {
			return result.pagination.totalCount;
		});
	}

	/**
	 * @ngdoc method
	 * @name cmsSmarteditServicesModule.service:ManagePageService#getDisabledTrashTooltipMessage
	 * @methodOf cmsSmarteditServicesModule.service:ManagePageService
	 * 
	 * @description
	 * Get the disabled trash tooltip message.
	 * 
	 * @param {ICMSPage} cmsPage The page content
	 * @returns {Promise} A promise resolved with the disabled trash tooltip message
	 */
	getDisabledTrashTooltipMessage(pageInfo: ICMSPage, uriContext: IUriContext): angular.IPromise<string> {
		let translate: string = 'se.cms.tooltip.movetotrash';
		return this.workflowService.isPageInWorkflow(pageInfo).then((isPageInWorkflow) => {
			return this.homepageService.getHomepageType(pageInfo, uriContext).then((homepageType: HomepageType) => {
				if (homepageType === HomepageType.CURRENT) {
					translate = 'se.cms.tooltip.current.homepage.movetotrash';
				} else if (homepageType === HomepageType.OLD) {
					translate = 'se.cms.tooltip.old.homepage.movetotrash';
				} else if (isPageInWorkflow) {
					translate = 'se.cms.tooltip.page.in.workflow.movetotrash';
				}
				return this.$q.when(translate);
			});
		});
	}

	/**
	 * @ngdoc method
	 * @name cmsSmarteditServicesModule.service:ManagePageService#trashPageInActiveCatalogVersion
	 * @methodOf cmsSmarteditServicesModule.service:ManagePageService
	 * 
	 * @description
	 * Will trash the given page in the corresponding active catalog version.
	 * 
	 * @param {ICMSPage} cmsPage The page content
	 * @returns {Promise<void>} A promise resolved with the disabled trash tooltip message
	 */
	trashPageInActiveCatalogVersion(pageUid: string): angular.IPromise<void> {
		return this.catalogService.retrieveUriContext().then((uriContext: IUriContext) => {
			return this.catalogService.getContentCatalogActiveVersion(uriContext).then((activeVersion: string) => {
				return this.confirmationModalService.confirm({
					title: "se.cms.sync.page.status.confirm.title",
					description: "se.cms.sync.page.status.confirm.description",
					descriptionPlaceholders: {
						catalogVersion: activeVersion
					}
				}).then(() => {
					this.pageOperationsRESTService = this.restServiceFactory.get(this.resourcePageOperationsURI.replace(":pageId", pageUid));
					return this.pageOperationsRESTService.save({
						operation: "TRASH_PAGE",
						sourceCatalogVersion: uriContext.CURRENT_CONTEXT_CATALOG_VERSION,
						targetCatalogVersion: activeVersion
					}).then(() => {
						return this.alertService.showSuccess({
							message: "se.cms.sync.page.status.success.alert",
							messagePlaceholders: {
								pageId: pageUid,
								catalogVersion: activeVersion
							}
						});
					});
				});
			});
		});
	}

	// ------------------------------------------------------------------------
	// Internal Methods
	// ------------------------------------------------------------------------
	/**
	 * Returns appropriate confirmation message key for page deletion.
	 */
	private getConfirmationModalDescription(pageInfo: ICMSPage, uriContext: IUriContext): angular.IPromise<{}> {
		const deferred = this.$q.defer();
		this.pageInfoService.getPageUUID().then((pageUUID: string) => {
			if (pageUUID) {
				this.homepageService.getHomepageType(pageInfo, uriContext).then((homepageType: HomepageType) => {
					if (homepageType !== null || pageInfo.homepage) {
						deferred.resolve("se.cms.actionitem.page.trash.confirmation.description.storefront.homepage");
					} else {
						deferred.resolve("se.cms.actionitem.page.trash.confirmation.description.storefront");
					}
				});
			} else {
				this.$log.error('deletePageService::deletePage - pageUUID is undefined');
				deferred.reject();
			}
		}, () => {
			deferred.resolve("se.cms.actionitem.page.trash.confirmation.description.pagelist");
		});
		return deferred.promise;
	}
}