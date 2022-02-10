/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import * as lodash from 'lodash';
import * as angular from 'angular';
import {functionsUtils, Deferred, PromiseUtils, WindowUtils} from 'smarteditcommons/utils';
import {Cloneable, CloneableUtils, Payload, TypedMap} from 'smarteditcommons/dtos';

import {SystemEventService} from '../SystemEventService';
import {LogService} from 'smarteditcommons/services/LogService';

export type CloneableEventHandler<T extends Cloneable> = (eventId: string, eventData?: T) => angular.IPromise<any> | any;

/** @internal */
export interface IGatewayPostMessageData extends Payload {
	pk: string;
	gatewayId: string;
	eventId: string;
	data: Cloneable;
}

/** @internal */
interface AcknowledgableDeferred<T> extends Deferred<T> {
	acknowledged: boolean;
}
/**
 * @ngdoc service
 * @name smarteditCommonsModule.service:MessageGateway
 *
 * @description
 * The Message Gateway is a private channel that is used to publish and subscribe to events across iFrame
 * boundaries. The gateway uses the W3C-compliant postMessage as its underlying technology. The benefits of
 * the postMessage are that:
 * <ul>
 *     <li>It works in cross-origin scenarios.</li>
 *     <li>The receiving end can reject messages based on their origins.</li>
 * </ul>
 *
 * The creation of instances is controlled by the {@link smarteditCommonsModule.service:GatewayFactory gatewayFactory}. Only one
 * instance can exist for each gateway ID.
 *
 * @param {String} gatewayId The channel identifier
 * @constructor
 */

export class MessageGateway {

	private PROMISE_ACKNOWLEDGEMENT_EVENT_ID: string = 'promiseAcknowledgement';
	private PROMISE_RETURN_EVENT_ID: string = 'promiseReturn';
	private SUCCESS: string = 'success';
	private FAILURE: string = 'failure';
	private MAX_RETRIES: number = 5;

	private promisesToResolve: TypedMap<AcknowledgableDeferred<Cloneable>> = {};

	constructor(
		private logService: LogService,
		private systemEventService: SystemEventService,
		private cloneableUtils: CloneableUtils,
		private windowUtils: WindowUtils,
		private promiseUtils: PromiseUtils,
		private TIMEOUT_TO_RETRY_PUBLISHING: number,
		public readonly gatewayId: string
	) {}

    /**
     * @ngdoc method
     * @name smarteditCommonsModule.service:MessageGateway#publish
     * @methodOf smarteditCommonsModule.service:MessageGateway
     *
     * @description
     * Publishes a message across the gateway using the postMessage.
     *
     * The gateway's publish method implements promises, which are an AngularJS implementation. To resolve a
     * publish promise, all listener promises on the side of the channel must resolve. If a failure occurs in the
     * chain, the chain is interrupted and the publish promise is rejected.
     *
     * @param {String} eventId Event identifier
     * @param {Object} data Message payload
     * @param {Number} retries The current number of attempts to publish a message. By default it is 0.
     * @param {String=} pk An optional parameter. It is a primary key for the event, which is generated after
     * the first attempt to send a message.
     * @returns {Promise} Promise to resolve
     */
	publish<Tin extends Cloneable, Tout extends Cloneable>(eventId: string, _data: Tin, retries: number = 0, pk?: string): Promise<void | Tout> {

		if (!eventId) {
			return Promise.reject(`MessageGateway: Failed to send event. No event ID provided for _data: ${_data}` as Tout);
		}

		const data: Cloneable = this.cloneableUtils.makeCloneable(_data);

		if (!lodash.isEqual(data, _data)) {
			this.logService.debug(`MessageGateway.publish - Non cloneable payload has been sanitized for gateway ${this.gatewayId}, event ${eventId}:`, data);
		}

		const deferred: AcknowledgableDeferred<Tout> = this.promisesToResolve[pk] as AcknowledgableDeferred<Tout> || (this.promiseUtils.defer<Tout>() as AcknowledgableDeferred<Tout>);

		try {

			const target = this.windowUtils.getTargetIFrame();
			if (!target) {
				deferred.reject('It is standalone. There is no iframe');
				return deferred.promise;
			}

			pk = pk || this._generateIdentifier();
			try {
				target.postMessage({
					pk, // necessary to identify an incoming postMessage that would carry the response to resolve the promise
					gatewayId: this.gatewayId,
					eventId,
					data
				} as IGatewayPostMessageData, '*');
			} catch (e) {
				this.logService.error(e);
				this.logService.error(`MessageGateway.publish - postMessage has failed for gateway ${this.gatewayId} event ${eventId} and data `, data);
			}

			this.promisesToResolve[pk] = deferred;

			// in case promise does not return because, say, a non ready frame
			this._setTimeout(() => {
				if (!deferred.acknowledged && eventId !== this.PROMISE_RETURN_EVENT_ID && eventId !== this.PROMISE_ACKNOWLEDGEMENT_EVENT_ID) { // still pending
					if (retries < this.MAX_RETRIES) {

						this.logService.debug(`${document.location.href} is retrying to publish event ${eventId}`);

						this.publish(eventId, data, ++retries, pk).catch((reason: any) => {
							//
						});

					} else {
						const error = `MessageGateway.publish - Not able to publish event ${eventId} after max retries for gateway ${this.gatewayId} and data`;
						deferred.reject({error, data});
					}
				}
			}, this.TIMEOUT_TO_RETRY_PUBLISHING);
		} catch (e) {
			deferred.reject();
		}

		return deferred.promise;
	}

    /**
     * @ngdoc method
     * @name smarteditCommonsModule.service:MessageGateway#subscribe
     * @methodOf smarteditCommonsModule.service:MessageGateway
     *
     * @description
     * Registers a given callback function to the given event ID.
     *
     * @param {String} eventId Event identifier
     * @param {CloneableEventHandler} callback Callback function to be invoked
     * @returns {() => void)} The function to call in order to unsubscribe the event listening
     */
	subscribe<T extends Cloneable>(eventId: string, callback: CloneableEventHandler<T>): () => void {
		let unsubscribeFn: () => void;
		if (!eventId) {
			this.logService.error('MessageGateway: Failed to subscribe event handler for event: ' + eventId);
		} else {
			const systemEventId = this._getSystemEventId(eventId);
			unsubscribeFn = this.systemEventService.subscribe(systemEventId, callback);
		}
		return unsubscribeFn;
	}

	processEvent(event: IGatewayPostMessageData): Promise<any> {

		const eventData = event.data as {pk: string, type: string, resolvedDataOfLastSubscriber?: Cloneable};
		if (event.eventId !== this.PROMISE_RETURN_EVENT_ID && event.eventId !== this.PROMISE_ACKNOWLEDGEMENT_EVENT_ID) {
			this.logService.debug(document.location.href, "sending acknowledgement for", event);

			this.publish(this.PROMISE_ACKNOWLEDGEMENT_EVENT_ID, {
				pk: event.pk
			});

			const systemEventId = this._getSystemEventId(event.eventId);
			return this.systemEventService.publishAsync(systemEventId, event.data).then(
				(resolvedDataOfLastSubscriber: Cloneable) => {
					this.logService.debug(document.location.href, "sending promise resolve", event);
					return this.publish(this.PROMISE_RETURN_EVENT_ID, {
						pk: event.pk,
						type: this.SUCCESS,
						resolvedDataOfLastSubscriber
					});
				},
				() => {
					this.logService.debug(document.location.href, "sending promise reject", event);
					return this.publish(this.PROMISE_RETURN_EVENT_ID, {
						pk: event.pk,
						type: this.FAILURE
					});
				}
			);
		} else if (event.eventId === this.PROMISE_RETURN_EVENT_ID) {

			if (this.promisesToResolve[eventData.pk]) {
				if (eventData.type === this.SUCCESS) {
					this.logService.debug(document.location.href, "received promise resolve", event);
					this.promisesToResolve[eventData.pk].resolve(eventData.resolvedDataOfLastSubscriber);
				} else if (eventData.type === this.FAILURE) {
					this.logService.debug(document.location.href, "received promise reject", event);
					this.promisesToResolve[eventData.pk].reject();
				}
				delete this.promisesToResolve[eventData.pk];
			}
		} else if (event.eventId === this.PROMISE_ACKNOWLEDGEMENT_EVENT_ID) {
			if (this.promisesToResolve[eventData.pk]) {
				this.logService.debug(document.location.href, "received acknowledgement", event);
				this.promisesToResolve[eventData.pk].acknowledged = true;
			}

		}
		return Promise.resolve();
	}

	private _setTimeout(callback: () => void, timeout?: number) {
		if (functionsUtils.isUnitTestMode()) {
			setTimeout(callback, timeout);
		} else {
			this.windowUtils.runTimeoutOutsideAngular(callback, timeout);
		}
	}
	private _generateIdentifier(): string {
		return new Date().getTime() + Math.random().toString();
	}

	private _getSystemEventId(eventId: string): string {
		return this.gatewayId + ':' + eventId;
	}

}
