/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import "../vendor";
import "./styles.scss";
import {enableProdMode} from '@angular/core';

if (process.env.NODE_ENV === 'production') {
	enableProdMode();
}

export * from "../smarteditloader";
export {SmarteditContainerFactory} from './smarteditcontainer';