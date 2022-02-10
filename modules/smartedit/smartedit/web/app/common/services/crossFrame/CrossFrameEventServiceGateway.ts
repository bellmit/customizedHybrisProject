/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {Injectable, InjectionToken} from '@angular/core';
import {GatewayFactory} from '../gateway/GatewayFactory';

/** @internal */
@Injectable()
export class CrossFrameEventServiceGateway {

	public static crossFrameEventServiceGatewayToken = new InjectionToken<string>('crossFrameEventServiceGatewayToken');

	constructor(
		gatewayFactory: GatewayFactory
	) {
		return gatewayFactory.createGateway("CROSS_FRAME_EVENT");
	}
}
