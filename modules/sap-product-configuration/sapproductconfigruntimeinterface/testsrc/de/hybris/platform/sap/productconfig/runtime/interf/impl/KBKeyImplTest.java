/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.productconfig.runtime.interf.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import de.hybris.bootstrap.annotations.UnitTest;

import java.util.Date;

import org.junit.Test;


@UnitTest
public class KBKeyImplTest
{

	@Test
	public void testEquals()
	{
		final Date aSecondAgo = new Date(new Date().getTime() - 1000);
		KBKeyImpl key1 = new KBKeyImpl("A", "B", "C", "D", aSecondAgo);

		assertTrue(key1.equals(key1));
		assertFalse(key1.equals(null));
		assertFalse(key1.equals(new KBKeyImplSubClass("A", "B", "C", "D", aSecondAgo)));

		KBKeyImpl key2 = new KBKeyImpl("A", "B", "C", "D", aSecondAgo);
		assertTrue(key1.equals(key2));

		key2 = new KBKeyImpl("A", "B", "C", "D", null);
		assertFalse(key1.equals(key2));
		assertFalse(key2.equals(key1));

		key2 = new KBKeyImpl("A", "B", "C", null, aSecondAgo);
		assertFalse(key1.equals(key2));
		assertFalse(key2.equals(key1));

		key2 = new KBKeyImpl("A", "B", null, "D", aSecondAgo);
		assertFalse(key1.equals(key2));
		assertFalse(key2.equals(key1));

		key2 = new KBKeyImpl("A", null, "C", "D", aSecondAgo);
		assertFalse(key1.equals(key2));
		assertFalse(key2.equals(key1));

		key2 = new KBKeyImpl(null, "B", "C", "D", aSecondAgo);
		assertFalse(key1.equals(key2));
		assertFalse(key2.equals(key1));

		key1 = new KBKeyImpl("A", "B", "C", null, aSecondAgo);
		key2 = new KBKeyImpl("A", "B", "C", null, aSecondAgo);
		assertTrue(key1.equals(key2));
		assertTrue(key2.equals(key1));

		key1 = new KBKeyImpl("A", "B", null, "D", aSecondAgo);
		key2 = new KBKeyImpl("A", "B", null, "D", aSecondAgo);
		assertTrue(key1.equals(key2));
		assertTrue(key2.equals(key1));

		key1 = new KBKeyImpl("A", null, "C", "D", aSecondAgo);
		key2 = new KBKeyImpl("A", null, "C", "D", aSecondAgo);
		assertTrue(key1.equals(key2));
		assertTrue(key2.equals(key1));

		key1 = new KBKeyImpl(null, "B", "C", "D", aSecondAgo);
		key2 = new KBKeyImpl(null, "B", "C", "D", aSecondAgo);
		assertTrue(key1.equals(key2));
		assertTrue(key2.equals(key1));

		key1 = new KBKeyImpl("A", "B", "C", "D", null);
		key2 = new KBKeyImpl("A", "B", "C", "D", key1.getDate());
		assertTrue(key1.equals(key2));
		assertTrue(key2.equals(key1));
	}

	@Test
	public void testHashCodeNull()
	{
		final KBKeyImpl key = new KBKeyImpl(null, null, null, null, new Date(0l));
		assertEquals(28629151, key.hashCode());
	}

	@Test
	public void testHashCode()
	{
		final KBKeyImpl key = new KBKeyImpl("A", "B", "C", "D", new Date(0l));
		assertEquals(30661827, key.hashCode());
	}


	@Test
	public void testToString()
	{
		final Date date = new Date(0l);
		final KBKeyImpl key = new KBKeyImpl(null, null, null, null, date);
		final String dateString = date.toString();
		assertEquals("KBKeyImpl [productCode=null, kbName=null, kbLogsys=null, kbVersion=null, date=" + dateString + "]",
				key.toString());
	}

	private static class KBKeyImplSubClass extends KBKeyImpl
	{
		public KBKeyImplSubClass(final String productCode, final String kbName, final String kbLogsys, final String kbVersion,
				final Date date)
		{
			super(productCode, kbName, kbLogsys, kbVersion, date);
		}
	}
}
