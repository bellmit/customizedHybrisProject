/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
module.exports = (function() {
    var componentObject = {};

    componentObject.elements = {
        getComponent: function(hostId) {
            return element(by.css('#' + hostId));
        },
        getAllOptions: function(hostId) {
            return componentObject.elements
                .getComponent(hostId)
                .all(by.css('.ui-select-choices-row .y-select-default-item'));
        },
        getOptionByIndex: function(hostId, index) {
            return componentObject.elements.getAllOptions(hostId).get(index);
        },
        getDropdown: function(hostId) {
            return componentObject.elements
                .getComponent(hostId)
                .element(by.css('.select2-result-single'));
        },
        getDropdownToggle: function(hostId) {
            return componentObject.elements.getComponent(hostId).element(by.css('.ui-select-toggle')).element(by.xpath('..'));
        },
        getSelectedOption: function(hostId) {
            return componentObject.elements.getComponent(hostId).element(by.css('.select2-chosen .y-select-item-printer'));
        },
        getOptionByText: function(hostId, text) {
            return componentObject.elements
                .getComponent(hostId)
                .element(by.cssContainingText('.ui-select-choices-row .y-select-default-item', text));
        }
    };

    componentObject.actions = {
        toggleSelector: function(hostId) {
            browser.click(componentObject.elements.getDropdownToggle(hostId));
            componentObject.assertions.dropdownIsOpened(hostId);
        },
        selectOptionByText: function(hostId, text) {
            browser.click(componentObject.elements.getOptionByText(hostId, text));
        }
    };

    componentObject.assertions = {
        selectedOptionContainsText: function(hostId, expectedText) {
            var whenOption = componentObject.elements.getSelectedOption(hostId);
            browser.waitForPresence(whenOption);

            var actual = whenOption.getText();

            expect(actual).toContain(expectedText);
        },
        dropdownIsOpened: function(hostId) {
            browser.waitForPresence(componentObject.elements.getDropdown(hostId));
        },
        optionContainsTextByIndex: function(hostId, expectedText, index) {
            var whenOption = componentObject.elements.getOptionByIndex(hostId, index);
            browser.waitForPresence(whenOption);

            var actual = whenOption.getText();

            expect(actual).toContain(expectedText);
        }
    };

    return componentObject;
})();
