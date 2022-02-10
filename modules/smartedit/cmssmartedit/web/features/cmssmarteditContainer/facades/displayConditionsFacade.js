/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
/**
 * @ngdoc overview
 * @name displayConditionsFacadeModule
 * @description
 *
 * This module provides a facade module for page display conditions.
 *
 */
angular
    .module('displayConditionsFacadeModule', [
        'pageServiceModule',
        'pageRestrictionsServiceModule',
    ])

    /**
     * @ngdoc service
     * @name displayConditionsFacadeModule.service:displayConditionsFacade
     * @description
     *
     * Service defined to retrieve information related to the display conditions of a given page:
     * - Whether the page is either of 'primary' or 'variation' display type.
     * - The name of the primary page associated to a variation one.
     * - The name of the display type of a given page ("primary" or "variant").
     * - The description of the display type of a given page ("primary" or "variant").
     *
     */
    .service('displayConditionsFacade', function(
        pageService,
        pageRestrictionsService,
        $q,
        $log
    ) {
        this.getPageInfoForPageUid = function(pageId) {
            var pagePromise = pageService.getPageById(pageId);
            var displayConditionsPromise = pageService.isPagePrimary(pageId);

            var allPromises = $q.all([pagePromise, displayConditionsPromise]);
            return allPromises.then(function(values) {
                return {
                    pageName: values[0].name,
                    pageType: values[0].typeCode,
                    isPrimary: values[1],
                };
            });
        };

        this.getVariationsForPageUid = function(primaryPageId) {
            return pageService
                .getVariationPages(primaryPageId)
                .then(function(variationPages) {
                    if (variationPages.length === 0) {
                        return $q.when([]);
                    }

                    var restrictionsCountsPromise = $q.all(
                        variationPages.map(function(variationPage) {
                            return pageRestrictionsService.getPageRestrictionsCountForPageUID(
                                variationPage.uid
                            );
                        })
                    );

                    return restrictionsCountsPromise.then(function(restrictionCounts) {
                        return variationPages.map(function(variationPage, index) {
                            return {
                                pageName: variationPage.name,
                                creationDate: variationPage.creationtime,
                                restrictions: restrictionCounts[index],
                            };
                        });
                    });
                });
        };

        this.updatePage = function(pageId, pageData) {
            return pageService.updatePageById(pageId, pageData);
        };

        /**
         * @ngdoc method
         * @name displayConditionsFacadeModule.service:displayConditionsFacade#isPrimaryPage
         * @methodOf displayConditionsFacadeModule.service:displayConditionsFacade
         *
         * @description
         * Check whether the tested page is of type 'primary'.
         *
         * @param {String} The identifier of the tested page
         * @return {Promise} Promise resolving in a boolean indicated whether the tested page is of type 'primary'
         */
        this.isPagePrimary = function(pageId) {
            return pageService.isPagePrimary(pageId);
        };

        /**
         * @ngdoc method
         * @name displayConditionsFacadeModule.service:displayConditionsFacade#getPrimaryPageForVariationPage
         * @methodOf displayConditionsFacadeModule.service:displayConditionsFacade
         *
         * @description
         * Returns data related to the 'primary' page associated with the tested 'variation' page.
         *
         * @param {String} The identifier of the tested 'variation' page
         * @return {Promise} Promise resolving in an object containing uid, name and label of the associated primary page
         */
        this.getPrimaryPageForVariationPage = function(variationPageId) {
            return pageService
                .getPrimaryPage(variationPageId)
                .then(function(primaryPage) {
                    return {
                        uid: primaryPage.uid,
                        name: primaryPage.name,
                        label: primaryPage.label,
                    };
                });
        };

        /** Fetches a pagination page with array of pages that can be displayed in a dropdown */
        this.getPrimaryPagesForPageType = function(
            pageTypeCode,
            uriParams,
            fetchPageParams
        ) {
            return pageService
                .getPaginatedPrimaryPagesForPageType(
                    pageTypeCode,
                    uriParams,
                    fetchPageParams
                )
                .then(function(page) {
                    var targetPage = {
                        pagination: page.pagination,
                        results: null,
                    };
                    targetPage.results = page.response.map(function(rawPage) {
                        return {
                            id: rawPage.uid,
                            label: rawPage.name || rawPage.label,
                        };
                    });
                    return targetPage;
                })
                .catch(function(error) {
                    $log.warn(
                        '[getPrimaryPagesForPageType] - Cannot retrieve list of primary pages. ' + error
                    );
                    return undefined;
                });
        };
    });
