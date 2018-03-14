package com.aotian.demo.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aotian.demo.dubbo.api.DemoService;

public class Consumer {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context 
			= new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
		context.start();
		
		String username = "aotian";
		DemoService demoService = (DemoService) context.getBean("demoService");
		System.out.println(demoService.changeUsername(username));
	}
	
}
