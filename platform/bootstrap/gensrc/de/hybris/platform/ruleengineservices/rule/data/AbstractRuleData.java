/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ruleengineservices.rule.data;

import java.io.Serializable;
import de.hybris.platform.ruleengineservices.rule.data.RuleParameterData;
import java.util.Map;

public abstract  class AbstractRuleData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AbstractRuleData.definitionId</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String definitionId;

	/** <i>Generated property</i> for <code>AbstractRuleData.parameters</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Map<String,RuleParameterData> parameters;
	
	public AbstractRuleData()
	{
		// default constructor
	}
	
	public void setDefinitionId(final String definitionId)
	{
		this.definitionId = definitionId;
	}

	public String getDefinitionId() 
	{
		return definitionId;
	}
	
	public void setParameters(final Map<String,RuleParameterData> parameters)
	{
		this.parameters = parameters;
	}

	public Map<String,RuleParameterData> getParameters() 
	{
		return parameters;
	}
	


}