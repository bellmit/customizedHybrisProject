/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
angular.module('i18nMocks', ['ngMockE2E', 'resourceLocationsModule', 'smarteditServicesModule'])
    .run(function($httpBackend, languageService, I18N_RESOURCE_URI) {
        $httpBackend.whenGET(I18N_RESOURCE_URI + "/" + languageService.getBrowserLocale()).respond({
            "se.genericeditor.dropdown.placeholder": "Search...",
            "se.componentform.actions.cancel": "Cancel",
            "se.componentform.actions.submit": "Submit",
            "se.componentform.actions.replaceImage": "Replace Image",
            "type.thesmarteditComponentType.id.name": "id",
            "type.thesmarteditComponentType.headline.name": "Headline",
            "type.thesmarteditComponentType.active.name": "Activation",
            "type.thesmarteditComponentType.content.name": "Content",
            "type.thesmarteditComponentType.create.name": "Creation date",
            "type.thesmarteditComponentType.media.name": "Media",
            "type.thesmarteditComponentType.external.name": "External Link",
            "type.thesmarteditComponentType.urlLink.name": "Url Link",
            "se.editor.linkto.label": "Link to",
            "se.editor.linkto.external.label": "External Link",
            "se.editor.linkto.internal.label": "Existing Page"
        });

    });

angular.module('genericEditorApp').requires.push('i18nMocks');
