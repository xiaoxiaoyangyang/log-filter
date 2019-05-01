package com.example.testbeanpostprocessor.filter;


import com.example.testbeanpostprocessor.wrapper.BodyReaderHttpServletRequestWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;

/**
 * 用来打印入参时的参数
 * @Author: guozhiyang_vendor
 * @Date: 2019/4/30 18:59
 * @Version 1.0
 */
@Configuration
@Slf4j
@WebFilter(filterName = "RequestLogFilter", urlPatterns = {"/**"})
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        BodyReaderHttpServletRequestWrapper requestWrapper = new BodyReaderHttpServletRequestWrapper((HttpServletRequest)servletRequest);
        String accessToken = requestWrapper.getHeader("accessToken");
        String uri = requestWrapper.getRequestURI();
        Enumeration<String> parameterNames = requestWrapper.getParameterNames();
        HashMap queryParameter = new HashMap(16);

        while(parameterNames.hasMoreElements()) {
            String key = (String)parameterNames.nextElement();
            queryParameter.put(key, requestWrapper.getParameter(key));
        }

        log.info("--> request uri:[{}],accessToken[{}],query parameter:[{}],body paramater:[{}]", uri, accessToken,
                queryParameter, requestWrapper.getBody());
        filterChain.doFilter(requestWrapper, servletResponse);

    }
}
