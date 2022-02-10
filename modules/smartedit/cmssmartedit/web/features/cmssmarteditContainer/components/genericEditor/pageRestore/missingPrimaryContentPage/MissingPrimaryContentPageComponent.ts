/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {ISeComponent, Page as SePage, SelectItem, SeComponent} from 'smarteditcommons';
import {CMSItem, ICMSPage, IPageService} from 'cmscommons';

@SeComponent({
	templateUrl: 'missingPrimaryContentPageTemplate.html',
	inputs: ['model'],
})
export class MissingPrimaryContentPageComponent implements ISeComponent {
	public model: ICMSPage;

	// ------------------------------------------------------------------------
	// Variables
	// ------------------------------------------------------------------------
	public fetchStrategy = {
		fetchEntity: () => this.fetchEntity(),
		fetchPage: (search: string, pageSize: number, currentPage: number) =>
			this.fetchPage(search, pageSize, currentPage),
	};

	// ------------------------------------------------------------------------
	// Constants
	// ------------------------------------------------------------------------
	private readonly CONTENT_PAGE_TYPE_CODE = 'ContentPage';

	// ------------------------------------------------------------------------
	// Constructor
	// ------------------------------------------------------------------------
	constructor(
		private pageService: IPageService,
		private $log: angular.ILogService,
		private $q: angular.IQService
	) {}

	// ------------------------------------------------------------------------
	// Helper Methods
	// ------------------------------------------------------------------------

	private fetchEntity(): angular.IPromise<SelectItem> {
		return this.$q.resolve(this.getSelectItemFromPrimaryPage(this.model));
	}

	private fetchPage(
		search: string,
		pageSize: number,
		currentPage: number
	): angular.IPromise<SePage<SelectItem>> {
		return this.pageService
			.getPaginatedPrimaryPagesForPageType(this.CONTENT_PAGE_TYPE_CODE, null, {
				search,
				pageSize,
				currentPage,
			})
			.then((page) => {
				const targetPage: SePage<SelectItem> = {
					pagination: page.pagination,
					results: null,
				};
				targetPage.results = page.response.map((rawPage) =>
					this.getSelectItemFromPrimaryPage(rawPage)
				);
				return targetPage;
			})
			.catch((error) => {
				this.$log.warn(
					'[MissingPrimaryContentPageComponent] - Cannot retrieve list of alternative content primary pages. ',
					error
				);
				return undefined;
			});
	}

	private getSelectItemFromPrimaryPage(page: CMSItem): SelectItem {
		return {
			id: page.label as string,
			label: page.name,
		};
	}
}
