/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:44 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.customersupportbackoffice.data;

import java.io.Serializable;
import de.hybris.platform.ticket.enums.CsResolutionType;

public  class CsCloseTicketForm  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CsCloseTicketForm.resolution</code> property defined at extension <code>customersupportbackoffice</code>. */
		
	private CsResolutionType resolution;

	/** <i>Generated property</i> for <code>CsCloseTicketForm.message</code> property defined at extension <code>customersupportbackoffice</code>. */
		
	private String message;
	
	public CsCloseTicketForm()
	{
		// default constructor
	}
	
	public void setResolution(final CsResolutionType resolution)
	{
		this.resolution = resolution;
	}

	public CsResolutionType getResolution() 
	{
		return resolution;
	}
	
	public void setMessage(final String message)
	{
		this.message = message;
	}

	public String getMessage() 
	{
		return message;
	}
	


}
