package com.nyota.example.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApplicationInit implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebApplicationConfig.class);

        // Create and register the DispatcherServlet
        DispatcherServlet servlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
		
	}

}
