package com.app.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfiguration.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        //return new Class[0];
        return null;
    }

    protected String[] getServletMappings() {
        return new String[]{"/rest/*"};
    }
}
