package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Aachar {
private String name;

@Override
public String toString() {
	return "Aachar [name=" + name + "]";
}

public Aachar() {
	super();
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@PostConstruct
public void start() {
	System.out.println("Starting method");
}
@PreDestroy
public void end() {
	
	System.out.println("Ending method");
}
}


