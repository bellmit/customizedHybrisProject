/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
angular.module('seMediaFormatModule', ['mediaServiceModule', 'seFileSelectorModule', 'seFileValidationServiceModule', 'cmsSmarteditServicesModule'])
    .constant('seMediaFormatConstants', {
        I18N_KEYS: {
            UPLOAD: 'se.media.format.upload',
            REPLACE: 'se.media.format.replace',
            UNDER_EDIT: 'se.media.format.under.edit',
            REMOVE: 'se.media.format.remove'
        }
    })
    .controller('seMediaFormatController', function(mediaService, seMediaFormatConstants, seFileValidationServiceConstants, $scope) {
        this.i18nKeys = seMediaFormatConstants.I18N_KEYS;
        this.acceptedFileTypes = seFileValidationServiceConstants.ACCEPTED_FILE_TYPES;

        this.fetchMedia = function() {
            mediaService.getMedia(this.mediaUuid).then(function(val) {
                this.media = val;
            }.bind(this));
        };

        this.isMediaCodeValid = function() {
            return this.mediaUuid && typeof this.mediaUuid === 'string';
        };

        this.isMediaPreviewEnabled = function() {
            return this.isMediaCodeValid() && !this.isUnderEdit && this.media && this.media.code;
        };

        this.isMediaEditEnabled = function() {
            return !this.isMediaCodeValid() && !this.isUnderEdit;
        };

        this.getErrors = function() {
            return (this.field.messages || []).filter(function(error) {
                return error.format === this.mediaFormat;
            }.bind(this)).map(function(error) {
                return error.message;
            });
        };

        this.$onInit = function() {
            if (this.isMediaCodeValid()) {
                this.fetchMedia();
            }
            this.mediaFormatI18NKey = "se.media.format." + this.mediaFormat;
        };

        $scope.$watch(function() {
            return this.mediaUuid;
        }.bind(this), function(mediaUuid, oldMediaUuid) {
            if (mediaUuid && typeof mediaUuid === 'string') {
                if (mediaUuid !== oldMediaUuid) {
                    this.fetchMedia();
                }
            } else {
                this.media = {};
            }
        }.bind(this));

    })
    .component('seMediaFormat', {
        templateUrl: 'seMediaFormatTemplate.html',
        controller: 'seMediaFormatController',
        controllerAs: 'ctrl',
        require: {
            geField: '^^genericEditorField'
        },
        bindings: {
            mediaUuid: '<',
            mediaFormat: '<',
            isUnderEdit: '<',
            field: '<',
            onFileSelect: '&?',
            onDelete: '&?'
        }
    });
