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
 * Servlet implementation class LabDisplay
 */
@WebServlet("/LabDisplay")
public class LabDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NewsService newsService = ServiceFactory.getNewsService();  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LabDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    request.setAttribute("position", "实验室");	    
		List<News> allnewses = newsService.listNews();
		List<News> newses = allnewses;
		if (allnewses.size() > 5) { 
			newses = allnewses.subList(0, 4);
		}
		for (News news : newses) {
			if (news.getContent().length() >= 20) {
				news.setContent(news.getContent().substring(0, 20));
			}
		}
	    request.setAttribute("newses", newses);
		int select = Integer.parseInt(request.getParameter("select"));
	    switch(select){
	    case 1:
	    	request.setAttribute("select", "Lab/lab1.jsp");
	        break;
	    case 2:
	    	request.setAttribute("select", "Lab/lab2.jsp");
	        break;
	    case 3:
	    	request.setAttribute("select", "Lab/lab3.jsp");
	        break;
	    default:
	    	request.setAttribute("select", "Lab/general.jsp");
			request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
			return;
	    }
		request.getRequestDispatcher("/WEB-INF/jsp/Lab/lab_display.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
