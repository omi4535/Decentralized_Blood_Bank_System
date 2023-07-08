package com.blood_bank_system.servlets;

import java.io.IOException;
import com.blood_bank_system.DAO.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateInventory
 */
@WebServlet("/updateInventory")
public class updateInventory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		inventoryDAO dao = new inventoryDAO();
		String in_id = req.getParameter("in_id");
		String av_unit = req.getParameter("availableUnits");
		String updated_Date = req.getParameter("lastUpdatedDate");
		String updated_loc = req.getParameter("storageLocation");
		
		dao.updateBloodInventory(in_id,av_unit,updated_Date,updated_loc);
		res.sendRedirect("admin_page_servlet");
	}

	

}
