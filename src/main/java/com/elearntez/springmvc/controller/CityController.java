package com.elearntez.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.elearntez.springmvc.bean.City;
import com.elearntez.springmvc.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {
	
	@Autowired
	private CityService service;

	@RequestMapping(value="/{id}", method= RequestMethod.GET, 
			            produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody City getCityById(@PathVariable("id") Integer id){
		System.out.println("id "+id);
		return service.getCityById(id);
	}
	
	@GetMapping
	public City getCityByIdWithRequestParam(@RequestParam("id") Integer id,
			@RequestHeader(value="User-Agent") String userAgent){
		System.out.println("id "+id+" userAgent "+userAgent);
		return service.getCityById(id);
	}
	
	@GetMapping("/cookie")
	public void cookieValueDemo(@CookieValue("name") String name){
		System.out.println("Cookie value "+name);
		
	}
}
