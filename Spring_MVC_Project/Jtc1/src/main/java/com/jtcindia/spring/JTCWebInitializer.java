package com.jtcindia.spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class JTCWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("-- getRootConfigClasses() --");
		return new Class[] { JTCwebConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("-- getServletConfigClasses() --");
		return new Class[] { JTCwebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("-- getServletMappings() --");
		return new String[] { "*.jtc" };
	}

}
