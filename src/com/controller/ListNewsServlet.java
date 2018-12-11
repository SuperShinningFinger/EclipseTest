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
 * Servlet implementation class ListNewsServlet
 */
@WebServlet("/ListNewsServlet")
public class ListNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private NewsService newsService = ServiceFactory.getNewsService();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // TODO Auto-generated method stub
	  req.setAttribute("position", "软件新闻");
      // 实现加载全部新闻
	  List<News> newses = newsService.listNews();
      req.setAttribute("newses", newses);
		for (News news : newses) {
			if (news.getTitle().length() >= 20) {
				news.setTitle(news.getTitle().substring(0, 20) + "...");
			}
		}
      req.getRequestDispatcher("/WEB-INF/jsp/News/list_display.jsp")
      .forward(req, resp);
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
