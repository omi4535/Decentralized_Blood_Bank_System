package com.blood_bank_system.servlets;

import java.io.IOException;
import java.util.*;
import com.blood_bank_system.DAO.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blood_bank_system.tables.blood_bank;

/**
 * Servlet implementation class all_banks
 */
@WebServlet("/banks")
public class all_banks extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<blood_bank> bank= new ArrayList<>();
		BloodBankDAO dao = new BloodBankDAO();
		try {
			bank = dao.getAllBloodBanks();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("here is exception");
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		session.setAttribute("bloodBanks", bank);
		RequestDispatcher ds = request.getRequestDispatcher("All_banks.jsp");
		ds.forward(request, response);
	}

}
