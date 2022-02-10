/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at Feb 10, 2022, 8:39:46 PM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.product;

import java.io.Serializable;
import de.hybris.platform.commercewebservicescommons.dto.product.ReviewWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * Representation of a Review List
 */
@ApiModel(value="ReviewList", description="Representation of a Review List")
public  class ReviewListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** List of reviews<br/><br/><i>Generated property</i> for <code>ReviewListWsDTO.reviews</code> property defined at extension <code>commercewebservicescommons</code>. */
	@ApiModelProperty(name="reviews", value="List of reviews") 	
	private List<ReviewWsDTO> reviews;
	
	public ReviewListWsDTO()
	{
		// default constructor
	}
	
	public void setReviews(final List<ReviewWsDTO> reviews)
	{
		this.reviews = reviews;
	}

	public List<ReviewWsDTO> getReviews() 
	{
		return reviews;
	}
	


}
