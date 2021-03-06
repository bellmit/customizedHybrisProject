/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
/* jshint unused:false, undef:false */
angular.module('pagesContentSlotsMocks', ['ngMockE2E', 'backendMocksUtilsModule']);

angular.module('pagesContentSlotsMocks')
    .constant('backendMock_pagesContentSlotsData', 'pagesContentSlotsData')
    .run(function($httpBackend, $injector, $rootElement, backendMocksUtils, backendMock_pagesContentSlotsData) {

        /**
         * Mocks the /pagescontentslots resource with the query parameter 'pageId' set to 'homepage' to return four associations, indicating that the page has four slots.
         */
        var getPageContentSlotsMock = $httpBackend.whenGET(/cmswebservices\/v1\/sites\/.*\/catalogs\/.*\/versions\/Staged\/pagescontentslots\?pageId=.*/);
        getPageContentSlotsMock.respond({
            pageContentSlotList: [{
                pageId: 'homepage',
                position: 'topHeader',
                slotId: 'topHeaderSlot',
                slotShared: false,
                slotStatus: 'PAGE'
            }, {
                pageId: 'homepage',
                position: 'bottomHeader',
                slotId: 'bottomHeaderSlot',
                slotShared: false,
                slotStatus: 'PAGE'
            }, {
                pageId: 'homepage',
                position: 'footer',
                slotId: 'footerSlot',
                slotShared: false,
                slotStatus: 'PAGE'
            }, {
                pageId: 'homepage',
                position: 'other',
                slotId: 'otherSlot',
                slotShared: false,
                slotStatus: 'PAGE'
            }]
        });

        backendMocksUtils.storeBackendMock(backendMock_pagesContentSlotsData, getPageContentSlotsMock);

        /**
         * Mocks the /pagescontentslots resource with the query parameter 'slotId' set to 'topHeaderSlot' to return a single association, indicating that the slot is not shared.
         */
        $httpBackend.whenGET(/\/cmswebservices\/v1\/sites\/.*\/catalogs\/.*\/versions\/Staged\/pagescontentslots\?slotId=topHeaderSlot/).respond({
            pageContentSlotList: [{
                pageId: 'homepage',
                position: 'topHeader',
                slotId: 'topHeaderSlot',
                slotShared: true
            }]
        });

        /**
         * Mocks the /pagescontentslots resource with the query parameter 'slotId' set to 'bottomHeaderSlot' to return a single association, indicating that the slot is not shared.
         */
        $httpBackend.whenGET(/\/cmswebservices\/v1\/sites\/.*\/catalogs\/.*\/versions\/Staged\/pagescontentslots\?slotId=bottomHeaderSlot/).respond({
            pageContentSlotList: [{
                pageId: 'homepage',
                position: 'topHeader',
                slotId: 'bottomHeaderSlot'
            }]
        });

        /**
         * Mocks the /pagescontentslots resource with the query parameter 'slotId' set to 'otherSlot' to return a single association, indicating that the slot is not shared.
         */
        $httpBackend.whenGET(/\/cmswebservices\/v1\/sites\/.*\/catalogs\/.*\/versions\/Staged\/pagescontentslots\?slotId=otherSlot/).respond({
            pageContentSlotList: [{
                pageId: 'homepage',
                position: 'topHeader',
                slotId: 'otherSlot'
            }]
        });

        /**
         * Mocks the /pagescontentslots resource with the query parameter 'slotId' set to 'footerSlot' to return a single association, indicating that the slot is not shared.
         */
        $httpBackend.whenGET(/\/cmswebservices\/v1\/sites\/.*\/catalogs\/.*\/versions\/Staged\/pagescontentslots\?slotId=footerSlot/).respond({
            pageContentSlotList: [{
                pageId: 'homepage',
                position: 'topHeader',
                slotId: 'footerSlot'
            }]
        });

    });
try {
    angular.module('smarteditloader').requires.push('pagesContentSlotsMocks');
} catch (e) {}
try {
    angular.module('smarteditcontainer').requires.push('pagesContentSlotsMocks');
} catch (e) {}
