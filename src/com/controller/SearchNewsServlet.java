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
 * Servlet implementation class SearchNewsServlet
 */
@WebServlet("/SearchNewsServlet")
public class SearchNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private NewsService newsService = ServiceFactory.getNewsService(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str = request.getParameter("search");
	    request.setAttribute("newses", newsService.searchNews(str));
		request.getRequestDispatcher("/WEB-INF/jsp/Admin/admin_display.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
