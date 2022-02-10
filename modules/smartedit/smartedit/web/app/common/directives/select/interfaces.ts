/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {TypedMap} from '../../dtos';

export interface SelectItem {
	id: string;
	uid?: string;
	label?: TypedMap<string> | string;
	name?: TypedMap<string> | string;
}
