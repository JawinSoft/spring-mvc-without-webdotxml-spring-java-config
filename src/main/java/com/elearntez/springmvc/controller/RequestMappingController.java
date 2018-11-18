package com.elearntez.springmvc.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rest")
public class RequestMappingController {

	@GetMapping
	public String getMapping(){
		System.out.println("Http Get Request");
	  return "You Sent Http Get Request";
	}
	
	@PostMapping
   public String postMapping(){
	   System.out.println("Http Post Request");
		  return "You Sent Http Post Request";
    }
   
	@PutMapping
   public String putMapping(){
	   System.out.println("Http put Request");
		  return "You Sent Http put Request";
	}
   
	@DeleteMapping
   public String deleteMapping(){
	   System.out.println("Http Delete Request");
		  return "You Sent Http Delete Request";
	}

	@PatchMapping
   public String patchMapping(){
	   System.out.println("Http Patch Request");
		  return "You Sent Http Patch Request";
	}
	
	
	
}
