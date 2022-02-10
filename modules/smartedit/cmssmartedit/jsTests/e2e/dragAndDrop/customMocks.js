/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
/* jshint unused:false, undef:false */
angular
    .module('customMocksModule', ['ngMockE2E', 'backendMocksUtilsModule'])
    .run(function($httpBackend, parseQuery, backendMocksUtils) {
        var componentTypes = [{
                category: 'COMPONENT',
                code: 'CMSParagraphComponent',
                i18nKey: 'type.cmsparagraphcomponent.name',
                name: 'Paragraph'
            },
            {
                category: 'COMPONENT',
                code: 'SimpleBannerComponent',
                i18nKey: 'type.simplebannercomponent.name',
                name: 'Simple Banner Component'
            }
        ];

        $httpBackend
            .whenGET(
                /cmssmarteditwebservices\/v1\/catalogs\/apparel-ukContentCatalog\/versions\/Staged\/pages\/homepage\/types((?!\/).)*$/
            )
            .respond(function(method, url, data) {
                var query = parseQuery(url);
                var componentsMask = query.mask.toLowerCase();

                var paginatedData = componentsMask ?
                    componentTypes.filter(function(item) {
                        return item.name.toLowerCase().indexOf(componentsMask) > -1;
                    }) :
                    componentTypes;

                return [
                    200,
                    {
                        pagination: {
                            totalCount: paginatedData.length
                        },
                        componentTypes: paginatedData
                    }
                ];
            });
    });
try {
    angular.module('smarteditloader').requires.push('customMocksModule');
} catch (e) {}
try {
    angular.module('smarteditcontainer').requires.push('customMocksModule');
} catch (e) {}
