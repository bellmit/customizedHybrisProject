/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {IUriContext, SeInjectable} from 'smarteditcommons';
import {ManagePageService} from 'cmssmarteditcontainer/services/pages/ManagePageService';

/**
 * @ngdoc service
 * @name cmsSmarteditServicesModule.service:TrashedPageService
 *
 * @description
 * Used by pageListController
 */
@SeInjectable()
export class TrashedPageService {

	constructor(private managePageService: ManagePageService) {}

	/** 
	 * @ngdoc method
	 * @name cmsSmarteditServicesModule.service:TrashedPageService#getTrashedPagesCount
	 * @methodOf cmsSmarteditServicesModule.service:TrashedPageService
	 * 
	 * @deprecated since 1808 - use {@link cmsSmarteditServicesModule.service:ManagePageService#getSoftDeletedPagesCount getSoftDeletedPagesCount} instead.
	 *
	 * @description
	 * Get the number of trashed pages
	 * 
	 * @returns {object} containing the total number of trashed pages
	 */
	getTrashedPagesCount(uriContext: IUriContext) {
		return this.managePageService.getSoftDeletedPagesCount(uriContext);
	}

}
