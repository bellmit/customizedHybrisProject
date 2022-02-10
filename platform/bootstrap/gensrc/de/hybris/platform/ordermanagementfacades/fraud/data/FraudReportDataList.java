/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ordermanagementfacades.fraud.data;

import java.io.Serializable;
import de.hybris.platform.ordermanagementfacades.fraud.data.FraudReportData;
import java.util.List;

public  class FraudReportDataList  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>FraudReportDataList.reports</code> property defined at extension <code>ordermanagementfacades</code>. */
		
	private List<FraudReportData> reports;
	
	public FraudReportDataList()
	{
		// default constructor
	}
	
	public void setReports(final List<FraudReportData> reports)
	{
		this.reports = reports;
	}

	public List<FraudReportData> getReports() 
	{
		return reports;
	}
	


}
