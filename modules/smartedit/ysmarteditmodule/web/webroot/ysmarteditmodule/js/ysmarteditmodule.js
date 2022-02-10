!function(e){var t={};function __webpack_require__(r){if(t[r])return t[r].exports;var n=t[r]={i:r,l:!1,exports:{}};return e[r].call(n.exports,n,n.exports,__webpack_require__),n.l=!0,n.exports}__webpack_require__.m=e,__webpack_require__.c=t,__webpack_require__.d=function(e,t,r){__webpack_require__.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:r})},__webpack_require__.r=function(e){"undefined"!=typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},__webpack_require__.t=function(e,t){if(1&t&&(e=__webpack_require__(e)),8&t)return e;if(4&t&&"object"==typeof e&&e&&e.__esModule)return e;var r=Object.create(null);if(__webpack_require__.r(r),Object.defineProperty(r,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var n in e)__webpack_require__.d(r,n,function(t){return e[t]}.bind(null,n));return r},__webpack_require__.n=function(e){var t=e&&e.__esModule?function getDefault(){return e.default}:function getModuleExports(){return e};return __webpack_require__.d(t,"a",t),t},__webpack_require__.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},__webpack_require__.p="",__webpack_require__(__webpack_require__.s=11)}([function(e,t,r){e.exports=r(2)(0)},function(e,t,r){e.exports=r(10)(1)},function(e,t){e.exports=vendor_chunk},function(e,t,r){var n={"./services/abAnalyticsService.js":4,"./templates.js":5};function webpackContext(e){var t=webpackContextResolve(e);return r(t)}function webpackContextResolve(e){var t=n[e];if(!(t+1)){var r=new Error("Cannot find module '"+e+"'");throw r.code="MODULE_NOT_FOUND",r}return t}webpackContext.keys=function webpackContextKeys(){return Object.keys(n)},webpackContext.resolve=webpackContextResolve,e.exports=webpackContext,webpackContext.id=3},function(e,t){angular.module("abAnalyticsServiceModule",[]).service("abAnalyticsService",["$q",function(e){this.getABAnalyticsForComponent=function(){return e.when({aValue:30,bValue:70})}}])},function(e,t){},function(e,t,r){var n={"./abAnalyticsDecorator/abAnalyticsDecorator.js":7,"./abAnalyticsDecorator/abAnalyticsDecoratorController.js":8,"./templates.js":9};function webpackContext(e){var t=webpackContextResolve(e);return r(t)}function webpackContextResolve(e){var t=n[e];if(!(t+1)){var r=new Error("Cannot find module '"+e+"'");throw r.code="MODULE_NOT_FOUND",r}return t}webpackContext.keys=function webpackContextKeys(){return Object.keys(n)},webpackContext.resolve=webpackContextResolve,e.exports=webpackContext,webpackContext.id=6},function(e,t){angular.module("abAnalyticsDecoratorModule",["ysmarteditmoduleTemplates","ui.bootstrap","pascalprecht.translate","abAnalyticsDecoratorControllerModule"]).directive("abAnalyticsDecorator",function(){return{templateUrl:"abAnalyticsDecoratorTemplate.html",restrict:"C",transclude:!0,replace:!1,controller:"abAnalyticsDecoratorController",controllerAs:"$ctrl",bindToController:{smarteditComponentId:"@",smarteditComponentType:"@",smarteditProperties:"@",active:"<"}}})},function(e,t){angular.module("abAnalyticsDecoratorControllerModule",["abAnalyticsServiceModule"]).controller("abAnalyticsDecoratorController",["abAnalyticsService",function(e){this.title="AB Analytics",this.contentTemplate="abAnalyticsDecoratorContentTemplate.html",this.$onInit=function(){e.getABAnalyticsForComponent(this.smarteditComponentId).then(function(e){this.abAnalytics="A: "+e.aValue+" B: "+e.bValue}.bind(this))}}])},function(e,t){angular.module("ysmarteditmoduleTemplates",[]).run(["$templateCache",function(e){"use strict";e.put("web/features/ysmarteditmodule/abAnalyticsDecorator/abAnalyticsDecoratorContentTemplate.html","<div>\n    <p>\n        <strong>{{ $ctrl.smarteditComponentId | limitTo:16 }}{{ $ctrl.smarteditComponentId.length > 16 ? '...' : ''}}</strong>\n    </p>\n    <p>{{ $ctrl.smarteditComponentType | limitTo:16 }}{{ $ctrl.smarteditComponentType.length > 16 ? '...' : ''}}</p>\n    <p>{{ $ctrl.abAnalytics }}</p>\n</div>"),e.put("web/features/ysmarteditmodule/abAnalyticsDecorator/abAnalyticsDecoratorTemplate.html",'<div>\n    <div class="row" data-uib-popover-template="$ctrl.contentTemplate" data-popover-title="{{$ctrl.title}}" data-popover-placement="\'top\'" data-popover-trigger="\'mouseenter\'">\n        <div data-ng-transclude></div>\n    </div>\n</div>')}])},function(e,t){e.exports=smarteditcommons},function(e,t,r){"use strict";r.r(t);var n=r(0);function importAll(e){e.keys().forEach(function(t){e(t)})}var o=r(1);r.d(t,"YSmarteditModule",function(){return a}),function doImport(){importAll(r(3)),importAll(r(6))}();var a=function(){function YSmarteditModule(){}return YSmarteditModule=n.__decorate([Object(o.SeModule)({imports:["smarteditServicesModule","decoratorServiceModule","abAnalyticsDecoratorModule"],initialize:["decoratorService","featureService","perspectiveService",function(e,t,r){"ngInject";e.addMappings({SimpleResponsiveBannerComponent:["abAnalyticsDecorator"],CMSParagraphComponent:["abAnalyticsDecorator"]}),t.addDecorator({key:"abAnalyticsDecorator",nameI18nKey:"ab.analytics.feature.name"}),r.register({key:"abAnalyticsPerspective",nameI18nKey:"ab.analytics.perspective.name",descriptionI18nKey:"ab.analytics.perspective.description",features:["abAnalyticsToolbarItem","abAnalyticsDecorator"],perspectives:[]})}]})],YSmarteditModule)}()}]);