/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
var InflectionPoint = function() {

    this.pageURI = 'test/e2e/inflectionPoint/inflectionPointTest.html';
    browser.get(this.pageURI);
};

InflectionPoint.prototype = Object.create({}, {

    inflectionMenu: {
        get: function() {
            return element(by.id('inflectionPtDropdown'));
        }

    },
    firstInflectionDevice: {
        get: function() {
            return element(by.id("se-device-phone"));
        }
    },
    firstDeviceWidth: {
        get: function() {
            return '480px';
        }
    },
    iframeWidth: {
        get: function() {
            return element(by.tagName('iframe')).getCssValue('width');
        }
    }

});

module.exports = InflectionPoint;
