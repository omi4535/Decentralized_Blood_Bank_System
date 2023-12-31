package com.blood_bank_system.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


import com.blood_bank_system.tables.admistrator;

public class adminstratorDAO {

	 private Connection connection;
	private String jdbcURL = "jdbc:mysql://localhost:3306/blood_bank";
	private String jdbcUsername = "root";
	private String jdbcPassword = "12345";
	    // Constructor to initialize the connection
	    
	    public int insertAdministrator(admistrator administrator){
	    	int id=0;
	        String sql = "INSERT INTO administrators (blood_bank_id, name, email, username, password) VALUES (?, ?, ?, ?, ?)";
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
				PreparedStatement pstmt = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
	    
	            pstmt.setString(1, administrator.getBank_id());
	            pstmt.setString(2, administrator.getName());
	            pstmt.setString(3, administrator.getEmail());
	            pstmt.setString(4, administrator.getUname());
	            pstmt.setString(5, administrator.getPass());
	            pstmt.executeUpdate();
	            
	            ResultSet generatedKeys = pstmt.getGeneratedKeys();
	            if (generatedKeys.next()) {
	                id = generatedKeys.getInt(1);
	                System.out.println("Generated ID: " + id);
	            }

	            pstmt.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return id;
	    }
}
