package com.filter;


import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.User;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter({ "/AddNewsDisplay", "/AddNewsServlet", "/AdminDisplay", "/DeleteNewsDisplay", "/ModifyNewsDisplay", "/SearchNewsServlet", "/UpdateNewsServlet"})
public class LoginFilter implements Filter {
	private static Logger logger = Logger.getLogger(LoginFilter.class.getName());

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 // TODO Auto-generated method stub
	    HttpServletRequest req = (HttpServletRequest) request;
	    // 验证用户登录状态，未登录，重定向到登录页面
	    User user = (User) req.getSession().getAttribute("user");
	    if (user != null && user.isIs_admin() == true) {
	    	// 登录则不执行任何操作，向下传递
			chain.doFilter(request, response);
	    } else {
	    	logger.info("未登录访问：" + req.getServletPath());
	    	HttpServletResponse res = (HttpServletResponse) response;
	    	res.sendRedirect(req.getContextPath() + "/LoginDisplay");
	    	return;
	    }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
