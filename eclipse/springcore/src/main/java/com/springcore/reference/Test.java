package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/ref_config.xml");
		A a =  (A) context.getBean("aref");
//		System.out.print(a.getX());
//		System.out.print(a.getOb().getY());
		System.out.println(a);
	}

}
