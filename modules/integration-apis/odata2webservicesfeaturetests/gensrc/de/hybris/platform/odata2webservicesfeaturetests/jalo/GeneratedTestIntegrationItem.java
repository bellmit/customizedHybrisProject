/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 9, 2022, 11:43:51 AM                    ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.odata2webservicesfeaturetests.jalo;

import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.test.TestItem;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.odata2webservicesfeaturetests.constants.Odata2webservicesfeaturetestsConstants;
import de.hybris.platform.odata2webservicesfeaturetests.jalo.TestIntegrationItem;
import de.hybris.platform.odata2webservicesfeaturetests.jalo.TestIntegrationItemDetail;
import de.hybris.platform.util.OneToManyHandler;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.test.TestItem TestIntegrationItem}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTestIntegrationItem extends TestItem
{
	/** Qualifier of the <code>TestIntegrationItem.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>TestIntegrationItem.otherItem</code> attribute **/
	public static final String OTHERITEM = "otherItem";
	/** Qualifier of the <code>TestIntegrationItem.detail</code> attribute **/
	public static final String DETAIL = "detail";
	/** Qualifier of the <code>TestIntegrationItem.bigDecimal</code> attribute **/
	public static final String BIGDECIMAL = "bigDecimal";
	/** Qualifier of the <code>TestIntegrationItem.dateCollection</code> attribute **/
	public static final String DATECOLLECTION = "dateCollection";
	/** Qualifier of the <code>TestIntegrationItem.bigInteger</code> attribute **/
	public static final String BIGINTEGER = "bigInteger";
	/** Qualifier of the <code>TestIntegrationItem.enumList</code> attribute **/
	public static final String ENUMLIST = "enumList";
	/** Qualifier of the <code>TestIntegrationItem.details</code> attribute **/
	public static final String DETAILS = "details";
	/** Qualifier of the <code>TestIntegrationItem.testEnums</code> attribute **/
	public static final String TESTENUMS = "testEnums";
	/**
	* {@link OneToManyHandler} for handling 1:n DETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TestIntegrationItemDetail> DETAILSHANDLER = new OneToManyHandler<TestIntegrationItemDetail>(
	Odata2webservicesfeaturetestsConstants.TC.TESTINTEGRATIONITEMDETAIL,
	false,
	"master",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TESTENUMS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> TESTENUMSHANDLER = new OneToManyHandler<EnumerationValue>(
	Odata2webservicesfeaturetestsConstants.TC.ODATA2WEBSERVICESFEATURETESTPROPERTIESTYPES,
	false,
	"testIntegrationItemRef",
	null,
	false,
	true,
	CollectionType.SET
	);
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.bigDecimal</code> attribute.
	 * @return the bigDecimal
	 */
	public BigDecimal getBigDecimal(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, BIGDECIMAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.bigDecimal</code> attribute.
	 * @return the bigDecimal
	 */
	public BigDecimal getBigDecimal()
	{
		return getBigDecimal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.bigDecimal</code> attribute. 
	 * @param value the bigDecimal
	 */
	public void setBigDecimal(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, BIGDECIMAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.bigDecimal</code> attribute. 
	 * @param value the bigDecimal
	 */
	public void setBigDecimal(final BigDecimal value)
	{
		setBigDecimal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.bigInteger</code> attribute.
	 * @return the bigInteger
	 */
	public BigInteger getBigInteger(final SessionContext ctx)
	{
		return (BigInteger)getProperty( ctx, BIGINTEGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.bigInteger</code> attribute.
	 * @return the bigInteger
	 */
	public BigInteger getBigInteger()
	{
		return getBigInteger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.bigInteger</code> attribute. 
	 * @param value the bigInteger
	 */
	public void setBigInteger(final SessionContext ctx, final BigInteger value)
	{
		setProperty(ctx, BIGINTEGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.bigInteger</code> attribute. 
	 * @param value the bigInteger
	 */
	public void setBigInteger(final BigInteger value)
	{
		setBigInteger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.code</code> attribute.
	 * @return the code - Unique identifier of the item because TestItemType2 does not have a unique identifier.
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.code</code> attribute.
	 * @return the code - Unique identifier of the item because TestItemType2 does not have a unique identifier.
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.code</code> attribute. 
	 * @param value the code - Unique identifier of the item because TestItemType2 does not have a unique identifier.
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.code</code> attribute. 
	 * @param value the code - Unique identifier of the item because TestItemType2 does not have a unique identifier.
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.dateCollection</code> attribute.
	 * @return the dateCollection - Defines an optional date collection.
	 */
	public Collection<Date> getDateCollection(final SessionContext ctx)
	{
		Collection<Date> coll = (Collection<Date>)getProperty( ctx, DATECOLLECTION);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.dateCollection</code> attribute.
	 * @return the dateCollection - Defines an optional date collection.
	 */
	public Collection<Date> getDateCollection()
	{
		return getDateCollection( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.dateCollection</code> attribute. 
	 * @param value the dateCollection - Defines an optional date collection.
	 */
	public void setDateCollection(final SessionContext ctx, final Collection<Date> value)
	{
		setProperty(ctx, DATECOLLECTION,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.dateCollection</code> attribute. 
	 * @param value the dateCollection - Defines an optional date collection.
	 */
	public void setDateCollection(final Collection<Date> value)
	{
		setDateCollection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.detail</code> attribute.
	 * @return the detail - Defines optional one-to-one association between this item and a TestIntegrationItemDetail.
	 */
	public TestIntegrationItemDetail getDetail(final SessionContext ctx)
	{
		return (TestIntegrationItemDetail)getProperty( ctx, DETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.detail</code> attribute.
	 * @return the detail - Defines optional one-to-one association between this item and a TestIntegrationItemDetail.
	 */
	public TestIntegrationItemDetail getDetail()
	{
		return getDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.detail</code> attribute. 
	 * @param value the detail - Defines optional one-to-one association between this item and a TestIntegrationItemDetail.
	 */
	public void setDetail(final SessionContext ctx, final TestIntegrationItemDetail value)
	{
		setProperty(ctx, DETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.detail</code> attribute. 
	 * @param value the detail - Defines optional one-to-one association between this item and a TestIntegrationItemDetail.
	 */
	public void setDetail(final TestIntegrationItemDetail value)
	{
		setDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.details</code> attribute.
	 * @return the details
	 */
	public Set<TestIntegrationItemDetail> getDetails(final SessionContext ctx)
	{
		return (Set<TestIntegrationItemDetail>)DETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.details</code> attribute.
	 * @return the details
	 */
	public Set<TestIntegrationItemDetail> getDetails()
	{
		return getDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.details</code> attribute. 
	 * @param value the details
	 */
	public void setDetails(final SessionContext ctx, final Set<TestIntegrationItemDetail> value)
	{
		DETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.details</code> attribute. 
	 * @param value the details
	 */
	public void setDetails(final Set<TestIntegrationItemDetail> value)
	{
		setDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to details. 
	 * @param value the item to add to details
	 */
	public void addToDetails(final SessionContext ctx, final TestIntegrationItemDetail value)
	{
		DETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to details. 
	 * @param value the item to add to details
	 */
	public void addToDetails(final TestIntegrationItemDetail value)
	{
		addToDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from details. 
	 * @param value the item to remove from details
	 */
	public void removeFromDetails(final SessionContext ctx, final TestIntegrationItemDetail value)
	{
		DETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from details. 
	 * @param value the item to remove from details
	 */
	public void removeFromDetails(final TestIntegrationItemDetail value)
	{
		removeFromDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.enumList</code> attribute.
	 * @return the enumList
	 */
	public List<EnumerationValue> getEnumList(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, ENUMLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.enumList</code> attribute.
	 * @return the enumList
	 */
	public List<EnumerationValue> getEnumList()
	{
		return getEnumList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.enumList</code> attribute. 
	 * @param value the enumList
	 */
	public void setEnumList(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, ENUMLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.enumList</code> attribute. 
	 * @param value the enumList
	 */
	public void setEnumList(final List<EnumerationValue> value)
	{
		setEnumList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.otherItem</code> attribute.
	 * @return the otherItem - Reference to another TestIntegrationItem, which can be used for testing conditions when the
	 *                         integration
	 *                         object references itself (same instance) or another item (different instance).
	 */
	public TestIntegrationItem getOtherItem(final SessionContext ctx)
	{
		return (TestIntegrationItem)getProperty( ctx, OTHERITEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.otherItem</code> attribute.
	 * @return the otherItem - Reference to another TestIntegrationItem, which can be used for testing conditions when the
	 *                         integration
	 *                         object references itself (same instance) or another item (different instance).
	 */
	public TestIntegrationItem getOtherItem()
	{
		return getOtherItem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.otherItem</code> attribute. 
	 * @param value the otherItem - Reference to another TestIntegrationItem, which can be used for testing conditions when the
	 *                         integration
	 *                         object references itself (same instance) or another item (different instance).
	 */
	public void setOtherItem(final SessionContext ctx, final TestIntegrationItem value)
	{
		setProperty(ctx, OTHERITEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.otherItem</code> attribute. 
	 * @param value the otherItem - Reference to another TestIntegrationItem, which can be used for testing conditions when the
	 *                         integration
	 *                         object references itself (same instance) or another item (different instance).
	 */
	public void setOtherItem(final TestIntegrationItem value)
	{
		setOtherItem( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.testEnums</code> attribute.
	 * @return the testEnums
	 */
	public Set<EnumerationValue> getTestEnums(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)TESTENUMSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TestIntegrationItem.testEnums</code> attribute.
	 * @return the testEnums
	 */
	public Set<EnumerationValue> getTestEnums()
	{
		return getTestEnums( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.testEnums</code> attribute. 
	 * @param value the testEnums
	 */
	public void setTestEnums(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		TESTENUMSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TestIntegrationItem.testEnums</code> attribute. 
	 * @param value the testEnums
	 */
	public void setTestEnums(final Set<EnumerationValue> value)
	{
		setTestEnums( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to testEnums. 
	 * @param value the item to add to testEnums
	 */
	public void addToTestEnums(final SessionContext ctx, final EnumerationValue value)
	{
		TESTENUMSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to testEnums. 
	 * @param value the item to add to testEnums
	 */
	public void addToTestEnums(final EnumerationValue value)
	{
		addToTestEnums( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from testEnums. 
	 * @param value the item to remove from testEnums
	 */
	public void removeFromTestEnums(final SessionContext ctx, final EnumerationValue value)
	{
		TESTENUMSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from testEnums. 
	 * @param value the item to remove from testEnums
	 */
	public void removeFromTestEnums(final EnumerationValue value)
	{
		removeFromTestEnums( getSession().getSessionContext(), value );
	}
	
}
