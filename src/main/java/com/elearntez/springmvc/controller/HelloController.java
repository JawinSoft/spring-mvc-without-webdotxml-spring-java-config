package com.elearntez.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping(value="/hello")
	public @ResponseBody String sayHello(Model map){
		System.out.println(" sayHello sayHello ");
		return "Welcome to Spring MVC with out web.xml";
	}
	
	@PostMapping(value="/post")
	public String sayHelloPost(Model map){
		System.out.println(" sayHello sayHello ");
		return "Welcome to Spring MVC with out web.xml from POst Method";
	}

}
