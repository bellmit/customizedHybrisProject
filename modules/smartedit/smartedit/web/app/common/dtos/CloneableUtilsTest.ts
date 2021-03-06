/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {domHelper, jQueryHelper, promiseHelper} from 'testhelpers';

import {Cloneable, CloneableUtils} from 'smarteditcommons';

describe('cloneableUtils', () => {

	let cloneableUtils: CloneableUtils;

	const arrayElement = {
		a: 5,
		b: "somestring",
		c: true,
		d() {
			return true;
		},
		e: jQueryHelper.wrap("someJQueryElement")
	};

	const strippedArrayElement = {
		a: 5,
		b: "somestring",
		c: true,
		d: null,
		e: null
	} as Cloneable;

	const objectElement = {

		a: 5,
		b: "somestring",
		c: true,
		d() {
			return true;
		},
		e: jQueryHelper.wrap("someJQueryElement"),
		f: [arrayElement],
		g: promiseHelper.buildPromise("somePromise"),
		h: domHelper.element("someElement")
	};

	const strippedObjectElement = {

		a: 5,
		b: "somestring",
		c: true,
		d: null,
		e: null,
		f: [strippedArrayElement],
		g: null,
		h: null
	} as Cloneable;

	const source = {

		a: 5,
		b: "somestring",
		c: true,
		d() {
			return true;
		},
		e: jQueryHelper.wrap("someJQueryElement"),
		f: [arrayElement],
		g: promiseHelper.buildPromise("somePromise"),
		h: domHelper.element("someElement"),
		i: objectElement
	};

	const strippedSource = {

		a: 5,
		b: "somestring",
		c: true,
		d: null,
		e: null,
		f: [strippedArrayElement],
		g: null,
		h: null,
		i: strippedObjectElement
	} as Cloneable;

	beforeEach(() => {
		cloneableUtils = new CloneableUtils();
	});

	it('makeCloneable will strip a copy of the object from anything that is not allowed to cross the gateway', () => {

		expect(cloneableUtils.makeCloneable(source)).toEqual(strippedSource);
	});

});