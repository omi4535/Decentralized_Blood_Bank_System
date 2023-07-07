package com.blood_bank_system.servlets;

import java.io.IOException;
import com.blood_bank_system.DAO.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delete_inventory
 */
@WebServlet("/delete_inventory")
public class delete_inventory extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		inventoryDAO dao = new inventoryDAO();
		if(dao.deleteInventory(request.getParameter("in_id"))) {
			response.sendRedirect("admin_page_servlet");
		}else {
			response.sendRedirect("admin_page_servlet");
		}
	}

	
}
