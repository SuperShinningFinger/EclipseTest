package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.NewsService;
import com.service.ServiceFactory;

/**
 * Servlet implementation class IndexDisplay
 */
@WebServlet("/ModifyNewsDisplay")
public class ModifyNewsDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NewsService newsService = ServiceFactory.getNewsService();  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyNewsDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    request.setAttribute("position", "修改新闻");
		int id = Integer.parseInt(request.getParameter("id"));
	    request.setAttribute("news", newsService.getNews(id));
		request.getRequestDispatcher("/WEB-INF/jsp/Admin/modify_news_display.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
