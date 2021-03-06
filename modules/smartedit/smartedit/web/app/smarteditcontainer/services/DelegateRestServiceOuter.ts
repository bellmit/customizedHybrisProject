/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import * as angular from 'angular';
import {GatewayProxied, Page, Pageable, Payload, SeInjectable} from 'smarteditcommons';
import {RestServiceFactory} from 'smarteditcontainer/services';
/*
 * internal service to proxy calls from inner RESTService to the outer restServiceFactory and the 'real' IRestService
 */

/** @internal */
@GatewayProxied()
@SeInjectable()
export class DelegateRestService {

	constructor(private restServiceFactory: RestServiceFactory) {
	}

	delegateForVoid(methodName: string, params: string | Payload, uri: string, identifier: string, metadataActivated: boolean): angular.IPromise<void> {
		const restService = this.restServiceFactory.get<any>(uri, identifier);
		if (metadataActivated) {
			restService.activateMetadata();
		}
		return restService.getMethodForVoid(methodName)(params);
	}

	delegateForSingleInstance<T>(methodName: string, params: string | Payload, uri: string, identifier: string, metadataActivated: boolean): angular.IPromise<T> {
		const restService = this.restServiceFactory.get<T>(uri, identifier);
		if (metadataActivated) {
			restService.activateMetadata();
		}
		return restService.getMethodForSingleInstance(methodName)(params);
	}

	delegateForArray<T>(methodName: string, params: string | Payload, uri: string, identifier: string, metadataActivated: boolean): angular.IPromise<T[]> {
		const restService = this.restServiceFactory.get<T>(uri, identifier);
		if (metadataActivated) {
			restService.activateMetadata();
		}
		return restService.getMethodForArray(methodName)(params);
	}

	delegateForPage<T>(pageable: Pageable, uri: string, identifier: string, metadataActivated: boolean): angular.IPromise<Page<T>> {
		const restService = this.restServiceFactory.get<T>(uri, identifier);
		if (metadataActivated) {
			restService.activateMetadata();
		}
		return restService.page(pageable);
	}
}
