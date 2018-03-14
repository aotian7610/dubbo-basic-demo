package com.aotian.demo.dubbo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context 
			= new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
		context.start();
		System.in.read();
	}
	
}
