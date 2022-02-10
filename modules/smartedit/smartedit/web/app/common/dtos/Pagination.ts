/**
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 * @module smartutils
 */
/**
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 * @module smartutils
 */
/**
 * @ngdoc object
 * @name Page.object:Pagination
 * @description
 * Object containing pagination metadata
 */
// CMSX-10980: Copy the definition of Pagination from 20.11 to here.
export interface Pagination {
	/**
	 * @ngdoc property
	 * @name Pagination.object:count
	 * @description
	 * Represent number of items in current batch
	 */
	count: number;
	/**
	 * @ngdoc property
	 * @name Pagination.object:page
	 * @description
	 * Represents a page index where batch is returned from
	 */
	page: number;
	/**
	 * @ngdoc property
	 * @name Pagination.object:totalCount
	 * @description
	 * Represent number of all available items
	 */
	totalCount: number;
	/**
	 * @ngdoc property
	 * @name Pagination.object:totalPages
	 * @description
	 * Represent number of all pages
	 */
	totalPages: number;
	/**
	 * @ngdoc property
	 * @name Pagination.object:hasNext
	 * @description
	 * Flag that shows whether next page can be requested
	 */
	hasNext?: boolean;
	/**
	 * @ngdoc property
	 * @name Pagination.object:hasPrevious
	 * @description
	 * Flag that shows whether previous page can be requested
	 */
	hasPrevious?: boolean;
}
