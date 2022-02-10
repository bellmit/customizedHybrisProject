/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {IRestService, IRestServiceFactory, SeInjectable} from 'smarteditcommons';
import {DelegateRestService} from './DelegateRestServiceInner';
import {RestService} from './RestService';

/** @internal */
@SeInjectable()
export class RestServiceFactory implements IRestServiceFactory {

	constructor(private delegateRestService: DelegateRestService) {
	}

	get<T>(uri: string, identifier?: string): IRestService<T> {

		return new RestService<T>(this.delegateRestService, uri, identifier);
	}

}
