package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.spring.bean.MyBean;
import com.spring.bean.MyBean2Implement;
import com.spring.bean.MyBeanWithDependecy;
import com.spring.bean.MyBeanWithDependencyImplement;
import com.spring.bean.MyOperation;
import com.spring.bean.MyOperationImplement;


@Configuration
public class MyConfigurationBean {
	
	@Bean
	public MyBean beanOperation() {
		
		//return new MyBeanImplement();
		return new MyBean2Implement();
		
	}
	
	@Bean
	public MyOperation beanOperationOperation() {
		
		return new MyOperationImplement();
		
	}
	
	@Bean
	public MyBeanWithDependecy beanOperationOperationWhithDependency(MyOperation myOperation) {
		
		return new MyBeanWithDependencyImplement(myOperation);
		
	}

}
