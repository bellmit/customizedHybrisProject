/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {BootstrapPayload, SeInjectable} from "smarteditcommons";
import * as lo from 'lodash';

declare global {

	/* @internal */
	interface InternalSmartedit {
		SmarteditFactory: (payload: BootstrapPayload) => any;
	}
	interface Window {
		smartedit: SmarteditNamespace;
	}
}

export interface SmarteditNamespace {
	addOnReprocessPageListener: (callback: () => void) => void;
	reprocessPage: () => void;
	applications: string[];
	domain: string;
	smarteditroot: string;
	whiteListedStorefronts: string;
	renderComponent?: (componentId: string, componentType: string, parentId: string) => any;
}

/* @internal */
@SeInjectable()
export class SeNamespaceService {
	reprocessPage = lo.debounce(this._reprocessPage.bind(this), 50);

	constructor(
		private $log: angular.ILogService
	) {}

	// explain slot for multiple instances of component scenario
	renderComponent(componentId: string, componentType: string, parentId: string): boolean {
		return this.namespace && typeof this.namespace.renderComponent === 'function' ?
			this.namespace.renderComponent(componentId, componentType, parentId) : false;
	}

	private _reprocessPage() {
		if (this.namespace && typeof this.namespace.reprocessPage === 'function') {
			this.namespace.reprocessPage();
			return;
		}
		this.$log.warn('No reprocessPage function defined on smartedit namespace');
	}

	private get namespace(): SmarteditNamespace {
		window.smartedit = window.smartedit || {} as SmarteditNamespace;
		return window.smartedit;
	}

}