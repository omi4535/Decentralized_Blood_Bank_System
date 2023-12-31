package com.blood_bank_system.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Enumeration;

import com.blood_bank_system.DAO.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blood_bank_system.tables.admistrator;

/**
 * Servlet implementation class login_servlet
 */
@WebServlet("/login_servlet")
public class login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		admistrator admin=null;
		loginDAO dao = new loginDAO();
		HttpSession session = request.getSession();
		try {
			admin = dao.validateLogin(request.getParameter("username"), request.getParameter("password"));
			if(admin!=null) {
//				session.invalidate();
				Enumeration<String> attributeNames = session.getAttributeNames();

				while (attributeNames.hasMoreElements()) {
				    String attributeName = attributeNames.nextElement();
				    session.removeAttribute(attributeName);
				}
				session.setAttribute("admin_id", admin.getAdm_id());
				session.setAttribute("b_id", admin.getBank_id());
//				System.out.print(session);
				response.sendRedirect("admin_page_servlet");
			}else {
//				System.out.print(session);
				response.sendRedirect("fail.jsp");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
