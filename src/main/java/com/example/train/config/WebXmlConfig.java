package com.example.train.config;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebXmlConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean frgb = new FilterRegistrationBean();
        frgb.setFilter(new StrutsPrepareAndExecuteFilter());
        List list = new ArrayList();
        list.add("/*");
        list.add("*.action");
        frgb.setUrlPatterns(list);
        return frgb;
    }
}
