/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {MultiNamePermissionContext, SeComponent} from "smarteditcommons";
import {ICMSPage} from "cmscommons";
import {ManagePageService} from 'cmssmarteditcontainer/services/pages/ManagePageService';

/**
 * @ngdoc directive
 * @name pageComponentsModule.directive:clonePageItem
 * @scope
 * @restrict E
 *
 * @description
 * clonePageItem builds an item allowing for the cloning of a given CMS
 * page.
 *
 * @param {< Object} pageInfo An object defining the context of the CMS
 * page associated to the clonePage item.
 */
@SeComponent({
	templateUrl: 'clonePageItemTemplate.html',
	inputs: ['pageInfo']
})
export class ClonePageItemComponent {

	// ------------------------------------------------------------------------
	//  Properties
	// ------------------------------------------------------------------------
	public pageInfo: ICMSPage;
	public clonePagePermission: MultiNamePermissionContext[];
	public isCloneable: boolean;

	constructor(
		private clonePageWizardService: any,
		private managePageService: ManagePageService
	) {}

	$onInit(): Promise<void> {
		this.clonePagePermission = [{
			names: ['se.clone.page.type'],
			context: {
				typeCode: this.pageInfo.typeCode
			}
		}];

		return this.managePageService.isPageCloneable(
			this.pageInfo.uuid,
			this.pageInfo.catalogVersion
		).then((cloneable) => {
			this.isCloneable = cloneable;
		});
	}

	// ------------------------------------------------------------------------
	// Helper Methods
	// ------------------------------------------------------------------------
	onClickOnClone() {
		this.clonePageWizardService.openClonePageWizard(this.pageInfo);
	}

}