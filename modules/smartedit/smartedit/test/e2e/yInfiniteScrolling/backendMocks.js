/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
angular.module('backendMocks', ['ngMockE2E', 'functionsModule', 'resourceLocationsModule', 'smarteditServicesModule'])
    .constant('URL_FOR_ITEM', /cmswebservices\/v1\/catalogs\/electronics\/versions\/staged\/items\/thesmarteditComponentId/)
    .run(function($httpBackend, filterFilter, parseQuery, URL_FOR_ITEM, I18N_RESOURCE_URI, languageService) {

        $httpBackend.whenGET(I18N_RESOURCE_URI + "/" + languageService.getBrowserLocale()).respond({
            "se.componentform.actions.cancel": "Cancel",
            "se.componentform.actions.submit": "Submit",
            "se.genericeditor.sedropdown.placeholder": "Select an Option",
            "type.thesmarteditcomponenttype.dropdowna.name": "Dropdown A",
            "type.thesmarteditcomponenttype.dropdownb.name": "Dropdown B (depends on A)",
            "type.thesmarteditcomponenttype.dropdownc.name": "Dropdown C (depends on A)",
            "type.thesmarteditcomponenttype.dropdownd.name": "Dropdown D",
            "type.thesmarteditcomponenttype.dropdowne.name": "Dropdown E (depends on B)",
            "type.thesmarteditcomponenttype.dropdownf.name": "Dropdown F (strategy)",
        });

        $httpBackend.whenGET(/\/loadItems\?currentPage=.*&mask=.*&pageSize=.*/).respond(function(method, url) {

            var currentPage = url.split('?')[1].split('&')[0].split('=')[1];
            var mask = url.split('?')[1].split('&')[1].split('=')[1];

            var items = [];
            for (var i = 1; i < 26; i++) {
                items.push({
                    name: 'item' + i,
                    id: i
                });
            }

            var filtered = items.filter(function(item) {
                return mask ? item.name.toUpperCase().indexOf(mask.toUpperCase()) > -1 : true;
            });

            var results = filtered.slice(currentPage * 10, currentPage * 10 + 10);

            var pagedResults = {
                "pagination": {
                    "totalCount": filtered.length,
                    "totalPages": 2,
                    "page": currentPage
                },
                "results": results
            };

            return [200, pagedResults];
        });

        $httpBackend.whenGET(/cmswebservices\/v1\/sites\/.*\/languages/).respond({
            languages: [{
                nativeName: 'English',
                isocode: 'en',
                required: true
            }, {
                nativeName: 'Polish',
                isocode: 'pl'
            }, {
                nativeName: 'Italian',
                isocode: 'it'
            }]
        });

        $httpBackend.whenGET(/i18n/).passThrough();
        $httpBackend.whenGET(/view/).passThrough(); //calls to storefront render API
        $httpBackend.whenPUT(/contentslots/).passThrough();
        $httpBackend.whenGET(/\.html/).passThrough();

    });
angular.module('yInfiniteScrollingApp').requires.push('backendMocks');
