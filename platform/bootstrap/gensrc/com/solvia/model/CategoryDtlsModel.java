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
 * Generated model class for type CategoryDtls first defined at extension solviacommercewebservices.
 */
@SuppressWarnings("all")
public class CategoryDtlsModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "CategoryDtls";
	
	/** <i>Generated constant</i> - Attribute key of <code>CategoryDtls.slvCustomCategoryField</code> attribute defined at extension <code>solviacommercewebservices</code>. */
	public static final String SLVCUSTOMCATEGORYFIELD = "slvCustomCategoryField";
	
	/** <i>Generated constant</i> - Attribute key of <code>CategoryDtls.slvCustomCategoryFieldInteger</code> attribute defined at extension <code>solviacommercewebservices</code>. */
	public static final String SLVCUSTOMCATEGORYFIELDINTEGER = "slvCustomCategoryFieldInteger";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CategoryDtlsModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CategoryDtlsModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public CategoryDtlsModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryDtls.slvCustomCategoryField</code> attribute defined at extension <code>solviacommercewebservices</code>. 
	 * @return the slvCustomCategoryField - Solvia Product Custom Field
	 */
	@Accessor(qualifier = "slvCustomCategoryField", type = Accessor.Type.GETTER)
	public String getSlvCustomCategoryField()
	{
		return getPersistenceContext().getPropertyValue(SLVCUSTOMCATEGORYFIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryDtls.slvCustomCategoryFieldInteger</code> attribute defined at extension <code>solviacommercewebservices</code>. 
	 * @return the slvCustomCategoryFieldInteger - Solvia Product Custom Field Integer
	 */
	@Accessor(qualifier = "slvCustomCategoryFieldInteger", type = Accessor.Type.GETTER)
	public Integer getSlvCustomCategoryFieldInteger()
	{
		return getPersistenceContext().getPropertyValue(SLVCUSTOMCATEGORYFIELDINTEGER);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CategoryDtls.slvCustomCategoryField</code> attribute defined at extension <code>solviacommercewebservices</code>. 
	 *  
	 * @param value the slvCustomCategoryField - Solvia Product Custom Field
	 */
	@Accessor(qualifier = "slvCustomCategoryField", type = Accessor.Type.SETTER)
	public void setSlvCustomCategoryField(final String value)
	{
		getPersistenceContext().setPropertyValue(SLVCUSTOMCATEGORYFIELD, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CategoryDtls.slvCustomCategoryFieldInteger</code> attribute defined at extension <code>solviacommercewebservices</code>. 
	 *  
	 * @param value the slvCustomCategoryFieldInteger - Solvia Product Custom Field Integer
	 */
	@Accessor(qualifier = "slvCustomCategoryFieldInteger", type = Accessor.Type.SETTER)
	public void setSlvCustomCategoryFieldInteger(final Integer value)
	{
		getPersistenceContext().setPropertyValue(SLVCUSTOMCATEGORYFIELDINTEGER, value);
	}
	
}
