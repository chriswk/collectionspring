package com.chriswk.collection.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class CollectionInitializer implements WebApplicationInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger(CollectionInitializer.class);
	public void onStartup(ServletContext servletContext) {
		LOGGER.info("Starting up");
        AnnotationConfigWebApplicationContext mvcContext = new AnnotationConfigWebApplicationContext();
		mvcContext.register(CollectionMvcConfig.class);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(mvcContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
        LOGGER.info("Done loading");
	}
	
}