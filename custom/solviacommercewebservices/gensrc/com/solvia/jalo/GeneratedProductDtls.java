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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ProductDtls}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedProductDtls extends GenericItem
{
	/** Qualifier of the <code>ProductDtls.slvCustomProductField</code> attribute **/
	public static final String SLVCUSTOMPRODUCTFIELD = "slvCustomProductField";
	/** Qualifier of the <code>ProductDtls.slvCustomProductFieldInteger</code> attribute **/
	public static final String SLVCUSTOMPRODUCTFIELDINTEGER = "slvCustomProductFieldInteger";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SLVCUSTOMPRODUCTFIELD, AttributeMode.INITIAL);
		tmp.put(SLVCUSTOMPRODUCTFIELDINTEGER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDtls.slvCustomProductField</code> attribute.
	 * @return the slvCustomProductField - Solvia Product Custom Field
	 */
	public String getSlvCustomProductField(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SLVCUSTOMPRODUCTFIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDtls.slvCustomProductField</code> attribute.
	 * @return the slvCustomProductField - Solvia Product Custom Field
	 */
	public String getSlvCustomProductField()
	{
		return getSlvCustomProductField( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDtls.slvCustomProductField</code> attribute. 
	 * @param value the slvCustomProductField - Solvia Product Custom Field
	 */
	public void setSlvCustomProductField(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SLVCUSTOMPRODUCTFIELD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDtls.slvCustomProductField</code> attribute. 
	 * @param value the slvCustomProductField - Solvia Product Custom Field
	 */
	public void setSlvCustomProductField(final String value)
	{
		setSlvCustomProductField( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDtls.slvCustomProductFieldInteger</code> attribute.
	 * @return the slvCustomProductFieldInteger - Solvia Product Custom Field Integer
	 */
	public Integer getSlvCustomProductFieldInteger(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SLVCUSTOMPRODUCTFIELDINTEGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDtls.slvCustomProductFieldInteger</code> attribute.
	 * @return the slvCustomProductFieldInteger - Solvia Product Custom Field Integer
	 */
	public Integer getSlvCustomProductFieldInteger()
	{
		return getSlvCustomProductFieldInteger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDtls.slvCustomProductFieldInteger</code> attribute. 
	 * @return the slvCustomProductFieldInteger - Solvia Product Custom Field Integer
	 */
	public int getSlvCustomProductFieldIntegerAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSlvCustomProductFieldInteger( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductDtls.slvCustomProductFieldInteger</code> attribute. 
	 * @return the slvCustomProductFieldInteger - Solvia Product Custom Field Integer
	 */
	public int getSlvCustomProductFieldIntegerAsPrimitive()
	{
		return getSlvCustomProductFieldIntegerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDtls.slvCustomProductFieldInteger</code> attribute. 
	 * @param value the slvCustomProductFieldInteger - Solvia Product Custom Field Integer
	 */
	public void setSlvCustomProductFieldInteger(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SLVCUSTOMPRODUCTFIELDINTEGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDtls.slvCustomProductFieldInteger</code> attribute. 
	 * @param value the slvCustomProductFieldInteger - Solvia Product Custom Field Integer
	 */
	public void setSlvCustomProductFieldInteger(final Integer value)
	{
		setSlvCustomProductFieldInteger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDtls.slvCustomProductFieldInteger</code> attribute. 
	 * @param value the slvCustomProductFieldInteger - Solvia Product Custom Field Integer
	 */
	public void setSlvCustomProductFieldInteger(final SessionContext ctx, final int value)
	{
		setSlvCustomProductFieldInteger( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductDtls.slvCustomProductFieldInteger</code> attribute. 
	 * @param value the slvCustomProductFieldInteger - Solvia Product Custom Field Integer
	 */
	public void setSlvCustomProductFieldInteger(final int value)
	{
		setSlvCustomProductFieldInteger( getSession().getSessionContext(), value );
	}
	
}
