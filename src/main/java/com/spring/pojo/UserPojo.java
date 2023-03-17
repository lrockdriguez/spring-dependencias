package com.spring.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix="user")
@ConstructorBinding
public class UserPojo {
	
	
	
	public UserPojo(String email, String password, int age) {
		this.email = email;
		this.password = password;
		this.age = age;
	}
	private String email;
	private String password;
	private int age;

}
