/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
/* jshint unused:false, undef:false */
angular
    .module('slotTypeRestrictionsMocks', ['ngMockE2E'])
    .run(function($httpBackend) {
        // Note: slotTypeRestriction mock needs to be placed in smartedit side. check rerenderMocks.js.
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

        // mock for customize components
        $httpBackend.whenGET(/\/cmswebservices\/v1\/sites\/apparel-uk\/catalogs\/apparel-ukContentCatalog\/versions\/Staged\/items\?currentPage=0&mask=&pageSize=10&sort=name/).respond({
            'componentItems': [{
                'creationtime': '2016-08-17T16:05:47+0000',
                'modifiedtime': '2016-08-17T16:05:47+0000',
                'name': 'Component 1',
                'pk': '1',
                'typeCode': 'CMSParagraphComponent',
                'uid': 'component1',
                'visible': true
            }, {
                'creationtime': '2016-08-17T16:05:47+0000',
                'modifiedtime': '2016-08-17T16:05:47+0000',
                'name': 'Component 2',
                'pk': '2',
                'typeCode': 'componentType2',
                'uid': 'component2',
                'visible': true
            }, {
                'creationtime': '2016-08-17T16:05:47+0000',
                'modifiedtime': '2016-08-17T16:05:47+0000',
                'name': 'Component 3',
                'pk': '3',
                'typeCode': 'componentType3',
                'uid': 'component3',
                "visible": true
            }, {
                'creationtime': '2016-08-17T16:05:47+0000',
                'modifiedtime': '2016-08-17T16:05:47+0000',
                'name': 'Component 4',
                'pk': '4',
                'typeCode': 'componentType4',
                'uid': 'component4',
                "visible": true
            }, {
                'creationtime': '2016-08-17T16:05:47+0000',
                'modifiedtime': '2016-08-17T16:05:47+0000',
                'name': 'Component 5',
                'pk': '5',
                'typeCode': 'componentType5',
                'uid': 'component5',
                "visible": true
            }]
        });
    });
try {
    angular.module('smarteditloader').requires.push('slotTypeRestrictionsMocks');
} catch (e) {}
try {
    angular.module('smarteditcontainer').requires.push('slotTypeRestrictionsMocks');
} catch (e) {}
