/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
angular.module('genericEditorApp', ['smarteditServicesModule', 'genericEditorModule', 'localizedElementModule', 'templateCacheDecoratorModule'])
    .controller('defaultController', function($rootScope, sharedDataService, restServiceFactory) {
        restServiceFactory.setDomain('thedomain');
        sharedDataService.set('experience', {
            siteDescriptor: {
                uid: 'someSiteUid'
            },
            catalogDescriptor: {
                catalogId: 'somecatalogId',
                catalogVersion: 'someCatalogVersion'
            }
        });

        this.thesmarteditComponentType = 'thesmarteditComponentType';
        this.structureApi = "cmswebservices/v1/types/:smarteditComponentType";
        this.displaySubmit = true;
        this.displayCancel = true;
        this.contentApi = "previewApi";
        this.updateCallback = function(entity, response) {
            delete this.smarteditComponentId;
            console.info("successful callback on ticket id ", response.ticketId);
            $rootScope.ticketId = response.ticketId;
        };
    });
