/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
/* jshint unused:false, undef:false */

angular.module('rerenderMocks', ['ngMockE2E', 'smarteditServicesModule'])
    /*
     * is mirrored with another componentMocksUpdater in dragAndDropAndRemoveMocks.js
     */
    .service('componentMocksUpdater', function(gatewayProxy) {

        this.gatewayId = 'componentMocksUpdater';

        this.update = function(payload) {

            this.slots = payload.updates.slots;
            this.types = payload.updates.types;

            sfBuilder[payload.operation.method].apply(sfBuilder, payload.operation.args);
        };

        this.getSlots = function() {
            return this.slots;
        };

        this.getTypes = function() {
            return this.types;
        };

        gatewayProxy.initForService(this, ['update']);
    })
    .run(function($httpBackend, $window, lodash, SMARTEDIT_IFRAME_ID, componentMocksUpdater) {

        this.slots = [];

        // note: removeComponentTest relies on this being here also...zzzz..... found that out the hard way
        $httpBackend.whenGET(/.*storefront.*/).respond(function() {

            var types = componentMocksUpdater.getTypes();
            var slotsStr = '';
            lodash.each(componentMocksUpdater.getSlots(), function(slot) {
                slotsStr += this._renderSlot(slot, types);
            }.bind(this));
            var document = '<!DOCTYPE html>' +
                '<html>' +
                '<head></head>' +
                '<body>' +
                slotsStr +
                '</body>' +
                '</html>';

            return [200, document];
        }.bind(this));

        this._renderSlot = function(slot, types) {
            var components = '';
            lodash.each(slot.components, function(componentId) {
                var type = this.getComponentType(componentId, types);
                var component = '<div class="smartEditComponent" id="' + componentId + '" data-smartedit-component-type="' + type + '" data-smartedit-component-id="' + componentId + '">' +
                    '<div class="box">' +
                    '<p>' + componentId + '</p>' +
                    '</div>' +
                    '</div>';
                components += component;
            }.bind(this));

            var slotStr = '<div class="smartEditComponent" id="' + slot.id + '" data-smartedit-component-type="ContentSlot" data-smartedit-component-id="' + slot.id + '">' +
                components + '</div>';

            return slotStr;
        };

        this.getComponentType = function(componentId, types) {
            if (types[componentId]) {
                return types[componentId];
            } else {
                return 'componentType0';
            }
        };

        // Note: slotTypeRestriction relies this backend mock to be here.
        $httpBackend.whenPOST(/cmswebservices\/v1\/catalogs\/apparel-ukContentCatalog\/versions\/Staged\/pages\/homepage\/typerestrictions/).respond(function(method, url, data) {
            var response = [{
                contentSlotName: 'topHeaderSlot',
                contentSlotUid: 'topHeaderSlot',
                validComponentTypes: [
                    'componentType1',
                    'componentType2',
                    'componentType3',
                    'CMSParagraphComponent',
                    'AbstractCMSComponent'
                ]
            }, {
                contentSlotName: 'bottomHeaderSlot',
                contentSlotUid: 'bottomHeaderSlot',
                validComponentTypes: [
                    'componentType4',
                    'CMSParagraphComponent',
                    'AbstractCMSComponent',
                    'SimpleBannerComponent'
                ]
            }, {
                contentSlotName: 'footerSlot',
                contentSlotUid: 'footerSlot',
                validComponentTypes: [
                    'componentType0',
                    'componentType2',
                    'componentType3',
                    'componentType4',
                    'componentType5',
                    'SimpleResponsiveBannerComponent',
                    'CMSParagraphComponent',
                    'AbstractCMSComponent',
                ]
            }, {
                contentSlotName: 'otherSlot',
                contentSlotUid: 'otherSlot',
                validComponentTypes: [
                    'componentType0',
                    'componentType1',
                    'componentType2',
                    'componentType3',
                    'componentType4',
                    'componentType5'
                ]
            }, {
                contentSlotName: 'staticDummySlot',
                contentSlotUid: 'staticDummySlot',
                validComponentTypes: [
                    'componentType0',
                    'componentType2',
                    'componentType3',
                    'componentType4',
                    'componentType5',
                    'AbstractCMSComponent',
                    'SimpleResponsiveBannerComponent'
                ]
            }, {
                contentSlotName: 'emptyDummySlot',
                contentSlotUid: 'emptyDummySlot',
                validComponentTypes: [
                    'AbstractCMSComponent',
                    'componentType4'
                ]
            }, {
                contentSlotName: 'searchBoxSlot',
                contentSlotUid: 'searchBoxSlot',
                validComponentTypes: [
                    'componentType0',
                    'componentType2',
                    'componentType3',
                    'componentType4',
                    'componentType5',
                    'AbstractCMSComponent',
                    'SimpleResponsiveBannerComponent'
                ]
            }];
            return [200, response];
        });
    });
