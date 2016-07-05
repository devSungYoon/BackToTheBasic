package com.artiveloper.study.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by kimsunwoo on 2016-06-23.
 */
public class CharSetFilter implements Filter {

    private String encoding;

    public void init(FilterConfig filterConfig) throws ServletException {
        encoding = filterConfig.getInitParameter("requestEncoding");
        if (encoding == null)
            encoding = "UTF-8";
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (null == request.getCharacterEncoding())
            request.setCharacterEncoding(encoding);

        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
    }

    public void destroy() {

    }
}
