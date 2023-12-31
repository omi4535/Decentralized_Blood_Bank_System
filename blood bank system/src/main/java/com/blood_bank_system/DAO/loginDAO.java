package com.blood_bank_system.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.blood_bank_system.tables.admistrator;

public class loginDAO {

	private String jdbcURL = "jdbc:mysql://localhost:3306/blood_bank";
	private String jdbcUsername = "root";
	private String jdbcPassword = "12345";

	public admistrator validateLogin(String username, String password) throws ClassNotFoundException, SQLException {
		admistrator admin = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

		try {
			String query = "SELECT * FROM administrators WHERE username = ? AND password = ?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				Integer adminId = rs.getInt("id");
				String aid = adminId.toString();
				Integer bloodBankId = rs.getInt("blood_bank_id");
				String bid = bloodBankId.toString();
				String name = rs.getString("name");
				String email = rs.getString("email");

				// Create Admin object
				admin = new admistrator(aid, bid, name, email, username, password);
				connection.close();
				stmt.close();
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}

		return admin;
	}
}
