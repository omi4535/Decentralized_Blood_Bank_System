package com.blood_bank_system.servlets;

import java.io.IOException;
import java.sql.SQLException;

import com.blood_bank_system.tables.blood_bank;
import com.blood_bank_system.DAO.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/details")
public class details_controller extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse res) throws IOException {
		String idParameter = request.getParameter("id");
	    
	    if (idParameter != null && !idParameter.isEmpty()) {
	        int id = Integer.parseInt(idParameter);
	        // Process the bank ID as needed
	        blood_bank bank = null;
	        BloodBankDAO dao = new BloodBankDAO();
	        try {
				bank = dao.getBloodBankById(id);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        HttpSession session = request.getSession();
	        session.removeAttribute("curr_bank");
	        session.setAttribute("curr_bank", bank);
	        System.out.print(id);
	    } else {
	        // Handle the case when the ID parameter is missing or empty
	    	System.out.print("fail");
	    }
		
		res.sendRedirect("bank_details.jsp");
	}

}
