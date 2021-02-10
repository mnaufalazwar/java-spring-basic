package com.mnaufalazwar.springframeworkbasic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

//@Component
public class Circle implements Shape, ApplicationEventPublisherAware{

//	@Autowired
	private Point center;
	@Autowired
	private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;
	
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

//	@SuppressWarnings("deprecation")
//	@Required
//	<bean class="org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor">
//	</bean>
	@Autowired
//	@Qualifier("circleRelated")
//	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle : Point is : (" + center.getX() + ", " + center.getY() + ")");
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "default greeting", null));
		System.out.println(this.messageSource.getMessage("greeting", null, "default greeting", null));
		
		//publish event
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}
	
	@PostConstruct
	public void initial() {
		System.out.println("INIT BRO");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY BRO");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher = publisher;
	}
}
