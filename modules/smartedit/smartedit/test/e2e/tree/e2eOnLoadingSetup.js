/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
(function() {

    angular.module('e2eOnLoadingSetup', ['ngMockE2E', 'resourceLocationsModule'])
        .constant('STOREFRONT_URI', 'http://127.0.0.1:9000/test/utils/storefront.html')
        .run(function(STOREFRONT_URI, $location, $httpBackend) {

            $httpBackend.whenGET(/test\/e2e/).passThrough();
            $httpBackend.whenGET(/static-resources/).passThrough();

            $httpBackend.whenGET(/cmswebservices\/v1\/sites\/electronics\/catalogversiondetails/).respond({
                name: {
                    en: "Electronics"
                },
                uid: 'electronics',
                catalogVersionDetails: [{
                    name: {
                        en: "Electronics Content Catalog"
                    },
                    catalogId: 'electronicsContentCatalog',
                    version: 'Online',
                    redirectUrl: null
                }, {
                    name: {
                        en: "Electronics Content Catalog"
                    },
                    catalogId: 'electronicsContentCatalog',
                    version: 'Staged',
                    redirectUrl: null
                }]
            });

            $httpBackend.whenGET(/cmswebservices\/v1\/sites\/apparel-uk\/catalogversiondetails/).respond({
                name: {
                    en: "Apparels"
                },
                uid: 'apparel-uk',
                catalogVersionDetails: [{
                    name: {
                        en: "Apparel UK Content Catalog"
                    },
                    catalogId: 'apparel-ukContentCatalog',
                    version: 'Online',
                    redirectUrl: null
                }, {
                    name: {
                        en: "Apparel UK Content Catalog"
                    },
                    catalogId: 'apparel-ukContentCatalog',
                    version: 'Staged',
                    redirectUrl: null
                }]
            });

            var allSites = [{
                previewUrl: '/test/utils/storefront.html',
                name: {
                    en: "Electronics"
                },
                redirectUrl: 'redirecturlElectronics',
                uid: 'electronics'
            }, {
                previewUrl: '/test/utils/storefront.html',
                name: {
                    en: "Apparels"
                },
                redirectUrl: 'redirecturlApparels',
                uid: 'apparel-uk'
            }];

            $httpBackend.whenGET(/cmswebservices\/v1\/sites$/).respond({
                sites: allSites
            });
            $httpBackend.whenPOST(/cmswebservices\/v1\/sites\/catalogs/).respond(function(method, url, data) {
                var params = JSON.parse(data);
                if (params.catalogIds) {
                    var filteredItems = allSites.filter(function(site) {
                        return params.catalogIds.indexOf(site.contentCatalogs[site.contentCatalogs.length - 1]) > -1;
                    });
                    return [200, {
                        sites: filteredItems
                    }];
                }
                return [200, {
                    sites: []
                }];
            });

            $httpBackend.whenGET(/cmswebservices\/v1\/sites\/electronics\/languages/).respond({
                languages: [{
                    nativeName: 'English',
                    isocode: 'en',
                    required: true
                }]
            });

            $httpBackend.whenPOST(/thepreviewTicketURI/)
                .respond({
                    ticketId: 'dasdfasdfasdfa',
                    resourcePath: STOREFRONT_URI
                });

            $location.path("/tree");
        });

    angular.module('smarteditcontainer').constant('isE2eTestingActive', true);
    angular.module('smarteditcontainer').requires.push('e2eOnLoadingSetup');

})();
