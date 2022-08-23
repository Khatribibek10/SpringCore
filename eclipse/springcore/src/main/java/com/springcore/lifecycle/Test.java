package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/samosa_config.xml");
		context.registerShutdownHook();//registerShutdownHook is method from AbstractApplicationContext
//		Samosa s1 = (Samosa) context.getBean("samosa");
//		System.out.println(s1);
//		System.out.println("======================");
//		Pepsi p1 = (Pepsi)context.getBean("pepsi");
//		System.out.println(p1);
		
		Aachar aachar = (Aachar)context.getBean("aachar");
		System.out.println(aachar);
		
		
		
	}
}
