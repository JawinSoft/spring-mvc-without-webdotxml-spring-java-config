package com.elearntez.springmvc.controller;

import java.util.Map;

import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HandlerMapping;

@Controller
public class HelloController {
	
	@Autowired
    ApplicationContext context;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(Model map){
		System.out.println(" sayHello sayHello ");
		map.addAttribute("Message", "Welcome to Spring MVC with out web.xml");
		 Map<String, HandlerMapping> matchingBeans = 
				            BeanFactoryUtils.beansOfTypeIncludingAncestors(
	                context, HandlerMapping.class, true, false);
	      
		 System.out.println(matchingBeans);
	      matchingBeans.forEach((k, v) -> System.out.printf("order:%s %s=%s%n",
	                                                        ((Ordered) v).getOrder(),
	                                                        k, v.getClass().getSimpleName()));
		return "hello";
	}
	

}
