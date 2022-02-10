/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
describe('itemSelectorPanel', function() {
    // ---------------------------------------------------------------------------------
    // Constants
    // ---------------------------------------------------------------------------------
    var CATALOG_ID = "apparelProductCatalog";
    var CATALOGS_MOCK = [{
        id: 'apparelProductCatalog',
        name: {
            en: 'Apparel Product Catalog',
            de: 'Produktkatalog Kleidung'
        },
        versions: [{
                active: true,
                uuid: 'apparelProductCatalog/Online',
                version: 'Online'
            },
            {
                active: false,
                uuid: 'apparelProductCatalog/Staged',
                version: 'Staged'
            }
        ]
    }];

    var $q;
    var scope, ctrl;

    beforeEach(angular.mock.module('itemSelectorPanelModule'));

    beforeEach(inject(function($rootScope, _$q_, _$controller_) {
        $q = _$q_;
        var $controller = _$controller_;

        scope = $rootScope.$new();
        ctrl = $controller('ItemSelectorPanelController', {
            $scope: scope
        });
        ctrl.getCatalogs = jasmine.createSpy('getCatalogs').and.returnValue($q.resolve(CATALOGS_MOCK));
    }));

    // ---------------------------------------------------------------------------------
    // Tests
    // ---------------------------------------------------------------------------------
    it('WHEN catalogVersion changes THEN it should not empty original catalogVersion value', function() {
        //GIVEN
        ctrl.catalogInfo = {
            catalogId: CATALOG_ID
        };
        ctrl.catalogs = CATALOGS_MOCK;
        ctrl._initCatalogVersionSelector();

        // WHEN
        emptyCatalogVersions(ctrl.catalogVersionSelectorFetchStrategy.fetchAll());

        // THEN
        expect(getCatalogVersionByCatalogId(CATALOG_ID).length).toBe(2);
    });

    // ---------------------------------------------------------------------------------
    // Helper Functions
    // ---------------------------------------------------------------------------------
    function emptyCatalogVersions(versions) {
        versions.$$state.value.length = 0;
    }

    function getCatalogVersionByCatalogId(id) {
        return ctrl.catalogs.find(
            function(catalog) {
                return catalog.id === id;
            }.bind(this)
        ).versions;
    }

});
