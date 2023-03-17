package com.spring.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.MyBeanWithProperties;
import com.spring.bean.MyBeanWithPropertiesImplement;
import com.spring.pojo.UserPojo;

@Configuration
@EnableConfigurationProperties(UserPojo.class)
public class GeneralConfiguration {
	
	@Value("${value.nombre}")
	private String nombre;
	
	@Value("${value.apellido}")
	private String apellido;
	
	@Value("${value.random}")
	private String random;
	
	@Bean
	public MyBeanWithProperties function() {
		
		return new MyBeanWithPropertiesImplement(nombre, apellido);
	}
	

}
