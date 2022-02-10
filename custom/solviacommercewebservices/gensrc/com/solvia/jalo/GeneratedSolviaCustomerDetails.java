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
 * Generated class for type {@link com.solvia.jalo.SolviaCustomerDetails SolviaCustomerDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSolviaCustomerDetails extends GenericItem
{
	/** Qualifier of the <code>SolviaCustomerDetails.slvCustomField</code> attribute **/
	public static final String SLVCUSTOMFIELD = "slvCustomField";
	/** Qualifier of the <code>SolviaCustomerDetails.slvCustomFieldInteger</code> attribute **/
	public static final String SLVCUSTOMFIELDINTEGER = "slvCustomFieldInteger";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SLVCUSTOMFIELD, AttributeMode.INITIAL);
		tmp.put(SLVCUSTOMFIELDINTEGER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolviaCustomerDetails.slvCustomField</code> attribute.
	 * @return the slvCustomField - Solvia Customer Custom Field
	 */
	public String getSlvCustomField(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SLVCUSTOMFIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolviaCustomerDetails.slvCustomField</code> attribute.
	 * @return the slvCustomField - Solvia Customer Custom Field
	 */
	public String getSlvCustomField()
	{
		return getSlvCustomField( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolviaCustomerDetails.slvCustomField</code> attribute. 
	 * @param value the slvCustomField - Solvia Customer Custom Field
	 */
	public void setSlvCustomField(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SLVCUSTOMFIELD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolviaCustomerDetails.slvCustomField</code> attribute. 
	 * @param value the slvCustomField - Solvia Customer Custom Field
	 */
	public void setSlvCustomField(final String value)
	{
		setSlvCustomField( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolviaCustomerDetails.slvCustomFieldInteger</code> attribute.
	 * @return the slvCustomFieldInteger - Solvia Customer Custom Field Integer
	 */
	public Integer getSlvCustomFieldInteger(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SLVCUSTOMFIELDINTEGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolviaCustomerDetails.slvCustomFieldInteger</code> attribute.
	 * @return the slvCustomFieldInteger - Solvia Customer Custom Field Integer
	 */
	public Integer getSlvCustomFieldInteger()
	{
		return getSlvCustomFieldInteger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolviaCustomerDetails.slvCustomFieldInteger</code> attribute. 
	 * @return the slvCustomFieldInteger - Solvia Customer Custom Field Integer
	 */
	public int getSlvCustomFieldIntegerAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSlvCustomFieldInteger( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SolviaCustomerDetails.slvCustomFieldInteger</code> attribute. 
	 * @return the slvCustomFieldInteger - Solvia Customer Custom Field Integer
	 */
	public int getSlvCustomFieldIntegerAsPrimitive()
	{
		return getSlvCustomFieldIntegerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolviaCustomerDetails.slvCustomFieldInteger</code> attribute. 
	 * @param value the slvCustomFieldInteger - Solvia Customer Custom Field Integer
	 */
	public void setSlvCustomFieldInteger(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SLVCUSTOMFIELDINTEGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolviaCustomerDetails.slvCustomFieldInteger</code> attribute. 
	 * @param value the slvCustomFieldInteger - Solvia Customer Custom Field Integer
	 */
	public void setSlvCustomFieldInteger(final Integer value)
	{
		setSlvCustomFieldInteger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolviaCustomerDetails.slvCustomFieldInteger</code> attribute. 
	 * @param value the slvCustomFieldInteger - Solvia Customer Custom Field Integer
	 */
	public void setSlvCustomFieldInteger(final SessionContext ctx, final int value)
	{
		setSlvCustomFieldInteger( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SolviaCustomerDetails.slvCustomFieldInteger</code> attribute. 
	 * @param value the slvCustomFieldInteger - Solvia Customer Custom Field Integer
	 */
	public void setSlvCustomFieldInteger(final int value)
	{
		setSlvCustomFieldInteger( getSession().getSessionContext(), value );
	}
	
}
