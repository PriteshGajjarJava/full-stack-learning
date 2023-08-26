package com.pga;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getCube")
public class CubeServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int n = Integer.parseInt(request.getParameter("num"));
		int ans = n * n * n;
		PrintWriter out = response.getWriter();
		out.write("<h3> Cube of number " + n + " is: " + ans +"</h3>");
	}
}
