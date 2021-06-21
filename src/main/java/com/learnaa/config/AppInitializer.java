package com.learnaa.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class AppInitializer implements WebApplicationInitializer{
	
	@Override
	public void onStartup(ServletContext servletcontext) throws ServletException{
		WebApplicationContext context=getContext();
		
	}
	
	private AnnotationConfigWebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("com.learnaa.controller");
        return context;
    }

}
