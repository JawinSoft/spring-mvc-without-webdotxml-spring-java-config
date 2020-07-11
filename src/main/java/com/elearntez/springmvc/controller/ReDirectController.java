package com.elearntez.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/redirect")
public class ReDirectController {
	
	
	@GetMapping("/home")
	   public String redirect() {
		
		 //response.sendRedirect(arg0);
		
	      return "redirect:https://www.google.com/search?q=covid+19";
	   }
	
}
