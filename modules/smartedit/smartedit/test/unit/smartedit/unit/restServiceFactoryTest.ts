/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import 'jasmine';
import {DelegateRestService, RestServiceFactory} from 'smartedit/services';

describe('test RestServiceFactory ', () => {

	class DTO {
	}
	let delegateRestServiceMock: DelegateRestService;
	let restServiceFactory: RestServiceFactory;
	const uri: string = "theuri";
	const identifier = "theidentifier";

	beforeEach(() => {

		delegateRestServiceMock = jasmine.createSpyObj<DelegateRestService>('delegateRestService', ['delegateForSingleInstance', 'delegateForArray', 'delegateForVoid']);
		restServiceFactory = new RestServiceFactory(delegateRestServiceMock);
	});

	it('get return a RestService instance', function() {
		expect(restServiceFactory.get<DTO>(uri, identifier)).toBeTruthy();
	});

});
