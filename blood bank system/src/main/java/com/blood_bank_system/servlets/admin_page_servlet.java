package com.blood_bank_system.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.blood_bank_system.tables.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.blood_bank_system.DAO.*;

/**
 * Servlet implementation class admin_page_servlet
 */
@WebServlet("/admin_page_servlet")
public class admin_page_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
//		String adm_id=(String) session.getAttribute("admin_id");
		String b_id = (String) session.getAttribute("b_id");
		inventoryDAO dao = new inventoryDAO();
		List<inventory> inventoies;
		inventoies = dao.getAllInventoryEntries(b_id);
		PrintWriter out = response.getWriter();
		out.print(inventoies.size());
		session.setAttribute("inventories", inventoies);
	    response.sendRedirect("admin_page.jsp");
			
	}

	

}
