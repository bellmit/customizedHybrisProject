/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved
 */
package de.hybris.platform.cockpit.model;

import static org.fest.assertions.Assertions.assertThat;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.junit.Test;


@IntegrationTest
public class CockpitSavedParameterValueModelTest extends ServicelayerTest
{
	@Resource
	private ModelService modelService;
	private static final String FAKE_PK = "123456";

	@Test
	public void shouldWriteLongerThen255ValueToRawValueAttribute()
	{
		// given
		final String value = makeLongString(100);

		// when
		final CockpitSavedParameterValueModel model = modelService.create(CockpitSavedParameterValueModel.class);
		model.setRawValue(value);
		model.setOperatorQualifier("equals");
		model.setParameterQualifier("foo");
		modelService.save(model);

		//then
		assertThat(modelService.isNew(model)).isFalse();
		assertThat(model.getRawValue().length()).isEqualTo(100 * FAKE_PK.length());
	}

	private String makeLongString(final int num)
	{
		final StringBuilder builder = new StringBuilder();
		for (int i = 0; i < num; i++)
		{
			builder.append(FAKE_PK);
		}
		return builder.toString();
	}
}
