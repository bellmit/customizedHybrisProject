/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
angular.module('perspectiveServiceOuterApp', [
        'smarteditServicesModule'
    ])
    .run(function($q, permissionService, featureService, perspectiveService) {

        permissionService.registerRule({
            names: ['se.some.rule'],
            verify: function() {
                return $q.when(window.sessionStorage.getItem("PERSPECTIVE_SERVICE_RESULT") === 'true');
            }
        });

        permissionService.registerPermission({
            aliases: ['se.some.permission'],
            rules: ['se.some.rule']
        });

        featureService.addToolbarItem({
            toolbarId: 'smartEditPerspectiveToolbar',
            key: 'se.some.item.key',
            type: 'ACTION',
            nameI18nKey: 'se.some.label',
            iconClassName: 'some class',
            priority: 4,
            section: 'left',
            permissions: ['se.some.permission']
        });

        perspectiveService.register({
            key: 'permissionsKey',
            nameI18nKey: 'permissionsI18nKey',
            descriptionI18nKey: 'permissionsDescriptionI18nKey',
            features: ['se.some.item.key'],
            perspectives: []
        });
    });
