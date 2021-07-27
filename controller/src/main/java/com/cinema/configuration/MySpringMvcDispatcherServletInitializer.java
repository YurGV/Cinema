package com.cinema.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class  MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {  //не используем
        return null;
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringWebConfig.class};  // класс конфигурации
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};                   //все запросы пользователя отправляем на dispatcher servlet
    }
}

