/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {ICatalog, ICatalogVersion, SeComponent} from "smarteditcommons";

/**
 * @ngdoc directive
 * @name CatalogDetailsModule.component:catalogDetails
 * @scope
 * @restrict E
 * @element catalog-details
 *
 * @description
 * Component responsible for displaying a catalog details. It contains a thumbnail representing the whole
 * catalog and the list of catalog versions available to the current user.
 *
 * This component is currently used in the landing page.
 *
 * @param {< String} ICatalog The catalog that needs to be displayed
 * @param {< Boolean} isCatalogForCurrentSite A flag that specifies if the provided catalog is associated with the selected site in the landing page
 * @param {< String} siteId current selected site uid 
 */
@SeComponent({
	templateUrl: 'catalogDetailsComponentTemplate.html',
	inputs: [
		'catalog',
		'isCatalogForCurrentSite',
		'siteId'
	]
})
export class CatalogDetailsComponent {

	public catalog: ICatalog;
	public isCatalogForCurrentSite: boolean;
	public siteId: string;
	public activeCatalogVersion: ICatalogVersion;
	public siteIdForCatalog: string;
	public sortedCatalogVersions: ICatalogVersion[];
	public collapsibleConfiguration: {expandedByDefault: boolean};
	public cataloDeviderImage: 'static-resources/images/icon_catalog_arrow.png';

	$onInit() {
		this.activeCatalogVersion = this.catalog.versions.find((catalogVersion) => catalogVersion.active);
		this.siteIdForCatalog = this.siteId;
		this.sortedCatalogVersions = this.getSortedCatalogVersions();
		this.collapsibleConfiguration = {
			expandedByDefault: this.isCatalogForCurrentSite
		};
	}

	private getSortedCatalogVersions() {
		const sortedCatalogVersions = [];
		sortedCatalogVersions.push(this.activeCatalogVersion);

		return sortedCatalogVersions.concat(this.catalog.versions.filter((catalogVersion) => {
			return !catalogVersion.active;
		}));
	}
}
