package com.blood_bank_system.servlets;

import com.blood_bank_system.tables.*;
import com.blood_bank_system.DAO.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class register_admin
 */
@WebServlet("/register_admin")
public class register_admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		admistrator admin = new admistrator();
		String b_id;
		HttpSession s = request.getSession();
		if(s.getAttribute("id").toString()==null) {
			 b_id ="1";
		}else {
			 b_id = (String) s.getAttribute("id");
		}
		
		admin.setBank_id(b_id);
		admin.setEmail(request.getParameter("email"));
		admin.setName(request.getParameter("name"));
		admin.setUname(request.getParameter("username"));
		admin.setPass(request.getParameter("password"));
		adminstratorDAO dao = new adminstratorDAO();
		if(dao.insertAdministrator(admin)!=0) {
			response.sendRedirect("success.jsp");
		}else {
			response.sendRedirect("fail.jsp");
		}
	}

}
