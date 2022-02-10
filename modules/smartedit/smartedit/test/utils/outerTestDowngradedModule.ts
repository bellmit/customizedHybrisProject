/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import "../../web/app/vendor/polyfills";
import * as angular from 'angular';
import {
	GatewayFactory,
	GatewayProxiedAnnotationFactory,
	GatewayProxy,
	PromiseUtils,
	SystemEventService,
	WindowUtils
} from 'smarteditcommons';

/*
 * Angular JS module to manually downgrade Angular entities for unit tests
 * that still use mock/inject.
 * We can't bootstrap a real Angular module as it would have to be
 * bootstrapped on a real node for as many times as we have of tests
 */
angular.module('smarteditRootModule')
	.factory('injector', ($injector: angular.auto.IInjectorService) => {

		const oldGet = $injector.get;
		($injector as any).get = function(name: string, defaultValue: any) {
			if (this.has(name)) {
				return oldGet.call($injector, name);
			} else if (!!defaultValue) {
				return defaultValue;
			}
			throw new Error(`Unknown provider: ${name}`);
		};
		return $injector;
	})
	.service("windowUtils", () => new WindowUtils())
	.service("promiseUtils", PromiseUtils)
	.service("systemEventService", SystemEventService)
	.service("gatewayFactory", GatewayFactory)
	.service("gatewayProxy", GatewayProxy)
	.factory("gatewayProxiedAnnotationFactory", GatewayProxiedAnnotationFactory)
	.run((gatewayProxiedAnnotationFactory: any) => {
		'ngInject';
	});