/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
angular.module('displayConditionsEditorModelModule', ['displayConditionsFacadeModule', 'smarteditServicesModule'])
    .service('displayConditionsEditorModel', function(displayConditionsFacade, $q, systemEventService) {
        this._initModelForPrimary = function(pageUid) {
            displayConditionsFacade.getVariationsForPageUid(pageUid).then(function(variations) {
                this.variations = variations;
            }.bind(this));
        };

        this._initModelForVariation = function(pageUid) {
            displayConditionsFacade.getPrimaryPageForVariationPage(pageUid).then(function(associatedPrimaryPage) {
                this.associatedPrimaryPage = associatedPrimaryPage;
                this.originalPrimaryPage = associatedPrimaryPage;
            }.bind(this));

            this.isAssociatedPrimaryReadOnly = this.pageType !== 'ContentPage';
        };

        this.initModel = function(pageUid) {
            this.pageUid = pageUid;
            displayConditionsFacade.getPageInfoForPageUid(pageUid).then(function(page) {
                this.pageName = page.pageName;
                this.pageType = page.pageType;
                this.isPrimary = page.isPrimary;

                if (this.isPrimary) {
                    this._initModelForPrimary(pageUid);
                } else {
                    this._initModelForVariation(pageUid);
                }
            }.bind(this));
        };

        this.setAssociatedPrimaryPage = function(associatedPrimaryPage) {
            systemEventService.publishAsync("EDIT_PAGE_ASSOCIATED_PRIMARY_UPDATED_EVENT", associatedPrimaryPage);
            this.associatedPrimaryPage = associatedPrimaryPage;
        };

        this.save = function() {
            return this.isDirty() ? displayConditionsFacade.updatePage(this.pageUid, {
                label: this.associatedPrimaryPage.label
            }) : $q.when(true);
        };

        this.isDirty = function() {
            return !!this.originalPrimaryPage && !!this.associatedPrimaryPage && !angular.equals(this.originalPrimaryPage, this.associatedPrimaryPage);
        };
    });
