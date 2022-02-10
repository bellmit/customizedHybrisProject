/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
/* forbiddenNameSpaces angular.module:false */
import * as angular from 'angular';

/**
 * Backwards compatibility for partners and downstream teams
 * The deprecated modules below were moved to cmsSmarteditServicesModule
 *
 * IMPORANT: THE DEPRECATED MODULES WILL NOT BE AVAILABLE IN FUTURE RELEASES
 */
/* @internal */
const deprecatedSince1905 = () => {
	angular.module('oldModule', ['newModule']);
	angular.module('pageServiceModule', ['cmsSmarteditServicesModule']);
};

const deprecatedSince1911 = () => {
	angular.module('cmsitemsRestService', ['cmsSmarteditServicesModule']);

};
export const deprecate = () => {
	deprecatedSince1905();
	deprecatedSince1911();
};