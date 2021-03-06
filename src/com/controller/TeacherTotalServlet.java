package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Teacher;
import com.service.NewsService;
import com.service.ServiceFactory;
import com.service.TeacherService;

/**
 * Servlet implementation class TeacherTotalServlet
 */
@WebServlet("/TeacherTotalServlet")
public class TeacherTotalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private TeacherService teacherService = ServiceFactory.getTeacherService(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherTotalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		if ("all".equals(title)) {
			request.setAttribute("position", "全部教师");
		} else {
			request.setAttribute("position", title);
		}
		List<Teacher> teachers = teacherService.listTitleTeacher(title);
		request.setAttribute("teachers", teachers);
	    request.getRequestDispatcher("/WEB-INF/jsp/Teacher/teacher_total.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
