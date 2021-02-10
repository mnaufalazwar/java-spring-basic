package com.mnaufalazwar.springframeworkbasic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPP implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("My Bean Factory Processor is called");
	}

}

//<bean class="com.mnaufalazwar.springframeworkbasic.MyBeanFactoryPP"></bean>