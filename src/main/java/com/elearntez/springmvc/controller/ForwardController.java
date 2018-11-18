package com.elearntez.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/forward")
public class ForwardController {

	@GetMapping(value = "/test")
    public String handleTestRequest2 (){
         return "forward:/user/login";
    }
	
}
