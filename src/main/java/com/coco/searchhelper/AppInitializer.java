package com.coco.searchhelper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.coco.searchhelper.config.AppRootConfig;
import com.coco.searchhelper.config.AppServletConfig;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{AppRootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{AppServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/*"};
	}

}
