/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:45 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ruleengineservices.compiler;

import java.io.Serializable;

public  class RuleIrVariable  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RuleIrVariable.name</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>RuleIrVariable.type</code> property defined at extension <code>ruleengineservices</code>. */
		
	private Class<?> type;

	/** <i>Generated property</i> for <code>RuleIrVariable.path</code> property defined at extension <code>ruleengineservices</code>. */
		
	private String[] path;
	
	public RuleIrVariable()
	{
		// default constructor
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	
	public void setType(final Class<?> type)
	{
		this.type = type;
	}

	public Class<?> getType() 
	{
		return type;
	}
	
	public void setPath(final String[] path)
	{
		this.path = path;
	}

	public String[] getPath() 
	{
		return path;
	}
	


}
