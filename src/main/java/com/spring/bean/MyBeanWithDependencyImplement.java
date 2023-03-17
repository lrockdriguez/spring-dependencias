package com.spring.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyBeanWithDependencyImplement implements MyBeanWithDependecy{
	
	private final static Log LOGGER = LogFactory.getLog(MyBeanWithDependencyImplement.class);
	private MyOperation myOperation;
	
	

	public MyBeanWithDependencyImplement(MyOperation myOperation) {

		this.myOperation = myOperation;
	}



	@Override
	public void printWhithDependency() {
		
		LOGGER.info("Hemos ingresado al metodo printWhithDependency");
		int number = 3;
		System.out.println(myOperation.sum(number));
		LOGGER.debug("El numero enviado como parametro a la dependencia es : "+number);
		System.out.println("hola pendenjo desde la implementación del bean con dependencia");
		
		
		
	}
	
	

}
