/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved
 */
package de.hybris.platform.productcockpit.jalo;

import de.hybris.platform.core.Registry;
import de.hybris.platform.testframework.HybrisJUnit4TransactionalTest;

import org.junit.Before;
import org.junit.Ignore;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;


/**
 * JUnit Tests for the Productcockpit extension
 */
@Ignore
public abstract class ProductcockpitTest extends HybrisJUnit4TransactionalTest
{
	protected ApplicationContext applicationContext;

	@Before
	public void initApplicationContext() throws Exception
	{
		final GenericApplicationContext context = new GenericApplicationContext();
		context.setResourceLoader(new DefaultResourceLoader(Registry.class.getClassLoader()));
		context.setClassLoader(Registry.class.getClassLoader());
		context.getBeanFactory().setBeanClassLoader(Registry.class.getClassLoader());
		context.setParent(Registry.getGlobalApplicationContext());
		final XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(context);
		xmlReader.setBeanClassLoader(Registry.class.getClassLoader());
		xmlReader.loadBeanDefinitions(getSpringConfigurationLocations());
		context.refresh();
		final AutowireCapableBeanFactory beanFactory = context.getAutowireCapableBeanFactory();
		beanFactory.autowireBeanProperties(this, AutowireCapableBeanFactory.AUTOWIRE_BY_NAME, true);
		this.applicationContext = context;
	}

	protected String[] getSpringConfigurationLocations()
	{
		return new String[]
		{ "classpath:/cockpit/cockpit-spring-wrappers.xml", //
				"classpath:/cockpit/cockpit-spring-services.xml", //
				"classpath:/productcockpit/productcockpit-junit-spring.xml", //
				"classpath:/productcockpit/productcockpit-spring-services.xml", //
				"classpath:/productcockpit/productcockpit-spring-services-test.xml" };
	}

}
