package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//Life Cycle methods using Xml File
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Samosa s =(Samosa) context.getBean("s1");
		System.out.println(s);
			//registering Shutdown hook
		context.registerShutdownHook();
		
		System.out.println("+++++++++++++++++++++++++++");
		//Life Cycle methods using Interface
		Pepsi p = (Pepsi) context.getBean("p1");
		System.out.println(p);
		
		System.out.println("++++++++++++++++++");
		Example example = (Example) context.getBean("ex");
		System.out.println(example);
	}
	
}
