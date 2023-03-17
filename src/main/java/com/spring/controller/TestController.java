package com.spring.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping
	@ResponseBody
	public ResponseEntity<String> function(){
		
		return new ResponseEntity<>("Hello desde mi controlador",HttpStatus.OK);
		
	}

}
