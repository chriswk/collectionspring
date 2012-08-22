package com.chriswk.collection.config;

import org.fusesource.scalate.spring.view.ScalateViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.chriswk.collection")
public class CollectionMvcConfig {

    @Bean
	public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp");
        resolver.setSuffix(".jsp");
        resolver.setOrder(2);
        return resolver;
    }

    @Bean
    public ViewResolver scalateViewResolver() {
        ScalateViewResolver resolver = new ScalateViewResolver();
        resolver.setPrefix("/WEB-INF/jade");
        resolver.setSuffix(".jade");
        resolver.setOrder(1);
        return resolver;
    }


}