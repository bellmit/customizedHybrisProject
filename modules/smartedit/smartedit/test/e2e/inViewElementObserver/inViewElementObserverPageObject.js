/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
module.exports = (function() {

    var page = {};

    page.actions = {
        removeFirstComponent: function() {
            return browser.click(by.id('removeFirstComponent'));
        },
        addComponentAsFirst: function() {
            return browser.click(by.id('addComponentAsFirst'));
        },
    };

    page.elements = {

        getReallyEligibleElements: function() {
            return element(by.id('total-eligible-components')).getText();
        },
        getEligibleElements: function() {
            return element(by.id('total-eligible-components-from-observer')).getText();
        },
        getInViewElements: function() {
            return element(by.id('total-visible-eligible-components-from-observer')).getText();
        }
    };

    page.assertions = {
        inSync: function(expectedInViewElementsCount) {
            browser.switchToIFrame();
            browser.waitUntil(function() {
                return protractor.promise.all([page.elements.getReallyEligibleElements(), page.elements.getEligibleElements()]).then(function(array) {
                    return Number(array[0]) === Number(array[1]);
                });
            }, "inViewElementObserver failed to observe all eligible elements");

            browser.waitUntil(function() {
                return page.elements.getInViewElements().then(function(text) {
                    return Number(text) === Number(expectedInViewElementsCount);
                });
            }, "Expected " + expectedInViewElementsCount + " elements to be visible");

        }
    };

    return page;
})();
