/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
describe('E2E Test for decorator service module', function() {
    var perspectives = require("../utils/components/Perspectives.js");
    var page = require('../utils/components/Page.js');
    var storefront = require('../utils/components/Storefront.js');
    var sfBuilder = require('../../../smartedit-build/test/e2e/componentObjects/sfBuilderComponentObject');

    beforeEach(function() {
        page.actions.getAndWaitForWholeApp('test/e2e/decorator/decoratorTest.html');
        perspectives.actions.selectPerspective(perspectives.constants.DEFAULT_PERSPECTIVES.ALL);
        page.actions.setWaitForPresence(0);
        browser.switchToIFrame();
    });

    it('WHEN a component is wired with a single decorator THEN I expect only that decorator to be present with the transcluded content', function() {
        expect(perspectives.elements.deprecated_getElementInOverlay(storefront.constants.COMPONENT_1_ID, storefront.constants.COMPONENT_1_TYPE).getText()).toContain('Text_is_been_displayed_TextDisplayDecorator');
        expect(perspectives.elements.deprecated_getElementInOverlay(storefront.constants.COMPONENT_1_ID, storefront.constants.COMPONENT_1_TYPE).getText()).not.toContain('Button_is_been_Displayed');
    });

    it('WHEN a component is wired with some other decorator THEN I expect only that decorator to be present with the transcluded content', function() {
        expect(perspectives.elements.deprecated_getElementInOverlay(storefront.constants.COMPONENT_2_ID, storefront.constants.COMPONENT_2_TYPE).getText()).not.toContain('Text_is_been_displayed_TextDisplayDecorator');
        expect(perspectives.elements.deprecated_getElementInOverlay(storefront.constants.COMPONENT_2_ID, storefront.constants.COMPONENT_2_TYPE).getText()).toContain('Button_is_been_Displayed');
    });

    it('WHEN a component is wired with multiple decorators THEN I expect those decorators to be present with the transcluded content', function() {
        expect(perspectives.elements.deprecated_getElementInOverlay(storefront.constants.COMPONENT_3_ID, storefront.constants.COMPONENT_3_TYPE).getText()).toContain('Text_is_been_displayed_TextDisplayDecorator');
        expect(perspectives.elements.deprecated_getElementInOverlay(storefront.constants.COMPONENT_3_ID, storefront.constants.COMPONENT_3_TYPE).getText()).toContain('Button_is_been_Displayed');
    });

    it('WHEN decorators are wired for both a component and its slot THEN I expect to see both slot and component decorators appear', function() {
        expect(perspectives.elements.deprecated_getElementInOverlay(storefront.constants.TOP_HEADER_SLOT_ID, 'ContentSlot').getText()).toContain('slot_text_is_been_displayed_SlotTextDisplayDecorator');
        expect(perspectives.elements.deprecated_getElementInOverlay(storefront.constants.TOP_HEADER_SLOT_ID, 'ContentSlot').getText()).toContain('Slot_button_is_been_Displayed');
    });

    it('WHEN switching back to preview mode, THEN add to cart button still works', function() {
        perspectives.actions.selectPerspective(perspectives.constants.DEFAULT_PERSPECTIVES.NONE);
        browser.switchToIFrame();
        browser.click(storefront.elements.addToCartButton());
        expect(storefront.elements.addToCartFeedback().getText()).toBe('1');
    });

    it('WHEN soft deep link to another page, decorators are recompiled', function() {

        waitToContainText(storefront.constants.COMPONENT_1_ID, storefront.constants.COMPONENT_1_TYPE, 'homepage');

        sfBuilder.actions.changePageIdWithoutInteration('secondpage');

        waitNotToContainText(storefront.constants.COMPONENT_1_ID, storefront.constants.COMPONENT_1_TYPE, 'homepage');
        waitToContainText(storefront.constants.COMPONENT_1_ID, storefront.constants.COMPONENT_1_TYPE, 'secondpage');

    });

    it('GIVEN component update requires refresh WHEN component is updated THEN the decorators are replayed', function() {
        // GIVEN         
        browser.actions().mouseMove(element(by.id(storefront.constants.COMPONENT_4_ID))).perform();
        var component = perspectives.elements.deprecated_getElementInOverlay(storefront.constants.COMPONENT_4_ID, storefront.constants.COMPONENT_4_TYPE);

        changeTextInComponent(component);
        expect(component.getText()).toContain('Button_has_been_Clicked');

        // WHEN 
        replayComponentDecorators(component);

        // THEN 
        expect(component.getText()).toContain('Button_is_been_Displayed');
    });

    function waitNotToContainText(id, type, expectedText) {
        checkContainsText(id, type, expectedText, false);
    }

    function waitToContainText(id, type, expectedText) {
        checkContainsText(id, type, expectedText, true);
    }

    function checkContainsText(id, type, expectedText, operator) {
        browser.waitUntil(function() {
            try {
                return perspectives.elements.deprecated_getElementInOverlay(id, type).getText().then(function(actualText) {
                    var contains = actualText.indexOf(expectedText) > -1;
                    return operator ? contains : !contains;
                });
            } catch (e) {
                return false;
            }
        }, "failed to see text " + expectedText + " in component of id " + id + " and type" + type);
    }

    function changeTextInComponent(component) {
        var buttonSelector = 'button.main-button';
        clickOnButtonInComponent(component, buttonSelector);
    }


    function replayComponentDecorators(parentComponent) {
        var refreshButtonSelector = 'button.refresh-button';
        return clickOnButtonInComponent(parentComponent, refreshButtonSelector);
    }

    function clickOnButtonInComponent(parentComponent, buttonSelector) {
        return browser.click(parentComponent.element(by.css(buttonSelector)));
    }
});
