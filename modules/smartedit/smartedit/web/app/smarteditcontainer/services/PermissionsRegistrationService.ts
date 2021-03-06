/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {IPermissionService, ISharedDataService, PermissionContext, SeInjectable} from 'smarteditcommons';

/** @internal */
@SeInjectable()
export class PermissionsRegistrationService {

	constructor(
		private permissionService: IPermissionService,
		private sharedDataService: ISharedDataService
	) {}

	/**
	 * Method containing registrations of rules and permissions to be used in smartedit workspace
	 */
	registerRulesAndPermissions(): void {

		// Rules
		this.permissionService.registerRule({
			names: ['se.slot.belongs.to.page'],
			verify: (permissionObjects: PermissionContext[]) => {
				return this.sharedDataService.get('experience').then(function(experience: any) {
					return experience.pageContext && experience.pageContext.catalogVersionUuid === permissionObjects[0].context.slotCatalogVersionUuid;
				});
			}
		});

		// Permissions
		this.permissionService.registerPermission({
			aliases: ['se.slot.not.external'],
			rules: ['se.slot.belongs.to.page']
		});

	}

}