package com.spring.componet;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{

	@Override
	public void saludar() {

		System.out.println("Hola putos asquerosos, los odio!!");
	}
	
	
	

}
