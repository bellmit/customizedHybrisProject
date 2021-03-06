angular.module('personalizationsmarteditCombinedViewComponentLightUpDecorator', [
        'personalizationsmarteditTemplates',
        'personalizationsmarteditServicesModule',
        'personalizationsmarteditCommonsModule'
    ])
    .directive('personalizationsmarteditCombinedViewComponentLightUp',
        function(
            personalizationsmarteditContextService,
            crossFrameEventService,
            PERSONALIZATION_COMBINED_VIEW_CSS_MAPPING) {

            return {
                templateUrl: 'personalizationsmarteditCombinedViewComponentLightUpDecoratorTemplate.html',
                restrict: 'C',
                transclude: true,
                replace: false,
                scope: {
                    smarteditComponentId: '@',
                    smarteditComponentType: '@'
                },
                controller: function($scope, $element) {

                    var allBorderClassess = [];
                    Object.keys(PERSONALIZATION_COMBINED_VIEW_CSS_MAPPING).forEach(function($element, index) {
                        allBorderClassess.push(PERSONALIZATION_COMBINED_VIEW_CSS_MAPPING[index].borderClass);
                    });
                    allBorderClassess = allBorderClassess.join(' ');

                    $scope.letterForElement = "";
                    $scope.classForElement = "";

                    var calculate = function() {
                        var combinedView = personalizationsmarteditContextService.getCombinedView();
                        if (combinedView.enabled) {
                            var container = $element.parent().closest('[class~="smartEditComponentX"][data-smartedit-container-source-id][data-smartedit-container-type="CxCmsComponentContainer"][data-smartedit-personalization-customization-id][data-smartedit-personalization-variation-id]');
                            if (container.length > 0) {
                                container.removeClass(allBorderClassess);
                                (combinedView.selectedItems || []).forEach(function($element, index) {
                                    var state = container.data().smarteditPersonalizationCustomizationId === $element.customization.code;
                                    state = state && container.data().smarteditPersonalizationVariationId === $element.variation.code;
                                    var wrappedIndex = index % Object.keys(PERSONALIZATION_COMBINED_VIEW_CSS_MAPPING).length;
                                    if (state) {
                                        container.addClass(PERSONALIZATION_COMBINED_VIEW_CSS_MAPPING[wrappedIndex].borderClass);
                                        $scope.letterForElement = String.fromCharCode('a'.charCodeAt() + wrappedIndex).toUpperCase();
                                        $scope.classForElement = PERSONALIZATION_COMBINED_VIEW_CSS_MAPPING[wrappedIndex].listClass;
                                    }
                                });
                            }
                        }
                    };

                    this.$onInit = function() {
                        this.unRegister = crossFrameEventService.subscribe('PERSONALIZATION_COMBINEDVIEW_CONTEXT_SYNCHRONIZED', function() {
                            calculate();
                        });
                        calculate();
                    };

                    this.$onDestroy = function() {
                        this.unRegister();
                    };

                }
            };
        });
