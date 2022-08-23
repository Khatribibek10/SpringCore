package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Addition_Main {
	public static void main(String[] args) {
	ApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/constructor/ci_config.xml");
	Addition add = (Addition)context.getBean("add");
	add.doSum();
	}

}
