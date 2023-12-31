package com.blood_bank_system.servlets;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blood_bank_system.DAO.BloodBankDAO;
import com.blood_bank_system.tables.blood_bank;

import java.io.IOException;
import java.sql.ResultSet;

@WebServlet("/register")
public class regi_controller extends HttpServlet {

    private BloodBankDAO bloodBankDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        bloodBankDAO = new BloodBankDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	HttpSession s = request.getSession();
    	String name = request.getParameter("name");
        String address = request.getParameter("address");
        String region = request.getParameter("region");
        String contactNumber = request.getParameter("contactNumber");
        String email = request.getParameter("email");
        String operationalHours = request.getParameter("operationalHours");
        String specialServices = request.getParameter("specialServices");
        String contactPersonName = request.getParameter("contactPersonName");
        String contactPersonDesignation = request.getParameter("contactPersonDesignation");
        String contactPersonPhone = request.getParameter("contactPersonPhone");
        String contactPersonEmail = request.getParameter("contactPersonEmail");
        String certificationDetails = request.getParameter("certificationDetails");
        String accreditationDetails = request.getParameter("accreditationDetails");
        int storageCapacity = Integer.parseInt(request.getParameter("storageCapacity"));
        String bloodComponentsHandled = request.getParameter("bloodComponentsHandled");
        String testingFacilities = request.getParameter("testingFacilities");
        String transfusionServices = request.getParameter("transfusionServices");
        String otherActivities = request.getParameter("otherActivities");
        String additionalInformation = request.getParameter("additionalInformation");

        blood_bank bloodBank = new blood_bank(name, address, region, contactNumber, email, operationalHours, specialServices,
                contactPersonName, contactPersonDesignation, contactPersonPhone, contactPersonEmail, certificationDetails,
                accreditationDetails, storageCapacity, bloodComponentsHandled, testingFacilities, transfusionServices,
                otherActivities, additionalInformation);
        try {
        int id = bloodBankDAO.addBloodBank(bloodBank);
        
			if(id!=0) {
				s.setAttribute("id", ""+id);
				s.setAttribute("registered", true);
				 response.sendRedirect("create_administator.jsp");
			}else {
				 response.sendRedirect("registration.html");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Redirect to a success page
    }
}


