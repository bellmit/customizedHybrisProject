/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
describe('experience interceptor - unit test catalog version header interceptor', function() {

    var $httpProvider;
    var interceptor;
    var sharedDataService;
    var $q;
    var $rootScope;
    var CONTEXT_CATALOG;
    var CONTEXT_CATALOG_VERSION;
    var CONTEXT_SITE_ID;

    var CMSWEBSERVICES_RESOURCE_URI = 'cmswebservices/';

    beforeEach(angular.mock.module('experienceInterceptorModule', function($provide, _$httpProvider_) {
        $httpProvider = _$httpProvider_;

        sharedDataService = jasmine.createSpyObj("persitenceService", ['get', 'set']);

        sharedDataService.get.and.callFake(function() {
            return $q.when({
                catalogDescriptor: {
                    catalogId: 'apparel-uk',
                    catalogVersion: 'Staged'
                },
                siteDescriptor: {
                    uid: 'apparel-uid'
                }
            });
        });

        $provide.value('sharedDataService', sharedDataService);
    }));

    beforeEach(angular.mock.module('resourceLocationsModule', function($provide) {
        $provide.constant('CMSWEBSERVICES_RESOURCE_URI', CMSWEBSERVICES_RESOURCE_URI);

        $provide.constant("CONTEXT_CATALOG", "CURRENT_CONTEXT_CATALOG");
        $provide.constant("CONTEXT_CATALOG_VERSION", "CURRENT_CONTEXT_CATALOG_VERSION");
        $provide.constant("CONTEXT_SITE_ID", "CURRENT_CONTEXT_SITE_ID");
    }));

    beforeEach(inject(function(_$rootScope_, _experienceInterceptor_, _$q_, _CONTEXT_CATALOG_, _CONTEXT_CATALOG_VERSION_, _CONTEXT_SITE_ID_) {
        $rootScope = _$rootScope_;
        $q = _$q_;
        interceptor = _experienceInterceptor_;
        CONTEXT_CATALOG = _CONTEXT_CATALOG_;
        CONTEXT_CATALOG_VERSION = _CONTEXT_CATALOG_VERSION_;
        CONTEXT_SITE_ID = _CONTEXT_SITE_ID_;
    }));


    it('will be loaded with the interceptor', function() {

        expect($httpProvider.interceptors).toContain('experienceInterceptor');

    });

    it('should replace the catalog version, site uid and catalog in the URI if they exist in the sharedDataService', function() {
        var config = {
            url: '/cmswebservices/v1/sites/' + CONTEXT_SITE_ID + '/catalogs/' + CONTEXT_CATALOG + '/versions/' + CONTEXT_CATALOG_VERSION + '/items',
            headers: []
        };

        var result = interceptor.request(config);
        $rootScope.$digest();

        result.then(
            function(response) {
                expect(response.url.search("apparel-uk") !== -1).toBe(true);
                expect(response.url.search("Staged") !== -1).toBe(true);
                expect(response.url.search("apparel-uid") !== -1).toBe(true);
            }
        );
        $rootScope.$digest();
    });


    it('should not replace catalog version and catalog to the URI if the url is different the cmsapi', function() {
        var config = {
            url: '/abc',
        };

        var result = interceptor.request(config);
        $rootScope.$digest();

        result.then(
            function(response) {
                expect(response.url.search("apparel-uk") === -1).toBe(true);
                expect(response.url.search("Staged") === -1).toBe(true);
                expect(response.url.search("apparel-uid") === -1).toBe(true);
            }
        );
        $rootScope.$digest();
    });

});
