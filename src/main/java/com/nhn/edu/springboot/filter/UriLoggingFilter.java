package com.nhn.edu.springboot.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class UriLoggingFilter extends GenericFilterBean {
    private static final Logger log = LoggerFactory.getLogger(UriLoggingFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws
        IOException,
        ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        log.info(String.format("URI - %s", httpServletRequest.getRequestURI()));
        // filterChain 의 doFilter로 다음 필터로 연결한다
        filterChain.doFilter(servletRequest, servletResponse);

    }
}
