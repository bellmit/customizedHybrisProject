/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 10, 2022, 8:39:43 PM                    ---
 * ----------------------------------------------------------------
 */
package com.solvia.jalo;

import com.solvia.constants.YcommercewebservicesConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CategoryDtls}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCategoryDtls extends GenericItem
{
	/** Qualifier of the <code>CategoryDtls.slvCustomCategoryField</code> attribute **/
	public static final String SLVCUSTOMCATEGORYFIELD = "slvCustomCategoryField";
	/** Qualifier of the <code>CategoryDtls.slvCustomCategoryFieldInteger</code> attribute **/
	public static final String SLVCUSTOMCATEGORYFIELDINTEGER = "slvCustomCategoryFieldInteger";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SLVCUSTOMCATEGORYFIELD, AttributeMode.INITIAL);
		tmp.put(SLVCUSTOMCATEGORYFIELDINTEGER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryDtls.slvCustomCategoryField</code> attribute.
	 * @return the slvCustomCategoryField - Solvia Product Custom Field
	 */
	public String getSlvCustomCategoryField(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SLVCUSTOMCATEGORYFIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryDtls.slvCustomCategoryField</code> attribute.
	 * @return the slvCustomCategoryField - Solvia Product Custom Field
	 */
	public String getSlvCustomCategoryField()
	{
		return getSlvCustomCategoryField( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryDtls.slvCustomCategoryField</code> attribute. 
	 * @param value the slvCustomCategoryField - Solvia Product Custom Field
	 */
	public void setSlvCustomCategoryField(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SLVCUSTOMCATEGORYFIELD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryDtls.slvCustomCategoryField</code> attribute. 
	 * @param value the slvCustomCategoryField - Solvia Product Custom Field
	 */
	public void setSlvCustomCategoryField(final String value)
	{
		setSlvCustomCategoryField( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryDtls.slvCustomCategoryFieldInteger</code> attribute.
	 * @return the slvCustomCategoryFieldInteger - Solvia Product Custom Field Integer
	 */
	public Integer getSlvCustomCategoryFieldInteger(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SLVCUSTOMCATEGORYFIELDINTEGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryDtls.slvCustomCategoryFieldInteger</code> attribute.
	 * @return the slvCustomCategoryFieldInteger - Solvia Product Custom Field Integer
	 */
	public Integer getSlvCustomCategoryFieldInteger()
	{
		return getSlvCustomCategoryFieldInteger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryDtls.slvCustomCategoryFieldInteger</code> attribute. 
	 * @return the slvCustomCategoryFieldInteger - Solvia Product Custom Field Integer
	 */
	public int getSlvCustomCategoryFieldIntegerAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSlvCustomCategoryFieldInteger( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CategoryDtls.slvCustomCategoryFieldInteger</code> attribute. 
	 * @return the slvCustomCategoryFieldInteger - Solvia Product Custom Field Integer
	 */
	public int getSlvCustomCategoryFieldIntegerAsPrimitive()
	{
		return getSlvCustomCategoryFieldIntegerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryDtls.slvCustomCategoryFieldInteger</code> attribute. 
	 * @param value the slvCustomCategoryFieldInteger - Solvia Product Custom Field Integer
	 */
	public void setSlvCustomCategoryFieldInteger(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SLVCUSTOMCATEGORYFIELDINTEGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryDtls.slvCustomCategoryFieldInteger</code> attribute. 
	 * @param value the slvCustomCategoryFieldInteger - Solvia Product Custom Field Integer
	 */
	public void setSlvCustomCategoryFieldInteger(final Integer value)
	{
		setSlvCustomCategoryFieldInteger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryDtls.slvCustomCategoryFieldInteger</code> attribute. 
	 * @param value the slvCustomCategoryFieldInteger - Solvia Product Custom Field Integer
	 */
	public void setSlvCustomCategoryFieldInteger(final SessionContext ctx, final int value)
	{
		setSlvCustomCategoryFieldInteger( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CategoryDtls.slvCustomCategoryFieldInteger</code> attribute. 
	 * @param value the slvCustomCategoryFieldInteger - Solvia Product Custom Field Integer
	 */
	public void setSlvCustomCategoryFieldInteger(final int value)
	{
		setSlvCustomCategoryFieldInteger( getSession().getSessionContext(), value );
	}
	
}
