/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {CMSPageTypes} from 'cmscommons';

describe('displayConditionsFacade', () => {
	const MOCK_PAGE = {
		uid: 'somePageUid',
		name: 'Some Page Name',
		typeCode: 'somePageTypeCode',
		label: 'some-page-label',
	};

	const MOCK_VARIATION_PAGES = [
		{
			uid: 'someVariationPageId',
			name: 'Some Variation Page Name',
			creationtime: '2016-07-07T14:33:37Z',
		},
		{
			uid: 'someOtherVariationPageId',
			name: 'Some Other Variation Page Name',
			creationtime: '2016-07-08T14:33:37Z',
		},
	];

	const MOCK_SELECT_ITEM = {
		id: MOCK_PAGE.uid,
		label: MOCK_PAGE.name,
	};

	let mocks: any;
	let resource: any;
	let service: any;
	let $q: angular.IQService;

	beforeEach(() => {
		resource = jasmine.createSpyObj('resource', ['get']);
		const harness = AngularUnitTestHelper.prepareModule(
			'displayConditionsFacadeModule'
		)
			.mock(
				'pageDisplayConditionsService',
				'getPageDisplayConditionsDescriptionI18nKeyForPageId'
			)
			.and.returnValue(resource)
			.mock(
				'pageDisplayConditionsService',
				'getPageDisplayConditionsValueForPageId'
			)
			.and.returnValue(resource)
			.mock('pageRestrictionsService', 'getPageRestrictionsCountForPageUID')
			.mock('pageService', 'getPageById')
			.and.returnValue(resource)
			.mock('pageService', 'getVariationPages')
			.mock('pageService', 'getPrimaryPage')
			.and.returnValue(resource)
			.mock('pageService', 'isPagePrimary')
			.and.returnValue(resource)
			.mock('pageService', 'updatePageById')
			.mock('pageService', 'getPaginatedPrimaryPagesForPageType')
			.mock('$log', 'warn')
			.service('displayConditionsFacade');
		service = harness.service;
		mocks = harness.mocks;
		$q = harness.injected.$q;
	});

	describe('getPageInfoForPageUid', () => {
		beforeEach(() => {
			mocks.pageService.getPageById.and.returnValue($q.when(MOCK_PAGE));
			mocks.pageService.isPagePrimary.and.returnValue($q.when(true));
		});

		it('should retrieve the page name, type code, and whether or not the page is primary', () => {
			expect(service.getPageInfoForPageUid('somePageUid')).toBeResolvedWithData(
				{
					pageName: 'Some Page Name',
					pageType: 'somePageTypeCode',
					isPrimary: true,
				}
			);
		});
	});

	describe('getVariationsForPageUid', () => {
		it('will return a promise resolving to an empty array if no variations are found', () => {
			mocks.pageService.getVariationPages.and.returnValue($q.when([]));
			expect(
				service.getVariationsForPageUid('somePageUid')
			).toBeResolvedWithData([]);
		});

		it('will return a list of variation pages, each of which having a page name, creation date, and number of restrictions', () => {
			mocks.pageService.getVariationPages.and.returnValue(
				$q.when(MOCK_VARIATION_PAGES)
			);
			mocks.pageRestrictionsService.getPageRestrictionsCountForPageUID.and.callFake(
				function(pageUid: string) {
					if (pageUid === 'someVariationPageId') {
						return $q.when(1);
					} else {
						return $q.when(2);
					}
				}
			);

			expect(
				service.getVariationsForPageUid('somePageUid')
			).toBeResolvedWithData([
				{
					pageName: 'Some Variation Page Name',
					creationDate: '2016-07-07T14:33:37Z',
					restrictions: 1,
				},
				{
					pageName: 'Some Other Variation Page Name',
					creationDate: '2016-07-08T14:33:37Z',
					restrictions: 2,
				},
			]);
		});
	});

	describe('getPrimaryPageForVariationPage', () => {
		beforeEach(() => {
			mocks.pageService.getPrimaryPage.and.returnValue($q.when(MOCK_PAGE));
		});

		it('should return the primary page uid, label, and name', () => {
			expect(
				service.getPrimaryPageForVariationPage('someVariationPageUid')
			).toBeResolvedWithData({
				uid: 'somePageUid',
				name: 'Some Page Name',
				label: 'some-page-label',
			});
		});
	});

	describe('updatePage', () => {
		it('should delegate to the pageService to update the page', () => {
			service.updatePage('somePageUid', {});
			expect(mocks.pageService.updatePageById).toHaveBeenCalledWith(
				'somePageUid',
				{}
			);
		});
	});

	describe('isPagePrimary', () => {
		it('should delegate the call to the pageService', () => {
			service.isPagePrimary('somePageId');
			expect(mocks.pageService.isPagePrimary).toHaveBeenCalledWith(
				'somePageId'
			);
		});
	});

	describe('getPrimaryPagesForPageType', () => {
		it('WHEN is called THEN it returns paginated list of primary pages as Select Items for the given page type', () => {
			const PAGE_TYPE = CMSPageTypes.CategoryPage;
			const URI_CONTEXT = {
				siteUID: 'mySite',
				catalogId: 'myCatalog',
				catalogVersion: 'myCatalogVersion',
			};

			mocks.pageService.getPaginatedPrimaryPagesForPageType.and.returnValue(
				$q.when({
					response: [MOCK_PAGE],
				})
			);

			expect(
				service.getPrimaryPagesForPageType(PAGE_TYPE, URI_CONTEXT)
			).toBeResolvedWithData({
				results: [MOCK_SELECT_ITEM]
			});
		});
	});
});
