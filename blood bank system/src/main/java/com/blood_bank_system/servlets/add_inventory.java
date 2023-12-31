package com.blood_bank_system.servlets;
import com.blood_bank_system.tables.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.blood_bank_system.DAO.*;
/**
 * Servlet implementation class add_inventory
 */
@WebServlet("/add_inventory")
public class add_inventory extends HttpServlet {
	inventoryDAO dao = new inventoryDAO();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		inventory in = new inventory();
		HttpSession session = request.getSession();
		String b_id = (String) session.getAttribute("b_id");
		String admin_id = (String) session.getAttribute("admin_id"); 
		in.setBloodGroup(request.getParameter("bloodGroup"));
		in.setLastUpdatedDate(request.getParameter("lastUpdatedDate"));
		in.setStorageLocation(request.getParameter("storageLocation"));
//		in.setAvailableUnits(request.getParameter("availableUnits"));
		in.setAvailableUnits(request.getParameter("availableUnits"));
		in.setBloodBankId(b_id);
		in.setEditor(admin_id);
		

	      
		
		dao.addInventory(in);
			response.sendRedirect("admin_page_servlet");
		
	}

	
}
