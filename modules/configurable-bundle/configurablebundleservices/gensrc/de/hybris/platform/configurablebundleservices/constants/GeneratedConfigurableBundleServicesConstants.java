/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 9, 2022, 11:43:51 AM                    ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.configurablebundleservices.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast"})
public class GeneratedConfigurableBundleServicesConstants
{
	public static final String EXTENSIONNAME = "configurablebundleservices";
	public static class TC
	{
		public static final String ABSTRACTBUNDLERULE = "AbstractBundleRule".intern();
		public static final String ABSTRACTBUNDLERULETARGETPRODUCTSASSIGNEDCONSTRAINT = "AbstractBundleRuleTargetProductsAssignedConstraint".intern();
		public static final String BUNDLECAROUSELCOMPONENT = "BundleCarouselComponent".intern();
		public static final String BUNDLERULETYPEENUM = "BundleRuleTypeEnum".intern();
		public static final String BUNDLESELECTIONCRITERIA = "BundleSelectionCriteria".intern();
		public static final String BUNDLETEMPLATE = "BundleTemplate".intern();
		public static final String BUNDLETEMPLATEPRODUCTSASSIGNEDCONSTRAINT = "BundleTemplateProductsAssignedConstraint".intern();
		public static final String BUNDLETEMPLATESTATUS = "BundleTemplateStatus".intern();
		public static final String BUNDLETEMPLATESTATUSENUM = "BundleTemplateStatusEnum".intern();
		public static final String CHANGEPRODUCTPRICEBUNDLERULE = "ChangeProductPriceBundleRule".intern();
		public static final String DISABLEPRODUCTBUNDLERULE = "DisableProductBundleRule".intern();
		public static final String PICKEXACTLYNBUNDLESELECTIONCRITERIA = "PickExactlyNBundleSelectionCriteria".intern();
		public static final String PICKNTOMBUNDLESELECTIONCRITERIA = "PickNToMBundleSelectionCriteria".intern();
	}
	public static class Attributes
	{
		public static class Cart
		{
			public static final String LASTMODIFIEDENTRIES = "lastModifiedEntries".intern();
		}
		public static class CartEntry
		{
			public static final String LASTMODIFIEDMASTERCART = "lastModifiedMasterCart".intern();
		}
		public static class Product
		{
			public static final String BUNDLETEMPLATES = "bundleTemplates".intern();
			public static final String CONDITIONALBUNDLERULES = "conditionalBundleRules".intern();
			public static final String SOLDINDIVIDUALLY = "soldIndividually".intern();
			public static final String TARGETBUNDLERULES = "targetBundleRules".intern();
		}
	}
	public static class Enumerations
	{
		public static class BundleRuleTypeEnum
		{
			public static final String ANY = "ANY".intern();
			public static final String ALL = "ALL".intern();
		}
		public static class BundleTemplateStatusEnum
		{
			public static final String CHECK = "check".intern();
			public static final String UNAPPROVED = "unapproved".intern();
			public static final String APPROVED = "approved".intern();
			public static final String ARCHIVED = "archived".intern();
		}
		public static class GroupType
		{
			public static final String CONFIGURABLEBUNDLE = "CONFIGURABLEBUNDLE".intern();
		}
	}
	public static class Relations
	{
		public static final String ABSTRACTBUNDLERULESCONDITIONALPRODUCTSRELATION = "AbstractBundleRulesConditionalProductsRelation".intern();
		public static final String ABSTRACTBUNDLERULESTARGETPRODUCTSRELATION = "AbstractBundleRulesTargetProductsRelation".intern();
		public static final String BUNDLETEMPLATEDISABLERULESRELATION = "BundleTemplateDisableRulesRelation".intern();
		public static final String BUNDLETEMPLATEPRICERULESRELATION = "BundleTemplatePriceRulesRelation".intern();
		public static final String BUNDLETEMPLATERELATION = "BundleTemplateRelation".intern();
		public static final String BUNDLETEMPLATESTATUSRELATION = "BundleTemplateStatusRelation".intern();
		public static final String LASTMODIFIEDENTRIESRELATION = "LastModifiedEntriesRelation".intern();
		public static final String PRODUCTSBUNDLETEMPLATESRELATION = "ProductsBundleTemplatesRelation".intern();
		public static final String REQUIREDBUNDLETEMPLATESDEPENDENTBUNDLETEMPLATESRELATION = "RequiredBundleTemplatesDependentBundleTemplatesRelation".intern();
	}
	
	protected GeneratedConfigurableBundleServicesConstants()
	{
		// private constructor
	}
	
	
}
