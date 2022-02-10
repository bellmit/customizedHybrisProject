/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ruleengineservices.compiler;

import de.hybris.platform.ruleengineservices.compiler.AbstractRuleIrBooleanCondition;
import java.util.Map;

public  class RuleIrExecutableCondition extends AbstractRuleIrBooleanCondition 
{

 

	/** <i>Generated property</i> for <code>RuleIrExecutableCondition.conditionId</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String conditionId;

	/** <i>Generated property</i> for <code>RuleIrExecutableCondition.conditionParameters</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Map<String,Object> conditionParameters;
	
	public RuleIrExecutableCondition()
	{
		// default constructor
	}
	
	public void setConditionId(final String conditionId)
	{
		this.conditionId = conditionId;
	}

	public String getConditionId() 
	{
		return conditionId;
	}
	
	public void setConditionParameters(final Map<String,Object> conditionParameters)
	{
		this.conditionParameters = conditionParameters;
	}

	public Map<String,Object> getConditionParameters() 
	{
		return conditionParameters;
	}
	


}
