/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 */
package de.hybris.platform.cms2.namedquery;

import de.hybris.platform.cms2.enums.SortDirection;

public class Sort {

	/** <i>Generated property</i> for <code>Sort.parameter</code> property defined at extension <code>cms2</code>. */
	private String parameter;
	/** <i>Generated property</i> for <code>Sort.direction</code> property defined at extension <code>cms2</code>. */
	private SortDirection direction;


		public void setParameter(final String parameter)
	{
		this.parameter = parameter;
	}

	public Sort withParameter(final String parameter)
	{
		this.parameter = parameter;
		return this;
	}

			
	public String getParameter() 
	{
		return parameter;
	}

	
		public void setDirection(final SortDirection direction)
	{
		this.direction = direction;
	}

	public Sort withDirection(final SortDirection direction)
	{
		this.direction = direction;
		return this;
	}

			
	public SortDirection getDirection() 
	{
		return direction;
	}

	}
