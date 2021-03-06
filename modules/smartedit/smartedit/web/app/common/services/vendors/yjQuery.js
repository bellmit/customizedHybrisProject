/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
/**
 * @ngdoc overview
 * @name yjqueryModule
 * @description
 * This module manages the use of the jQuery library in SmartEdit.
 * It enables smartEdit to work with a "noConflict" version of jQuery in a storefront that may contain another version
 */
angular.module('yjqueryModule', [])
    /**
     * As a configuration step for this module, add the getCssPath method to jquery selectors. This method will return
     * the CSS path of the wrapped JQuery element.
     */
    .run(function(yjQuery) {
        yjQuery.fn.extend({
            getCssPath: function() {
                var path;
                var node = this;
                while (node.length) {
                    var realNode = node[0];
                    var name = realNode.className;
                    if (realNode.tagName === 'BODY') {
                        break;
                    }
                    node = node.parent();
                    path = name + (path ? '>' + path : '');
                }
                return path;
            }
        });
    })
    /**
     * @ngdoc object
     * @name yjqueryModule.yjQuery
     * @description
     * 
     * Expose a jQuery wrapping factory all the while preserving potentially pre-existing jQuery in storefront and smartEditContainer
     */
    /* forbiddenNameSpaces window.$:false */
    .factory('yjQuery', function() {

        var namespace = "smarteditJQuery";

        if (!window[namespace]) {
            if (window.$ && window.$.noConflict) {
                window[namespace] = window.$.noConflict(true);
            } else {
                window[namespace] = window.$;
            }
        }
        return window[namespace];
    });
