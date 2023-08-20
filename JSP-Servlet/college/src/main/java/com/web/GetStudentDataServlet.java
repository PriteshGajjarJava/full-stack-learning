package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pga.jdbc.Student;
import com.pga.jdbc.StudentCRUD;

/**
 * Servlet implementation class GetStudentDataServlet
 */
@WebServlet("/getStudentInfo")
public class GetStudentDataServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int rollNo = Integer.parseInt(request.getParameter("rollNo"));
		out.println("<h3> I'll get required data(WIP) for "  + rollNo + "</h3> ");
		
		try {
			Student s = StudentCRUD.getStudentById(rollNo);
			out.println("Result is : " + s);
			
			HttpSession session = request.getSession();
			session.setAttribute("STUDENT", s);
			
			// Option 1 to redirect (used for external website)
			// response.sendRedirect("./student-info.jsp");
			
			RequestDispatcher rd = request.getRequestDispatcher("student-info.jsp");
			rd.forward(request, response);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
