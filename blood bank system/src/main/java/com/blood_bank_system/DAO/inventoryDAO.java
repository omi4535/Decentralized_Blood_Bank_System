package com.blood_bank_system.DAO;

import java.sql.Connection;

import java.sql.Date;
import java.util.*;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.blood_bank_system.tables.inventory;

public class inventoryDAO {
	private static String jdbcURL = "jdbc:mysql://localhost:3306/blood_bank";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "12345";
	
	public int getInventoryID(int bloodBankID, int bloodGroupID) {
	    int inventoryID = 0;
	    try {
	    	
	    	Connection connection =getConnection();
	    	String sql = "SELECT inventory_id FROM blood_inventory WHERE blood_bank_id = ? AND blood_group_id = ?";
		     
			PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
					
	          statement.setInt(1, bloodBankID);
	        statement.setInt(2, bloodGroupID);
	        
	        // Execute the query
	        ResultSet resultSet = statement.executeQuery();
	        
	        // Check if a result is found and retrieve the inventory ID
	        if (resultSet.next()) {
	            inventoryID = resultSet.getInt("inventory_id");
	        }
	        
	        // Close the resources
	        resultSet.close();
	        statement.close();
	        connection.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return inventoryID;
	}
	
	
	
	public void updateBloodInventory(String inventoryID, String availableUnits, String lastUpdatedDate,String StorageLoc) {
	    try {
	    	
	    	Connection connection = getConnection();
	        // Prepare the SQL statement
	        String sql = "UPDATE blood_inventory SET available_units = ?, last_updated_date = ?, storage_location=? WHERE inventory_id = ?";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setString(1, availableUnits);
	        statement.setString(2, lastUpdatedDate);
	        statement.setString(3, StorageLoc);
	        statement.setString(4, inventoryID); 
	        
	        // Execute the update
	        int rowsAffected = statement.executeUpdate();
	        
	        // Check if the update was successful
	        if (rowsAffected > 0) {
	            System.out.println("Blood Inventory updated successfully.");
	        } else {
	            System.out.println("Failed to update Blood Inventory.");
	        }
	        
	        // Close the resources
	        statement.close();
	        connection.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	public String blood_group(String group_id) {
		
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String blood_group = null;
        try {
            conn = getConnection();
            String selectGroupIdQuery = "SELECT GroupName  FROM BloodGroup WHERE GroupID = ?";
            stmt = conn.prepareStatement(selectGroupIdQuery);
            stmt.setString(1, group_id);
            rs = stmt.executeQuery();
            if (rs.next()) {
            	blood_group = rs.getString("GroupName");}
            
        }catch(Exception e) {
        	System.out.print(e);
        	
        }
        return blood_group;
	}
	
    
    
    public boolean addInventory(inventory inventory) {
    	boolean suc=false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            // Retrieve the group ID from the blood group table based on the selected blood group
            String bloodGroup = inventory.getBloodGroup();
            String selectGroupIdQuery = "SELECT GroupID FROM BloodGroup WHERE GroupName = ?";
            stmt = conn.prepareStatement(selectGroupIdQuery);
            stmt.setString(1, bloodGroup);
            rs = stmt.executeQuery();

            String groupId = "1";
            if (rs.next()) {
                groupId = rs.getString("GroupID");}
//            }else {
//            	System.out.print("sadf");
//            	return false;
//            }

            // Insert the inventory details into the inventory table
            String insertQuery = "INSERT INTO blood_inventory (group_id, available_units, last_updated_date, storage_location ,bank_id,editor) VALUES (?, ?, ?,?, ?,?)";
            stmt = conn.prepareStatement(insertQuery);
            stmt.setString(1, groupId);
            stmt.setString(2, inventory.getAvailableUnits());
            stmt.setString(3, inventory.getLastUpdatedDate());
            stmt.setString(4, inventory.getStorageLocation());
            stmt.setString(5, inventory.getBloodBankId());
            stmt.setString(6, inventory.getEditor());

            stmt.executeUpdate();
            suc=true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
          
        }
        return suc;
    }

    
    public List<inventory> getAllInventoryEntries(String bloodBankId) {
        List<inventory> inventoryList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            String query = "select * from blood_inventory where bank_id = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, bloodBankId);

            rs = stmt.executeQuery();
            while (rs.next()) {
                String inventoryId = rs.getString("inventory_id");
                String groupId = rs.getString("group_id");
                String bankId = rs.getString("bank_id");
                String groupName = blood_group(groupId);
                String availableUnits = rs.getString("available_units");
                String lastUpdatedDate = rs.getString("last_updated_date");
                String storageLocation = rs.getString("storage_location");
                String editor = rs.getString("editor");
                inventory inventory = new inventory(inventoryId,bankId,groupId,groupName,availableUnits,lastUpdatedDate,storageLocation,editor);
                System.out.print("1 ");
                inventoryList.add(inventory);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return inventoryList;
    }

    
    public boolean deleteInventory(String inventoryId) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = getConnection();
            String query = "DELETE FROM blood_inventory WHERE inventory_id = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, inventoryId);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;  // Returns true if rows were affected (deletion successful), false otherwise
        } catch (SQLException e) {
            e.printStackTrace();
            return false;  // Exception occurred, return false
        } 
    }

    
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create the database connection
            conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    

}
