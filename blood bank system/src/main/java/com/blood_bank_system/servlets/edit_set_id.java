package com.blood_bank_system.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class edit_set_id
 */
@WebServlet("/edit_set_id")
public class edit_set_id extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession();
		int a = Integer.parseInt(request.getParameter("in_id1"));
		s.setAttribute("idd", a);
		response.sendRedirect("edit_inventory.jsp");
	}

	

}
