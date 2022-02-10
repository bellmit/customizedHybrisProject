/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 10, 2022, 8:39:43 PM                    ---
 * ----------------------------------------------------------------
 */
package com.solvia.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type SolviaCustomerDetails first defined at extension solviacommercewebservices.
 */
@SuppressWarnings("all")
public class SolviaCustomerDetailsModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "SolviaCustomerDetails";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolviaCustomerDetails.slvCustomField</code> attribute defined at extension <code>solviacommercewebservices</code>. */
	public static final String SLVCUSTOMFIELD = "slvCustomField";
	
	/** <i>Generated constant</i> - Attribute key of <code>SolviaCustomerDetails.slvCustomFieldInteger</code> attribute defined at extension <code>solviacommercewebservices</code>. */
	public static final String SLVCUSTOMFIELDINTEGER = "slvCustomFieldInteger";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SolviaCustomerDetailsModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SolviaCustomerDetailsModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SolviaCustomerDetailsModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolviaCustomerDetails.slvCustomField</code> attribute defined at extension <code>solviacommercewebservices</code>. 
	 * @return the slvCustomField - Solvia Customer Custom Field
	 */
	@Accessor(qualifier = "slvCustomField", type = Accessor.Type.GETTER)
	public String getSlvCustomField()
	{
		return getPersistenceContext().getPropertyValue(SLVCUSTOMFIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolviaCustomerDetails.slvCustomFieldInteger</code> attribute defined at extension <code>solviacommercewebservices</code>. 
	 * @return the slvCustomFieldInteger - Solvia Customer Custom Field Integer
	 */
	@Accessor(qualifier = "slvCustomFieldInteger", type = Accessor.Type.GETTER)
	public Integer getSlvCustomFieldInteger()
	{
		return getPersistenceContext().getPropertyValue(SLVCUSTOMFIELDINTEGER);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolviaCustomerDetails.slvCustomField</code> attribute defined at extension <code>solviacommercewebservices</code>. 
	 *  
	 * @param value the slvCustomField - Solvia Customer Custom Field
	 */
	@Accessor(qualifier = "slvCustomField", type = Accessor.Type.SETTER)
	public void setSlvCustomField(final String value)
	{
		getPersistenceContext().setPropertyValue(SLVCUSTOMFIELD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>SolviaCustomerDetails.slvCustomFieldInteger</code> attribute defined at extension <code>solviacommercewebservices</code>. 
	 *  
	 * @param value the slvCustomFieldInteger - Solvia Customer Custom Field Integer
	 */
	@Accessor(qualifier = "slvCustomFieldInteger", type = Accessor.Type.SETTER)
	public void setSlvCustomFieldInteger(final Integer value)
	{
		getPersistenceContext().setPropertyValue(SLVCUSTOMFIELDINTEGER, value);
	}
	
}
