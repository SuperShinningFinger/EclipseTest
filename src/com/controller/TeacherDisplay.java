package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Teacher;
import com.service.ServiceFactory;
import com.service.TeacherService;

/**
 * Servlet implementation class TeacherDisplay
 */
@WebServlet("/TeacherDisplay")
public class TeacherDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private TeacherService teacherService = ServiceFactory.getTeacherService(); 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    request.setAttribute("position", "教师信息");
		int id = Integer.parseInt(request.getParameter("id"));
		Teacher teacher = teacherService.getTeacher(id);
		request.setAttribute("teacher", teacher);
		request.getRequestDispatcher("/WEB-INF/jsp/Teacher/Infoes/teacher1_display.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
