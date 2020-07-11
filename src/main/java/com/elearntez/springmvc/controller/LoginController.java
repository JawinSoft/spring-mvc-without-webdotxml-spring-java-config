package com.elearntez.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.elearntez.springmvc.bean.User;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class LoginController {
	
   /*
    * Add user in model attribute
    */
   @ModelAttribute("user")
   public User setUpUserForm() {
      return new User();
   }

   
   //http://localhost:8080/spring-mvc-without-webdotxml-spring-java-config/spring/user/login
   @GetMapping("/login")
   public String index() {
	   System.out.println("This Statement from Controller....");
      return "index";
   }

   @PostMapping("/dologin")
   public String doLogin(@ModelAttribute("user") User user, Model model) {
   
      // Implement your business logic
      if (user.getEmail().equals("manakasunil@gmail.com") && 
    		   user.getPassword().equals("abc@123")) {
    	  user.setFname("Sunil");
    	  user.setLname("Manaka");
    	  user.setMname("Kumar");
    	  return "success";
      } else {
         model.addAttribute("errorMessage", "Login failed. Try again.");
         return "index";
      }
      
   }
   
   /*
    * Get user from session attribute
    */
   @GetMapping("/info")
   public String userInfo(@SessionAttribute("user") User user) {

      System.out.println("Email: " + user.getEmail());
      System.out.println("First Name: " + user.getFname());

      return "user";
   }
   
   
   @GetMapping("/logout")
   public String logout(HttpSession session) {
	   session.removeAttribute("user");
	   session.invalidate();
	   return "index";
   }
}