package de.hybris.platform.sap.productconfig.facades.integrationtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import de.hybris.bootstrap.annotations.ManualTest;
import de.hybris.platform.impex.jalo.ImpExException;
import de.hybris.platform.sap.productconfig.facades.ConfigurationData;

import org.junit.Before;
import org.junit.Test;


///test base class, do not execute as test
@SuppressWarnings("javadoc")
@ManualTest
public class ConfigurationIntegrationTestBase extends CPQFacadeLayerTest
{
	protected static final String YSAP_POC_SIMPLE_FLAG = "YSAP_POC_SIMPLE_FLAG";
	protected static final String WCEM_NUMBER_SIMPLE = "WCEM_NUMBER_SIMPLE";
	protected static final String GROUP_CPQ_LAPTOP_SOFTWARE = "1-CPQ_LAPTOP.SOFTWARE";
	protected static final String CSTIC_CPQ_OS = "CPQ_OS";
	protected static final String VALUE_1 = "123";
	protected static final String VALUE_MS8 = "MS8";
	protected static final String NULL_VALUE = "NULL_VALUE";

	@Before
	public void setUp() throws Exception
	{
		prepareCPQData();
	}

	@Override
	public void importCPQTestData() throws ImpExException, Exception
	{
		super.importCPQTestData();
		importCPQUserData();
	}

	@Test
	public void testEmptyOutInputField()
	{
		ConfigurationData configData = cpqFacade.getConfiguration(KB_KEY_Y_SAP_SIMPLE_POC);
		facadeConfigValueHelper.setCsticValue(configData, YSAP_POC_SIMPLE_FLAG, "X", false);
		cpqFacade.updateConfiguration(configData);
		configData = cpqFacade.getConfiguration(configData);
		String value = facadeConfigValueHelper.getCstic(configData, YSAP_POC_SIMPLE_FLAG).getValue();
		assertNull(YSAP_POC_SIMPLE_FLAG + " has 'null' value: ", value);

		facadeConfigValueHelper.setCstic(configData, WCEM_NUMBER_SIMPLE, VALUE_1);
		cpqFacade.updateConfiguration(configData);
		configData = cpqFacade.getConfiguration(configData);
		value = facadeConfigValueHelper.getCstic(configData, WCEM_NUMBER_SIMPLE).getValue();
		value = value.split("\\.")[0];
		assertEquals(WCEM_NUMBER_SIMPLE + " has wrong value: ", VALUE_1, value);

		facadeConfigValueHelper.setCstic(configData, WCEM_NUMBER_SIMPLE, "   ");
		cpqFacade.updateConfiguration(configData);
		configData = cpqFacade.getConfiguration(configData);
		value = facadeConfigValueHelper.getCstic(configData, WCEM_NUMBER_SIMPLE).getValue();
		assertNull(WCEM_NUMBER_SIMPLE + " has 'null' value: ", value);
	}

	@Test
	public void testDrownDownWithAndWithoutAdditionalInputAndNullValue()
	{
		ConfigurationData configData = cpqFacade.getConfiguration(KB_KEY_CPQ_LAPTOP);
		facadeConfigValueHelper.setCstic(configData, GROUP_CPQ_LAPTOP_SOFTWARE, CSTIC_CPQ_OS, VALUE_MS8);
		cpqFacade.updateConfiguration(configData);
		configData = cpqFacade.getConfiguration(KB_KEY_CPQ_LAPTOP);
		String value = facadeConfigValueHelper.getCstic(configData, GROUP_CPQ_LAPTOP_SOFTWARE, CSTIC_CPQ_OS).getValue();
		assertEquals(CSTIC_CPQ_OS + " has wrong value: ", VALUE_MS8, value);

		facadeConfigValueHelper.setCstic(configData, GROUP_CPQ_LAPTOP_SOFTWARE, CSTIC_CPQ_OS, NULL_VALUE);
		cpqFacade.updateConfiguration(configData);
		configData = cpqFacade.getConfiguration(KB_KEY_CPQ_LAPTOP);
		value = facadeConfigValueHelper.getCstic(configData, GROUP_CPQ_LAPTOP_SOFTWARE, CSTIC_CPQ_OS).getValue();
		assertNull(CSTIC_CPQ_OS + " has 'null' value: ", value);
	}
}