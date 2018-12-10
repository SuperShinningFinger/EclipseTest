package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.News;
import com.service.NewsService;
import com.service.ServiceFactory;

/**
 * Servlet implementation class NewsDetailDisplay
 */
@WebServlet("/NewsDetailDisplay")
public class NewsDetailDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 基于ServiceFactory工厂，获取单例的UserService组件
	private NewsService newsService = ServiceFactory.getNewsService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsDetailDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      // 获取指定ID新闻的详细信息
      int id = Integer.valueOf(request.getParameter("id"));
      News news = newsService.getNews(id);
      request.setAttribute("news", news);
	    request.setAttribute("position", "新闻浏览");
      request.getRequestDispatcher("/WEB-INF/jsp/News/detail_display.jsp")
      .forward(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
