package com.spring;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.bean.MyBean;
import com.spring.bean.MyBeanWithDependecy;
import com.spring.bean.MyBeanWithProperties;
import com.spring.componet.ComponentDependency;
import com.spring.pojo.UserPojo;

@SpringBootApplication
public class SpringDependenciasApplication implements CommandLineRunner{
	
	private final Log LOOGER = LogFactory.getLog(SpringDependenciasApplication.class);
	
	private ComponentDependency componentDependecy;
	private MyBean myBean;
	private MyBeanWithDependecy myBeanWithDependency;

	private MyBeanWithProperties myBeanWithProperties;
	@Autowired
	private UserPojo userPojo;
	
	
	public SpringDependenciasApplication(@Qualifier("componentTwoImplement") 
		ComponentDependency componentDependecy, MyBean myBean, MyBeanWithDependecy myBeanWithDependency,
		MyBeanWithProperties myBeanWithProperties, UserPojo userPojo) {
		this.componentDependecy = componentDependecy;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
		this.myBeanWithProperties = myBeanWithProperties;
		this.userPojo = userPojo;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDependenciasApplication.class, args);
		
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		componentDependecy.saludar();
		myBean.print();
		myBeanWithDependency.printWhithDependency();
		System.out.println(myBeanWithProperties.function());
		System.out.println(userPojo.getEmail() + "-" + userPojo.getPassword());
		LOOGER.error("esto es un error");
	}

}
