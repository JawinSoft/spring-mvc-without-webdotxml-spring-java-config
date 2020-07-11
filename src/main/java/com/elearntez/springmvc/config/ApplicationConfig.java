package com.elearntez.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.elearntez.springmvc.interceptors.TimeLoggingInterceptor;


@Configuration
@EnableWebMvc
@ComponentScan("com.elearntez.springmvc")
public class ApplicationConfig implements WebMvcConfigurer{
   
	@Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }// /WEB-INF/jsp/hello.jsp
	//  -> /WEB-INF/jsp/success.jsp
    
   

	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(timeLoggingInterceptor()); 
    }
	
	 @Bean
	    public TimeLoggingInterceptor  timeLoggingInterceptor(){
	    	return new TimeLoggingInterceptor();
	    }
    
    
}