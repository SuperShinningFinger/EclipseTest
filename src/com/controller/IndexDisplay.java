package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.News;
import com.service.NewsService;
import com.service.ServiceFactory;

/**
 * Servlet implementation class IndexDisplay
 */
@WebServlet("/IndexDisplay")
public class IndexDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NewsService newsService = ServiceFactory.getNewsService();   
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    request.setAttribute("position", "主页");
		List<News> allnewses = newsService.listNews();
		List<News> newses = allnewses;
		if (allnewses.size() > 5) { 
			newses = allnewses.subList(0, 4);
		}
		for (News news : newses) {
			if (news.getContent().length() >= 40) {
				news.setContent(news.getContent().substring(0, 40));
			}
		}
		for (News news : newses) {
			if (news.getTitle().length() >= 20) {
				news.setTitle(news.getContent().substring(0, 20) + "...");
			}
		}
	    request.setAttribute("newses", newses);
	    int select = Integer.parseInt(request.getParameter("select"));
	    switch(select){
		    case 0:
		    	request.setAttribute("select", "Introduction/general.jsp");
		        break;
		    case 1:
		    	request.setAttribute("select", "Introduction/introduction.jsp");
		        break;
		    case 2:
		    	request.setAttribute("select", "Introduction/direction.jsp");
		        break;
		    default:
		    	request.setAttribute("select", "Introduction/introduction.jsp");
		        break;
	    }
		request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
