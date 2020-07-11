package com.elearntez.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.elearntez.springmvc.bean.City;
import com.elearntez.springmvc.service.CityService;

@RestController
//@RequestMapping("/city")
public class CityController {
	
	@Autowired
	private CityService service;

	//produces --> to client
	//consumer --> from client
	@GetMapping(value="/city/{id}", 
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE    }
			)
	@ResponseStatus(code = HttpStatus.ACCEPTED )
	public City getCityById(@PathVariable("id") Integer id){
		
		System.out.println("id "+id);
		return service.getCityById(id);
	}
	
	@GetMapping("/city")
	public ResponseEntity<City> getCityByIdWithRequestParam(@RequestParam("id") Integer id,
			@RequestHeader(value="User-Agent") String userAgent){
		System.out.println("id "+id+" userAgent "+userAgent);
		City city = service.getCityById(id);
		return new ResponseEntity<City>(city, HttpStatus.OK);
	}
	
	// 200
	@GetMapping("/cookie1")
	//@ResponseStatus(code = HttpStatus.NO_CONTENT )
	public void cookieValueDemo1(@CookieValue("name") String name){
		System.out.println("Cookie value "+name);		
	}
	
	//204
	@GetMapping("/cookie2")
	public ResponseEntity<Void> cookieValueDemo2(@CookieValue("name") String name){
		System.out.println("Cookie value "+name);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
