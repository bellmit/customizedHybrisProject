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
 * Generated model class for type ProductDtls first defined at extension solviacommercewebservices.
 */
@SuppressWarnings("all")
public class ProductDtlsModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "ProductDtls";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductDtls.slvCustomProductField</code> attribute defined at extension <code>solviacommercewebservices</code>. */
	public static final String SLVCUSTOMPRODUCTFIELD = "slvCustomProductField";
	
	/** <i>Generated constant</i> - Attribute key of <code>ProductDtls.slvCustomProductFieldInteger</code> attribute defined at extension <code>solviacommercewebservices</code>. */
	public static final String SLVCUSTOMPRODUCTFIELDINTEGER = "slvCustomProductFieldInteger";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ProductDtlsModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ProductDtlsModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public ProductDtlsModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDtls.slvCustomProductField</code> attribute defined at extension <code>solviacommercewebservices</code>. 
	 * @return the slvCustomProductField - Solvia Product Custom Field
	 */
	@Accessor(qualifier = "slvCustomProductField", type = Accessor.Type.GETTER)
	public String getSlvCustomProductField()
	{
		return getPersistenceContext().getPropertyValue(SLVCUSTOMPRODUCTFIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDtls.slvCustomProductFieldInteger</code> attribute defined at extension <code>solviacommercewebservices</code>. 
	 * @return the slvCustomProductFieldInteger - Solvia Product Custom Field Integer
	 */
	@Accessor(qualifier = "slvCustomProductFieldInteger", type = Accessor.Type.GETTER)
	public Integer getSlvCustomProductFieldInteger()
	{
		return getPersistenceContext().getPropertyValue(SLVCUSTOMPRODUCTFIELDINTEGER);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductDtls.slvCustomProductField</code> attribute defined at extension <code>solviacommercewebservices</code>. 
	 *  
	 * @param value the slvCustomProductField - Solvia Product Custom Field
	 */
	@Accessor(qualifier = "slvCustomProductField", type = Accessor.Type.SETTER)
	public void setSlvCustomProductField(final String value)
	{
		getPersistenceContext().setPropertyValue(SLVCUSTOMPRODUCTFIELD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>ProductDtls.slvCustomProductFieldInteger</code> attribute defined at extension <code>solviacommercewebservices</code>. 
	 *  
	 * @param value the slvCustomProductFieldInteger - Solvia Product Custom Field Integer
	 */
	@Accessor(qualifier = "slvCustomProductFieldInteger", type = Accessor.Type.SETTER)
	public void setSlvCustomProductFieldInteger(final Integer value)
	{
		getPersistenceContext().setPropertyValue(SLVCUSTOMPRODUCTFIELDINTEGER, value);
	}
	
}
