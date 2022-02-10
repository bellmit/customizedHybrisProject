/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.sap.productconfig.runtime.ssc.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isNotNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.sap.productconfig.runtime.interf.ConfigModelFactory;
import de.hybris.platform.sap.productconfig.runtime.interf.ConfigurationEngineException;
import de.hybris.platform.sap.productconfig.runtime.interf.KBKey;
import de.hybris.platform.sap.productconfig.runtime.interf.impl.KBKeyImpl;
import de.hybris.platform.sap.productconfig.runtime.interf.model.ConfigModel;
import de.hybris.platform.sap.productconfig.runtime.interf.model.ProductConfigMessage;
import de.hybris.platform.sap.productconfig.runtime.interf.model.ProductConfigMessageSeverity;
import de.hybris.platform.sap.productconfig.runtime.interf.model.ProductConfigMessageSource;
import de.hybris.platform.sap.productconfig.runtime.interf.model.ProductConfigMessageSourceSubType;
import de.hybris.platform.sap.productconfig.runtime.interf.model.impl.ConfigModelImpl;
import de.hybris.platform.sap.productconfig.runtime.interf.model.impl.ProductConfigMessageBuilder;
import de.hybris.platform.sap.productconfig.runtime.ssc.wrapper.KBOCacheWrapper;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.sap.custdev.projects.fbs.slc.cfg.IConfigSession;
import com.sap.custdev.projects.fbs.slc.cfg.client.IKnowledgeBaseData;
import com.sap.custdev.projects.fbs.slc.cfg.client.IConfigLoadMessages;
import com.sap.custdev.projects.fbs.slc.cfg.command.beans.KnowledgeBaseData;
import com.sap.custdev.projects.fbs.slc.cfg.command.beans.ConfigLoadMessages;
import com.sap.custdev.projects.fbs.slc.cfg.exception.IpcCommandException;
import com.sap.sce.front.base.KnowledgeBase;
import com.sap.sce.kbrt.kb_descriptor;
import com.sap.sxe.sys.SAPDate;


/**
 * Unit Tests
 */
@UnitTest
public class BaseConfigurationProviderSSCImplTest
{
	private static final String P_CODE = "pCode";
	private static final String KB_NAME2 = "kbName";
	
	@Mock
	private ConfigModelFactory configModelFactory;
	private final BaseConfigurationProviderSSCImpl classUnderTest = new BaseConfigurationProviderSSCImpl()
	{
		@Override
		protected IConfigSession createSSCSession()
		{
			return iConfigSession;
		}
		@Override
		public IConfigSession createSession(final KBKey kbKey) throws IpcCommandException
		{
			return iConfigSession;
		}
		// three abstract methods that need a stub implementation in order for the class to be instantiated
		@Override
		protected ConfigModel fillConfigModel(final String qualifiedId)
		{
			return configModel;
		}
		@Override
		public String changeConfiguration(final ConfigModel model) throws ConfigurationEngineException
		{
			return null;
		}
		@Override
		public void releaseSession(final String configId, final String version)
		{
			// empty
		}
	};

	private static final String sessionId = "session1";
	private static final String configId = "12938";
	private IKnowledgeBaseData[] allKbsOld;
	private KnowledgeBase[] allKbs;
	private KnowledgeBase[] validKbs;
	private final ConfigModel configModel = new ConfigModelImpl();
	
	@Mock
	private IConfigSession iConfigSession;
	@Mock
	private KBOCacheWrapper kboCache;
	@Mock
	private kb_descriptor kbDescriptor;


	@Before
	public void setUp() throws IpcCommandException
	{
		MockitoAnnotations.initMocks(this);
		classUnderTest.setKboCache(kboCache);
		allKbsOld = new IKnowledgeBaseData[]
				{ createKBDataOld("kbName", "v1"), createKBDataOld("kbName", "v2"), createKBDataOld("kbName", "v3") };
		allKbs = new KnowledgeBase[]
				{ createKBData(KB_NAME2, "v1"), createKBData(KB_NAME2, "v2"), createKBData(KB_NAME2, "v3") };
		validKbs = new KnowledgeBase[]
				{ createKBData(KB_NAME2, "v1"), createKBData(KB_NAME2, "v2") };

		configModel.setKbKey(new KBKeyImpl(P_CODE, P_CODE, "LOGSYS", "VERSION"));

		when(iConfigSession.getSessionId()).thenReturn(sessionId);
	}
	
	protected IKnowledgeBaseData createKBDataOld(final String name, final String version)
	{
		final IKnowledgeBaseData kb1 = new KnowledgeBaseData();
		kb1.setKbName(name);
		kb1.setKbVersion(version);
		return kb1;
	}

	protected KnowledgeBase createKBData(final String name, final String version)
	{
		final KnowledgeBase kb1 = mock(KnowledgeBase.class);
		when(kb1.getKbName()).thenReturn(name);
		when(kb1.getVersion()).thenReturn(version);
		return kb1;
	}

	@Test
	public void testQualifiedId()
	{
		final String qualifiedId = classUnderTest.retrieveQualifiedId(sessionId, configId);
		assertTrue(qualifiedId.contains(sessionId));
		assertTrue(qualifiedId.contains(configId));

	}

	@Test
	public void testGetFormattedDateNotNull()
	{
		assertNotNull(classUnderTest.getFormattedDate(new KBKeyImpl(P_CODE)));
	}

	@Test
	public void testGetFormattedDate()
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.set(2016, Calendar.JANUARY, 5);
		final KBKeyImpl kbKey = new KBKeyImpl(P_CODE, KB_NAME2, "logSys", "kbVersion", calendar.getTime());

		final String formattedDate = classUnderTest.getFormattedDate(kbKey);

		assertEquals("20160105", formattedDate);

	}
	
	@Test
	public void testFindKBInList_null()
	{
		assertNull(classUnderTest.findKBInList(new KBKeyImpl(P_CODE), null));
	}
	
	@Test
	public void testFindKBInList_match()
	{
		final IKnowledgeBaseData matchedKB = classUnderTest.findKBInList(new KBKeyImpl(P_CODE, "kbName", null, "v2"), allKbsOld);
		assertNotNull(matchedKB);
		assertSame(allKbsOld[1], matchedKB);
	}
	
	@Test
	public void testFindKBInList_versionNotMatching()
	{
		assertNull(classUnderTest.findKBInList(new KBKeyImpl(P_CODE, "kbName", null, "xx"), allKbsOld));
	}
	
	@Test
	public void testFindKBInList_nameNotMatching()
	{
		assertNull(classUnderTest.findKBInList(new KBKeyImpl(P_CODE, "xx", null, "v1"), allKbsOld));
	}

	@Test
	public void testFindKBNull()
	{
		assertNull(classUnderTest.filterMatchingKB(new KBKeyImpl(P_CODE), null));
	}

	@Test
	public void testFindKBMatch()
	{
		final KnowledgeBase matchedKB = classUnderTest.filterMatchingKB(new KBKeyImpl(P_CODE, KB_NAME2, null, "v2"), allKbs[1]);
		assertNotNull(matchedKB);
		assertSame(allKbs[1], matchedKB);
	}

	@Test
	public void testFindKBVersionNotMatching()
	{
		assertNull(classUnderTest.filterMatchingKB(new KBKeyImpl(P_CODE, KB_NAME2, null, "xx"), allKbs[0]));
	}

	@Test
	public void testFindKBNameNotMatching()
	{
		assertNull(classUnderTest.filterMatchingKB(new KBKeyImpl(P_CODE, "xx", null, "v1"), allKbs[2]));
	}

	@Test
	public void testIsKbVersionExists() throws IpcCommandException
	{
		when(kbDescriptor.getAssociatedKB()).thenReturn(allKbs[2]);
		when(kboCache.get_kb_Desc_from_cache(any(), any(), eq(KB_NAME2), eq("v3"), any(), any(), any(), eq(P_CODE), eq("MARA"),
				isNotNull(String.class))).thenReturn(kbDescriptor);
		assertTrue(classUnderTest.isKbVersionExists(new KBKeyImpl(P_CODE, KB_NAME2, null, "v3")));
	}

	@Test
	public void testIsKbVersionExistsNotFound() throws IpcCommandException
	{
		assertFalse(classUnderTest.isKbVersionExists(new KBKeyImpl(P_CODE, KB_NAME2, null, "v4")));
	}

	@Test
	public void testIsKbVersionValidFound() throws IpcCommandException
	{
		when(kbDescriptor.getAssociatedKB()).thenReturn(allKbs[1]);
		when(kboCache.get_kb_Desc_from_cache(any(), any(), eq(KB_NAME2), eq("v2"), any(), any(), any(), eq(P_CODE), eq("MARA"),
				isNotNull(String.class))).thenReturn(kbDescriptor);
		assertTrue(classUnderTest.isKbVersionValid(new KBKeyImpl(P_CODE, KB_NAME2, null, "v2")));
	}

	@Test
	public void testIsKbVersionValidInvalid() throws IpcCommandException
	{
		assertFalse(classUnderTest.isKbVersionValid(new KBKeyImpl(P_CODE, KB_NAME2, null, "v3", new Date())));
		verify(kboCache).get_kb_Desc_from_cache(any(), any(), eq(KB_NAME2), eq("v3"), isNotNull(SAPDate.class), any(), any(),
				eq(P_CODE), eq("MARA"), isNotNull(String.class));
	}

	@Test
	public void testIsKbForDateExists() throws IpcCommandException
	{
		when(kbDescriptor.getAssociatedKB()).thenReturn(validKbs[1]);
		when(kboCache.get_kb_Desc_from_cache(any(), any(), any(), any(), isNotNull(SAPDate.class), any(), any(), eq(P_CODE),
				eq("MARA"), isNotNull(String.class))).thenReturn(kbDescriptor);
		assertTrue(classUnderTest.isKbForDateExists(P_CODE, new Date()));
	}

	@Test
	public void testIsKbForDateExistsNoValidKbs() throws IpcCommandException
	{
		assertFalse(classUnderTest.isKbForDateExists("123", new Date()));
		verify(kboCache).get_kb_Desc_from_cache(any(), any(), any(), any(), isNotNull(SAPDate.class), any(), any(), eq("123"),
				eq("MARA"), isNotNull(String.class));
	}
	
	@Test
	public void testIsKbForDateExistsNoKbs() throws IpcCommandException
	{
		assertFalse(classUnderTest.isKbForDateExists("123", new Date()));
		verify(kboCache).get_kb_Desc_from_cache(any(), any(), any(), any(), isNotNull(SAPDate.class), any(), any(), eq("123"),
				eq("MARA"), isNotNull(String.class));
	}

	@Test
	public void extractKbKey()
	{
		final KBKey extractKbKey = classUnderTest.extractKbKey(P_CODE, extConfig);
		assertEquals(P_CODE, extractKbKey.getProductCode());
		assertEquals("CPQ_TABLE", extractKbKey.getKbName());
		assertEquals("v2", extractKbKey.getKbVersion());
	}

	@Test
	public void testUpdateProductCode()
	{
		final KBKey oldKey = configModel.getKbKey();
		classUnderTest.updateProductCode(configModel, "VARIANTCODE");
		assertEquals(oldKey.getDate(), configModel.getKbKey().getDate());
		assertEquals(oldKey.getKbLogsys(), configModel.getKbKey().getKbLogsys());
		assertEquals(oldKey.getKbVersion(), configModel.getKbKey().getKbVersion());
		assertEquals(oldKey.getKbName(), configModel.getKbKey().getKbName());
		assertEquals("VARIANTCODE", configModel.getKbKey().getProductCode());
	}


	private final static String extConfig = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><SOLUTION><CONFIGURATION CFGINFO=\"\" CLIENT=\"000\" COMPLETE=\"T\" "
			+ "CONSISTENT=\"T\" KBBUILD=\"1\" KBNAME=\"CPQ_TABLE\" KBPROFILE=\"CPQ_TABLE\" KBVERSION=\"v2\" LANGUAGE=\"E\" LANGUAGE_ISO=\"EN\" NAME=\" \" ROOT_NR=\"1\" "
			+ "SCEVERSION=\"SCE 5.0\"><INST AUTHOR=\"5\" CLASS_TYPE=\"300\" COMPLETE=\"T\" CONSISTENT=\"T\" INSTANCE_GUID=\"\" INSTANCE_ID=\"01\" NR=\"1\" OBJ_KEY=\"CPQ_TABLE\" "
			+ "OBJ_TXT=\"CPQ Table\" OBJ_TYPE=\"MARA\" QTY=\"1.0\" UNIT=\"ST\"><CSTICS><CSTIC AUTHOR=\"8\" CHARC=\"CPQ_TABLE_COLOR\" CHARC_TXT=\"Table Color\" VALUE=\"WHITE\" "
			+ "VALUE_TXT=\"White\"/><CSTIC AUTHOR=\"8\" CHARC=\"CPQ_TABLE_HEIGHT\" CHARC_TXT=\"Table Height\" VALUE=\"70\" VALUE_TXT=\"70 cm\"/></CSTICS></INST><PARTS/>"
			+ "<NON_PARTS/></CONFIGURATION><SALES_STRUCTURE><ITEM INSTANCE_GUID=\"\" INSTANCE_ID=\"1\" INSTANCE_NR=\"1\" LINE_ITEM_GUID=\"\" PARENT_INSTANCE_NR=\"\"/></SALES_STRUCTURE></SOLUTION>";


	@Test
	public void testProcessConfigurationLoadMessages() throws IpcCommandException
	{
		final String updatedInBackgroundMessage = "UpdatedMessage";
		final String configId = "ConfigId";
		prepareLoadMessages(configId);

		classUnderTest.setConfigModelFactory(configModelFactory);
		when(configModelFactory.createProductConfigMessageBuilder()).thenReturn(new ProductConfigMessageBuilder());

		classUnderTest.processConfigurationLoadMessages(configId, iConfigSession, configModel);

		final Set messages = configModel.getMessages();
		assertTrue(configModel.isChangedInBackground());
		assertNotNull(messages);
		assertEquals(1, messages.size());
		final ProductConfigMessage[] messageArray = (ProductConfigMessage[]) messages
				.toArray(new ProductConfigMessage[messages.size()]);
		final ProductConfigMessage message = messageArray[0];
		assertEquals(BaseConfigurationProviderSSCImpl.UPDATED_IN_BACKGROUNG_MESSAGE, message.getKey());
		assertTrue(StringUtils.isNotEmpty(message.getMessage()));
		assertEquals(ProductConfigMessageSeverity.WARNING, message.getSeverity());
		assertEquals(ProductConfigMessageSource.ENGINE, message.getSource());
		assertEquals(ProductConfigMessageSourceSubType.DEFAULT, message.getSourceSubType());
	}

	@Test
	public void testProcessConfigurationLoadMessagesLogMessagesNull() throws IpcCommandException
	{
		final String configId = "ConfigId";
		when(iConfigSession.getConfigLoadMessages(configId)).thenReturn(null);
		classUnderTest.processConfigurationLoadMessages(configId, iConfigSession, configModel);
		assertEquals(0, configModel.getMessages().size());
	}

	@Test
	public void testProcessConfigurationLoadMessagesNoLogMessages() throws IpcCommandException
	{
		final String configId = "ConfigId";
		when(iConfigSession.getConfigLoadMessages(configId)).thenReturn(new IConfigLoadMessages[0]);
		classUnderTest.processConfigurationLoadMessages(configId, iConfigSession, configModel);
		assertEquals(0, configModel.getMessages().size());
	}

	@Test
	public void testRetrieveConfigurationLoadMessages() throws IpcCommandException
	{
		final String updatedInBackgroundMessage = "UpdatedMessage";
		final String configId = "ConfigId";
		prepareLoadMessages(configId);
		final IConfigLoadMessages[] loadMessages = classUnderTest.retrieveConfigurationLoadMessages(configId, iConfigSession);
		assertNotNull(loadMessages);
		assertEquals(2, loadMessages.length);
		assertEquals("Message1", loadMessages[0].getMessage());
		assertEquals("Message2", loadMessages[1].getMessage());
	}

	@Test(expected = IllegalStateException.class)
	public void testRetrieveConfigurationLoadMessagesException() throws IpcCommandException
	{
		final String configId = "ConfigId";
		when(iConfigSession.getConfigLoadMessages(configId)).thenThrow(new IpcCommandException());
		classUnderTest.retrieveConfigurationLoadMessages(configId, iConfigSession);
	}

	protected void prepareLoadMessages(final String configId) throws IpcCommandException
	{
		final IConfigLoadMessages[] loadMessages = new IConfigLoadMessages[2];
		loadMessages[0] = new ConfigLoadMessages();
		loadMessages[1] = new ConfigLoadMessages();
		loadMessages[0].setMessage("Message1");
		loadMessages[1].setMessage("Message2");
		when(iConfigSession.getConfigLoadMessages(configId)).thenReturn(loadMessages);
	}
}
