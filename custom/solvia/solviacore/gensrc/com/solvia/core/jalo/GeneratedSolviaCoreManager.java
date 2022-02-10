/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 9, 2022, 11:43:51 AM                    ---
 * ----------------------------------------------------------------
 */
package com.solvia.core.jalo;

import com.solvia.core.constants.SolviaCoreConstants;
import com.solvia.core.jalo.ApparelProduct;
import com.solvia.core.jalo.ApparelSizeVariantProduct;
import com.solvia.core.jalo.ApparelStyleVariantProduct;
import com.solvia.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SolviaCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSolviaCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("slvCustomField", AttributeMode.INITIAL);
		tmp.put("slvCustomFieldInteger", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("slvProductCustomField", AttributeMode.INITIAL);
		tmp.put("slvProductCustomFieldInteger", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("slvCategoryCustomField", AttributeMode.INITIAL);
		tmp.put("slvCategoryCustomFieldInteger", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.category.jalo.Category", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SolviaCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SolviaCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SolviaCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SolviaCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return SolviaCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.slvCategoryCustomField</code> attribute.
	 * @return the slvCategoryCustomField
	 */
	public String getSlvCategoryCustomField(final SessionContext ctx, final Category item)
	{
		return (String)item.getProperty( ctx, SolviaCoreConstants.Attributes.Category.SLVCATEGORYCUSTOMFIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.slvCategoryCustomField</code> attribute.
	 * @return the slvCategoryCustomField
	 */
	public String getSlvCategoryCustomField(final Category item)
	{
		return getSlvCategoryCustomField( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.slvCategoryCustomField</code> attribute. 
	 * @param value the slvCategoryCustomField
	 */
	public void setSlvCategoryCustomField(final SessionContext ctx, final Category item, final String value)
	{
		item.setProperty(ctx, SolviaCoreConstants.Attributes.Category.SLVCATEGORYCUSTOMFIELD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.slvCategoryCustomField</code> attribute. 
	 * @param value the slvCategoryCustomField
	 */
	public void setSlvCategoryCustomField(final Category item, final String value)
	{
		setSlvCategoryCustomField( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.slvCategoryCustomFieldInteger</code> attribute.
	 * @return the slvCategoryCustomFieldInteger
	 */
	public Integer getSlvCategoryCustomFieldInteger(final SessionContext ctx, final Category item)
	{
		return (Integer)item.getProperty( ctx, SolviaCoreConstants.Attributes.Category.SLVCATEGORYCUSTOMFIELDINTEGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.slvCategoryCustomFieldInteger</code> attribute.
	 * @return the slvCategoryCustomFieldInteger
	 */
	public Integer getSlvCategoryCustomFieldInteger(final Category item)
	{
		return getSlvCategoryCustomFieldInteger( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.slvCategoryCustomFieldInteger</code> attribute. 
	 * @return the slvCategoryCustomFieldInteger
	 */
	public int getSlvCategoryCustomFieldIntegerAsPrimitive(final SessionContext ctx, final Category item)
	{
		Integer value = getSlvCategoryCustomFieldInteger( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.slvCategoryCustomFieldInteger</code> attribute. 
	 * @return the slvCategoryCustomFieldInteger
	 */
	public int getSlvCategoryCustomFieldIntegerAsPrimitive(final Category item)
	{
		return getSlvCategoryCustomFieldIntegerAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.slvCategoryCustomFieldInteger</code> attribute. 
	 * @param value the slvCategoryCustomFieldInteger
	 */
	public void setSlvCategoryCustomFieldInteger(final SessionContext ctx, final Category item, final Integer value)
	{
		item.setProperty(ctx, SolviaCoreConstants.Attributes.Category.SLVCATEGORYCUSTOMFIELDINTEGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.slvCategoryCustomFieldInteger</code> attribute. 
	 * @param value the slvCategoryCustomFieldInteger
	 */
	public void setSlvCategoryCustomFieldInteger(final Category item, final Integer value)
	{
		setSlvCategoryCustomFieldInteger( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.slvCategoryCustomFieldInteger</code> attribute. 
	 * @param value the slvCategoryCustomFieldInteger
	 */
	public void setSlvCategoryCustomFieldInteger(final SessionContext ctx, final Category item, final int value)
	{
		setSlvCategoryCustomFieldInteger( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.slvCategoryCustomFieldInteger</code> attribute. 
	 * @param value the slvCategoryCustomFieldInteger
	 */
	public void setSlvCategoryCustomFieldInteger(final Category item, final int value)
	{
		setSlvCategoryCustomFieldInteger( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.slvCustomField</code> attribute.
	 * @return the slvCustomField
	 */
	public String getSlvCustomField(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, SolviaCoreConstants.Attributes.Customer.SLVCUSTOMFIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.slvCustomField</code> attribute.
	 * @return the slvCustomField
	 */
	public String getSlvCustomField(final Customer item)
	{
		return getSlvCustomField( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.slvCustomField</code> attribute. 
	 * @param value the slvCustomField
	 */
	public void setSlvCustomField(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, SolviaCoreConstants.Attributes.Customer.SLVCUSTOMFIELD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.slvCustomField</code> attribute. 
	 * @param value the slvCustomField
	 */
	public void setSlvCustomField(final Customer item, final String value)
	{
		setSlvCustomField( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.slvCustomFieldInteger</code> attribute.
	 * @return the slvCustomFieldInteger
	 */
	public Integer getSlvCustomFieldInteger(final SessionContext ctx, final Customer item)
	{
		return (Integer)item.getProperty( ctx, SolviaCoreConstants.Attributes.Customer.SLVCUSTOMFIELDINTEGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.slvCustomFieldInteger</code> attribute.
	 * @return the slvCustomFieldInteger
	 */
	public Integer getSlvCustomFieldInteger(final Customer item)
	{
		return getSlvCustomFieldInteger( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.slvCustomFieldInteger</code> attribute. 
	 * @return the slvCustomFieldInteger
	 */
	public int getSlvCustomFieldIntegerAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Integer value = getSlvCustomFieldInteger( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.slvCustomFieldInteger</code> attribute. 
	 * @return the slvCustomFieldInteger
	 */
	public int getSlvCustomFieldIntegerAsPrimitive(final Customer item)
	{
		return getSlvCustomFieldIntegerAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.slvCustomFieldInteger</code> attribute. 
	 * @param value the slvCustomFieldInteger
	 */
	public void setSlvCustomFieldInteger(final SessionContext ctx, final Customer item, final Integer value)
	{
		item.setProperty(ctx, SolviaCoreConstants.Attributes.Customer.SLVCUSTOMFIELDINTEGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.slvCustomFieldInteger</code> attribute. 
	 * @param value the slvCustomFieldInteger
	 */
	public void setSlvCustomFieldInteger(final Customer item, final Integer value)
	{
		setSlvCustomFieldInteger( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.slvCustomFieldInteger</code> attribute. 
	 * @param value the slvCustomFieldInteger
	 */
	public void setSlvCustomFieldInteger(final SessionContext ctx, final Customer item, final int value)
	{
		setSlvCustomFieldInteger( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.slvCustomFieldInteger</code> attribute. 
	 * @param value the slvCustomFieldInteger
	 */
	public void setSlvCustomFieldInteger(final Customer item, final int value)
	{
		setSlvCustomFieldInteger( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.slvProductCustomField</code> attribute.
	 * @return the slvProductCustomField
	 */
	public String getSlvProductCustomField(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, SolviaCoreConstants.Attributes.Product.SLVPRODUCTCUSTOMFIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.slvProductCustomField</code> attribute.
	 * @return the slvProductCustomField
	 */
	public String getSlvProductCustomField(final Product item)
	{
		return getSlvProductCustomField( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.slvProductCustomField</code> attribute. 
	 * @param value the slvProductCustomField
	 */
	public void setSlvProductCustomField(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, SolviaCoreConstants.Attributes.Product.SLVPRODUCTCUSTOMFIELD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.slvProductCustomField</code> attribute. 
	 * @param value the slvProductCustomField
	 */
	public void setSlvProductCustomField(final Product item, final String value)
	{
		setSlvProductCustomField( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.slvProductCustomFieldInteger</code> attribute.
	 * @return the slvProductCustomFieldInteger
	 */
	public Integer getSlvProductCustomFieldInteger(final SessionContext ctx, final Product item)
	{
		return (Integer)item.getProperty( ctx, SolviaCoreConstants.Attributes.Product.SLVPRODUCTCUSTOMFIELDINTEGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.slvProductCustomFieldInteger</code> attribute.
	 * @return the slvProductCustomFieldInteger
	 */
	public Integer getSlvProductCustomFieldInteger(final Product item)
	{
		return getSlvProductCustomFieldInteger( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.slvProductCustomFieldInteger</code> attribute. 
	 * @return the slvProductCustomFieldInteger
	 */
	public int getSlvProductCustomFieldIntegerAsPrimitive(final SessionContext ctx, final Product item)
	{
		Integer value = getSlvProductCustomFieldInteger( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.slvProductCustomFieldInteger</code> attribute. 
	 * @return the slvProductCustomFieldInteger
	 */
	public int getSlvProductCustomFieldIntegerAsPrimitive(final Product item)
	{
		return getSlvProductCustomFieldIntegerAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.slvProductCustomFieldInteger</code> attribute. 
	 * @param value the slvProductCustomFieldInteger
	 */
	public void setSlvProductCustomFieldInteger(final SessionContext ctx, final Product item, final Integer value)
	{
		item.setProperty(ctx, SolviaCoreConstants.Attributes.Product.SLVPRODUCTCUSTOMFIELDINTEGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.slvProductCustomFieldInteger</code> attribute. 
	 * @param value the slvProductCustomFieldInteger
	 */
	public void setSlvProductCustomFieldInteger(final Product item, final Integer value)
	{
		setSlvProductCustomFieldInteger( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.slvProductCustomFieldInteger</code> attribute. 
	 * @param value the slvProductCustomFieldInteger
	 */
	public void setSlvProductCustomFieldInteger(final SessionContext ctx, final Product item, final int value)
	{
		setSlvProductCustomFieldInteger( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.slvProductCustomFieldInteger</code> attribute. 
	 * @param value the slvProductCustomFieldInteger
	 */
	public void setSlvProductCustomFieldInteger(final Product item, final int value)
	{
		setSlvProductCustomFieldInteger( getSession().getSessionContext(), item, value );
	}
	
}
