package com.infotech.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.CustomEventPublisher;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		CustomEventPublisher customEventPublisher = ctx.getBean("customEventPublisher", CustomEventPublisher.class);
		
		customEventPublisher.publishEvent();
		ctx.close();
	}

}
