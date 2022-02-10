/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cms2.model.restrictions;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.type.AttributeDescriptorModel;
import de.hybris.platform.core.model.type.ComposedTypeModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.type.TypeService;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


@IntegrationTest
public class CMSUserRestrictionModelTest extends ServicelayerBaseTest // NOPMD
{
	@Resource
	private ModelService modelService;
	@Resource
	private TypeService typeService;
	@Mock
	private UserModel user1;
	@Mock
	private UserModel user2;
	@Mock
	private UserModel user3;

	@Before
	public void setUp() throws Exception
	{
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Test method for {@link de.hybris.platform.cms2.model.restrictions.CMSTimeRestrictionModel#getDescription()}.
	 */
	@Test
	public void shouldHaveDynamicAttributeDescriptor()
	{
		//given
		final ComposedTypeModel type = typeService.getComposedTypeForClass(CMSUserRestrictionModel.class);

		//when
		final AttributeDescriptorModel attributeDescriptor = typeService.getAttributeDescriptor(type,
				CMSCategoryRestrictionModel.DESCRIPTION);

		//then
		assertThat(attributeDescriptor).isNotNull();
		assertThat(attributeDescriptor.getAttributeHandler()).isEqualTo("userRestrictionDynamicDescription");
	}

	/**
	 * Test method for {@link de.hybris.platform.cms2.model.restrictions.CMSTimeRestrictionModel#getDescription()}.
	 *
	 */
	@Test
	public void shouldReturnRestrictionDescription()
	{
		//given
		final Collection<UserModel> users = new ArrayList<UserModel>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		given(user1.getUid()).willReturn("uid1");
		given(user2.getUid()).willReturn("uid2");
		given(user1.getName()).willReturn("name1");
		given(user2.getName()).willReturn("name2");
		given(user3.getUid()).willReturn("uid3");
		final CMSUserRestrictionModel restriction = modelService.create(CMSUserRestrictionModel.class);
		restriction.setUsers(users);

		//when
		final String description = restriction.getDescription();

		//then
		assertThat(description).isNotNull();
		assertThat(description).isEqualTo("Display for users: name1 (uid1); name2 (uid2); (uid3);");
	}
}
