/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
export interface SynchronizationPageConditions {
	canSyncHomepage: boolean;
	pageHasUnavailableDependencies: boolean;
	pageHasSyncStatus: boolean;
	pageHasNoDepOrNoSyncStatus: boolean;
}
