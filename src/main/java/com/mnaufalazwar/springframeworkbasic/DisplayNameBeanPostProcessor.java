package com.mnaufalazwar.springframeworkbasic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
//		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
		System.out.println("In Before Initialization method. Bean name is " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
//		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
		System.out.println("In After Initialization method. Bean name is " + beanName);
		return bean;
	}

}

// <bean class="com.mnaufalazwar.springframeworkbasic.DisplayNameBeanPostProcessor"></bean>