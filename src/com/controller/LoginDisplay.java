package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.User;
import com.service.NewsService;
import com.service.ServiceFactory;
import com.service.UserService;

/**
 * Servlet implementation class LoginDisplay
 */
@WebServlet("/LoginDisplay")
public class LoginDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = ServiceFactory.getUserService();   
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("position", "后台登录");
		if (request.getSession().getAttribute("user") != null) {
		    response.sendRedirect(request.getContextPath() + "/AdminDisplay");
		    return;
	    }
		request.getRequestDispatcher("/WEB-INF/jsp/Admin/login_display.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setAttribute("position", "后台登录");
		// TODO Auto-generated method stub // 获取post传入的参数
		String user_name = request.getParameter("user_name");
	    String password = request.getParameter("password");
	    // 由业务逻辑层组件处理具体的业务逻辑，serlvet不负责验证处理
	    User user = userService.getUser(user_name, password);
	    String redPath = "/LoginDisplay";
	    // 用户存在，置于session，跳转到welcome
	    if (user != null) {
	      request.getSession().setAttribute("user", user);
	      redPath = "/AdminDisplay";
	    } 
	    // 不存在则跳转到login
	    response.sendRedirect(request.getContextPath() + redPath);
	}
}
