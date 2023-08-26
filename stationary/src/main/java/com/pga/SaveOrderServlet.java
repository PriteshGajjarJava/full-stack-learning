package com.pga;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SaveOrderServlet
 */
@WebServlet("/showSummary")
public class SaveOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> list = new ArrayList<Product>();
		for (int i=1; i <=5 ; i++) {
			int qty = Integer.parseInt(request.getParameter("product"+i));
			if (qty > 0) {
				String name = request.getParameter("product"+i+"_name");
				int price = Integer.parseInt(request.getParameter("product"+i+"_price"));
				Product p = new Product(name, qty, price);
				list.add(p);
			}
		}
		HttpSession session = request.getSession();
		session.setAttribute("ORDER", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("summary.jsp");
		rd.forward(request, response);
	}

}


