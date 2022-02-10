/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
export const SMARTEDITLOADER_COMPONENT_NAME = 'smarteditloader-component';
export const SMARTEDITCONTAINER_COMPONENT_NAME = 'smarteditcontainer-component';
export const SMARTEDIT_COMPONENT_NAME = 'smartedit-component';

export const ELEMENT_UUID_ATTRIBUTE = 'data-smartedit-element-uuid';
export const ID_ATTRIBUTE = 'data-smartedit-component-id';
export const TYPE_ATTRIBUTE = 'data-smartedit-component-type';
export const NG_ROUTE_PREFIX = "ng";
export const I18N_RESOURCE_URI = '/smarteditwebservices/v1/i18n/translations';

export const CONTEXT_CATALOG = 'CURRENT_CONTEXT_CATALOG';
export const CONTEXT_CATALOG_VERSION = 'CURRENT_CONTEXT_CATALOG_VERSION';
export const CONTEXT_SITE_ID = 'CURRENT_CONTEXT_SITE_ID';

export const PAGE_CONTEXT_CATALOG = 'CURRENT_PAGE_CONTEXT_CATALOG';
export const PAGE_CONTEXT_CATALOG_VERSION = 'CURRENT_PAGE_CONTEXT_CATALOG_VERSION';
export const PAGE_CONTEXT_SITE_ID = 'CURRENT_PAGE_CONTEXT_SITE_ID';

export enum MUTATION_CHILD_TYPES {
	ADD_OPERATION = 'addedNodes',
	REMOVE_OPERATION = 'removedNodes'
}
/*
* Mutation object (return in a list of mutations in mutation event) can be of different types.
* We are here only interested in type attributes (used for onPageChanged and onComponentChanged events) and childList (used for onComponentAdded events)
*/
export const MUTATION_TYPES = {
	CHILD_LIST: {
		NAME: "childList",
		ADD_OPERATION: MUTATION_CHILD_TYPES.ADD_OPERATION,
		REMOVE_OPERATION: MUTATION_CHILD_TYPES.REMOVE_OPERATION
	},
	ATTRIBUTES: {
		NAME: "attributes"
	}
};

export const EVENTS = {
	AUTHORIZATION_SUCCESS: 'AUTHORIZATION_SUCCESS',
	USER_HAS_CHANGED: 'USER_HAS_CHANGED',
	LOGOUT: 'SE_LOGOUT_EVENT',
	CLEAR_PERSPECTIVE_FEATURES: 'CLEAR_PERSPECTIVE_FEATURES',
	EXPERIENCE_UPDATE: 'experienceUpdate',
	PERMISSION_CACHE_CLEANED: 'PERMISSION_CACHE_CLEANED',
	PAGE_CHANGE: 'PAGE_CHANGE',
	PAGE_CREATED: 'PAGE_CREATED_EVENT',
	PAGE_UPDATED: 'PAGE_UPDATED_EVENT',
	PAGE_DELETED: 'PAGE_DELETED_EVENT',
	PAGE_SELECTED: 'PAGE_SELECTED_EVENT',
	PAGE_RESTORED: 'PAGE_RESTORED_EVENT',
	REAUTH_STARTED: 'REAUTH_STARTED'
};
