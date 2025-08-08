package com.jtcindia.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan({ "com.jtcindia.spring" })
public class JTCwebConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewresolver = new InternalResourceViewResolver();
		System.out.println("-- InternalResourceViewResolver viewResolver() --");
		viewresolver.setViewClass(JstlView.class);
		viewresolver.setPrefix("/");
		viewresolver.setSuffix(".jsp");
		return viewresolver;
	}

}
