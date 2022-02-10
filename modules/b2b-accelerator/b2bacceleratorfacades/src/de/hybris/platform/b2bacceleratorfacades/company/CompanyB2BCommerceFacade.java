/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.b2bacceleratorfacades.company;

import de.hybris.platform.b2bcommercefacades.company.data.B2BBudgetData;
import de.hybris.platform.b2bcommercefacades.company.data.B2BUnitData;
import de.hybris.platform.b2bcommercefacades.company.data.B2BUnitNodeData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

import java.util.List;
import java.util.Map;


/**
 * Facade which services organization management.
 *
 * @deprecated Since 6.0. Use {@link de.hybris.platform.b2bcommercefacades.company.B2BCostCenterFacade},
 *             {@link de.hybris.platform.b2bcommercefacades.company.B2BUserGroupFacade},
 *             {@link de.hybris.platform.b2bcommercefacades.company.B2BUnitFacade},
 *             {@link de.hybris.platform.b2bcommercefacades.company.B2BBudgetFacade},
 *             {@link de.hybris.platform.b2bcommercefacades.company.B2BUserFacade},
 *             {@link de.hybris.platform.b2bapprovalprocessfacades.company.B2BApprovalProcessFacade},
 *             {@link de.hybris.platform.b2bapprovalprocessfacades.company.B2BApproverFacade} and
 *             {@link de.hybris.platform.b2bapprovalprocessfacades.company.B2BPermissionFacade} instead.
 */
@Deprecated(since = "6.0")
public interface CompanyB2BCommerceFacade
{
	/**
	 * Gets a business unit based on unique identifier
	 *
	 * @param uid
	 *           A unique id of a business unit.
	 * @return A business unit or null if not found.
	 */
	B2BUnitData getUnitForUid(String uid);

	/**
	 * Gets a list of {@link B2BUnitNodeData} representing each unit in the branch based on the session customer
	 *
	 * @return A list of units in the branch.
	 */
	List<B2BUnitNodeData> getBranchNodes();

	/**
	 * Gets a business unit assigned to the current session user with all the siblings retrieved via
	 * {@link de.hybris.platform.b2bcommercefacades.company.data.B2BUnitNodeData#getChildren()}
	 *
	 * @return A business unit assigned to the session customer
	 */
	B2BUnitData getParentUnit();

	/**
	 * Find a B2BCustomer based on a uid
	 *
	 * @param uid
	 *           A uid of a {@link de.hybris.platform.b2b.model.B2BCustomerModel}
	 * @return A customer data object or null if a customer with <param>uid</param> does not exist
	 */
	CustomerData getCustomerForUid(String uid);

	/**
	 * Get all currencies
	 *
	 * @return CurrencyData
	 */
	List<String> getAllCurrencies();

	/**
	 * Get a collection of available business processes for OrderApproval
	 *
	 * @return A map where the key is process code and value is process name based on the current session locale
	 */
	Map<String, String> getBusinessProcesses();


	/**
	 * Get paged B2Budgets for both Manage budgets and Select Budgets for CostCenters
	 *
	 * @param pageableData
	 * @return {@link SearchPageData} of found budgets (could be empty)
	 */
	SearchPageData<B2BBudgetData> getPagedBudgets(PageableData pageableData);

	/**
	 * Get B2BBudgetData for a given budget code
	 *
	 * @param budgetCode
	 * @return {@link B2BBudgetData} if found or null otherwise
	 */
	B2BBudgetData getBudgetDataForCode(String budgetCode);

	/**
	 * A list of usergroup codes a b2b customer can be assigned to
	 *
	 * @return A list of {@link de.hybris.platform.core.model.user.UserGroupModel#UID} a b2b customer can be assigned to
	 */
	List<String> getUserGroups();

	/**
	 * Get the name of the current B2BStore to which the user is logged in
	 *
	 * @return Name of the current B2BStore
	 */
	String getCurrentStore();
}
