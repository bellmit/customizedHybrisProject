/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
import {ClonePageItemComponent} from "cmssmarteditcontainer/components/pages/pageItems/clonePageItem/ClonePageItemComponent";
import {ICMSPage} from "cmscommons";
import {ManagePageService} from 'cmssmarteditcontainer/services/pages/ManagePageService';

describe('ClonePageItemController', () => {

	let controller: ClonePageItemComponent;

	let clonePageWizardService: any;
	let managePageService: jasmine.SpyObj<ManagePageService>;

	const MOCKED_PAGE_INFO = {
		name: 'MOCKED_PAGE'
	} as ICMSPage;

	beforeEach(() => {
		clonePageWizardService = jasmine.createSpyObj('clonePageWizardService', ['openClonePageWizard']);
		managePageService = jasmine.createSpyObj<ManagePageService>('managePageService', ['isPageCloneable']);

		controller = new ClonePageItemComponent(clonePageWizardService, managePageService);
		controller.pageInfo = MOCKED_PAGE_INFO;
	});

	it("calls clonePageWizardService to display a 'clone page' wizard", function() {
		// WHEN
		controller.onClickOnClone();

		// ASSERT
		expect(clonePageWizardService.openClonePageWizard).toHaveBeenCalledWith(MOCKED_PAGE_INFO);
	});

	it('should set cloneable value on init', (done) => {
		managePageService.isPageCloneable.and.returnValue(Promise.resolve(true));

		controller.$onInit().then(() => {
			expect(controller.isCloneable).toEqual(true);
			done();
		});
	});

});