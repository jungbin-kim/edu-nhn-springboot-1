package com.nhn.edu.springboot.configuration;

import com.nhn.edu.springboot.filter.UriLoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class FilterRegistrationConfiguration {
    // Filter 를 등록한다.
    @Bean
    public FilterRegistrationBean uriLoggingFilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new UriLoggingFilter());
        // filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        // filterRegistrationBean.setOrder(1000);
        return filterRegistrationBean;
        // 다른 옵션 (필터 적용 순서 등)을 적용하고 싶으면 위와 같이 해도 되고, 간단하게는 아래와 같이 하면 된다.
        // return new FilterRegistrationBean(new FilterRegistrationBean(););
    }
}
