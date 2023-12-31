package com.blood_bank_system.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blood_bank_system.DAO.BloodBankDAO;
import com.blood_bank_system.tables.blood_bank;

@WebServlet("/search")
public class seraching extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter out = res.getWriter();

		String type = request.getParameter("filter");
		String key = request.getParameter("key");
		List<blood_bank> bank = new ArrayList<>();
		BloodBankDAO dao = new BloodBankDAO();
//		out.print("" + type);
		if (type.equals("name")) {
			out.print("name");
			try {
				bank = dao.searchforname(key);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpSession session = request.getSession();
			session.removeAttribute("bloodBanks");
			session.setAttribute("bloodBanks", bank);
			RequestDispatcher ds = request.getRequestDispatcher("All_banks.jsp");
			ds.forward(request, res);
		} else if (type.equals("region")) {
			
			try {
				bank = dao.searchforregion(key);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpSession session = request.getSession();
			session.removeAttribute("bloodBanks");
			
			session.setAttribute("bloodBanks", bank);
			out.print(session.getAttribute("bloodBanks"));
			RequestDispatcher ds = request.getRequestDispatcher("All_banks.jsp");
			ds.forward(request, res);
		}
		
else if (type.equals("address")) {
			
			try {
				bank = dao.searchforaddress(key);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpSession session = request.getSession();
			session.removeAttribute("bloodBanks");
			
			session.setAttribute("bloodBanks", bank);
			out.print(session.getAttribute("bloodBanks"));
			RequestDispatcher ds = request.getRequestDispatcher("All_banks.jsp");
			ds.forward(request, res);
		}
	else if (type.equals("")) {
		
		try {
			bank = dao.getAllBloodBanks();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session = request.getSession();
		session.removeAttribute("bloodBanks");
		
		session.setAttribute("bloodBanks", bank);
		out.print(session.getAttribute("bloodBanks"));
		RequestDispatcher ds = request.getRequestDispatcher("All_banks.jsp");
		ds.forward(request, res);
	}
}

}
