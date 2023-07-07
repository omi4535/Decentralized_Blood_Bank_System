package com.blood_bank_system.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.sql.Statement;

import com.blood_bank_system.tables.blood_bank;

public class BloodBankDAO {

	private String jdbcURL = "jdbc:mysql://localhost:3306/blood_bank";
	private String jdbcUsername = "root";
	private String jdbcPassword = "12345";

//    INSERT INTO BloodBank (bloodbank_id, name, address, region, contact_number, email, operational_hours, special_services, contact_person_name, contact_person_designation, contact_person_phone, contact_person_email, certification_details, accreditation_details, storage_capacity, blood_components_handled, testing_facilities, transfusion_services, other_activities, additional_information) VALUES (1, 'ABC Blood Bank', '123 Main Street, City', 'Region A', '1234567890', 'abc@example.com', '9 AM - 5 PM', 'Emergency services', 'John Doe', 'Manager', '9876543210', 'johndoe@example.com', 'Certification details', 'Accreditation details', 500, 'Whole blood, Packed red cells', 'Blood grouping, Cross-matching', 'Emergency services', 'Blood donation drives', 'Additional information');

	private static final String INSERT_BLOOD_BANK_SQL = "INSERT INTO blood_banks (name, address, region, contact_number, email, "
			+ "operational_hours, special_services, contact_person_name, contact_person_designation, contact_person_phone, "
			+ "contact_person_email, certification_details, accreditation_details, storage_capacity, blood_components_handled, "
			+ "testing_facilities, transfusion_services, other_activities, additional_information) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	public boolean addBloodBank(blood_bank bloodBank) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (

				Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BLOOD_BANK_SQL)) {

			preparedStatement.setString(1, bloodBank.getName());
			preparedStatement.setString(2, bloodBank.getAddress());
			preparedStatement.setString(3, bloodBank.getRegion());
			preparedStatement.setString(4, bloodBank.getContactNumber());
			preparedStatement.setString(5, bloodBank.getEmail());
			preparedStatement.setString(6, bloodBank.getOperationalHours());
			preparedStatement.setString(7, bloodBank.getSpecialServices());
			preparedStatement.setString(8, bloodBank.getContactPersonName());
			preparedStatement.setString(9, bloodBank.getContactPersonDesignation());
			preparedStatement.setString(10, bloodBank.getContactPersonPhone());
			preparedStatement.setString(11, bloodBank.getContactPersonEmail());
			preparedStatement.setString(12, bloodBank.getCertificationDetails());
			preparedStatement.setString(13, bloodBank.getAccreditationDetails());
			preparedStatement.setInt(14, bloodBank.getStorageCapacity());
			preparedStatement.setString(15, bloodBank.getBloodComponentsHandled());
			preparedStatement.setString(16, bloodBank.getTestingFacilities());
			preparedStatement.setString(17, bloodBank.getTransfusionServices());
			preparedStatement.setString(18, bloodBank.getOtherActivities());
			preparedStatement.setString(19, bloodBank.getAdditionalInformation());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<blood_bank> getAllBloodBanks() throws ClassNotFoundException {
		List<blood_bank> bloodBanks = new ArrayList<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (

				Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM blood_banks")) {

			while (resultSet.next()) {
				int id = Integer.parseInt(resultSet.getString("id"));
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				String region = resultSet.getString("region");
				String contactNumber = resultSet.getString("contact_number");
				String email = resultSet.getString("email");

				blood_bank bloodBank = new blood_bank(id,name, address, region, contactNumber, email);
				bloodBanks.add(bloodBank);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return bloodBanks;
	}

	public List<blood_bank> searchforname(String key) throws ClassNotFoundException {
		List<blood_bank> bloodBanks = new ArrayList<>();
		String q1 = "SELECT * FROM blood_banks WHERE name LIKE '%"+key+"%'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
				Statement preparedStatement = connection.createStatement()) {

			
			ResultSet resultSet = preparedStatement.executeQuery(q1);

			while (resultSet.next()) {
				int id = Integer.parseInt(resultSet.getString("id"));
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				String region = resultSet.getString("region");
				String contactNumber = resultSet.getString("contact_number");
				String email = resultSet.getString("email");

				blood_bank bloodBank = new blood_bank(id,name, address, region, contactNumber, email);
				bloodBanks.add(bloodBank);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return bloodBanks;

	}
	
	
	
	public List<blood_bank> searchforregion(String key) throws ClassNotFoundException {
		List<blood_bank> bloodBanks = new ArrayList<>();
		String q1 = "SELECT * FROM blood_banks WHERE region LIKE '%"+key+"%' OR address LIKE '%"+key+"%'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
				Statement preparedStatement = connection.createStatement()) {

			
			ResultSet resultSet = preparedStatement.executeQuery(q1);

			while (resultSet.next()) {
				int id = Integer.parseInt(resultSet.getString("id"));
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				String region = resultSet.getString("region");
				String contactNumber = resultSet.getString("contact_number");
				String email = resultSet.getString("email");

				blood_bank bloodBank = new blood_bank(id,name, address, region, contactNumber, email);
				bloodBanks.add(bloodBank);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return bloodBanks;

	}
	
	public List<blood_bank> searchforaddress(String key) throws ClassNotFoundException {
		List<blood_bank> bloodBanks = new ArrayList<>();
		String q1 = "SELECT * FROM blood_banks WHERE address LIKE '%"+key+"%'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
				Statement preparedStatement = connection.createStatement()) {

			
			ResultSet resultSet = preparedStatement.executeQuery(q1);

			while (resultSet.next()) {
				int id = Integer.parseInt(resultSet.getString("id"));
				
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				String region = resultSet.getString("region");
				String contactNumber = resultSet.getString("contact_number");
				String email = resultSet.getString("email");

				blood_bank bloodBank = new blood_bank(id,name, address, region, contactNumber, email);
				bloodBanks.add(bloodBank);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return bloodBanks;

	}





    public blood_bank getBloodBankById(int id) throws ClassNotFoundException, SQLException {
        String query = "SELECT * FROM blood_banks WHERE id = ?";
        blood_bank bloodBank = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                bloodBank = new blood_bank();
                bloodBank.setId(resultSet.getInt("id"));
                bloodBank.setName(resultSet.getString("name"));
                bloodBank.setAddress(resultSet.getString("address"));
                bloodBank.setRegion(resultSet.getString("region"));
                bloodBank.setContactNumber(resultSet.getString("contact_number"));
                bloodBank.setEmail(resultSet.getString("email"));
                bloodBank.setOperationalHours(resultSet.getString("operational_hours"));
                bloodBank.setSpecialServices(resultSet.getString("special_services"));
                bloodBank.setContactPersonName(resultSet.getString("contact_person_name"));
                bloodBank.setContactPersonDesignation(resultSet.getString("contact_person_designation"));
                bloodBank.setContactPersonPhone(resultSet.getString("contact_person_phone"));
                bloodBank.setContactPersonEmail(resultSet.getString("contact_person_email"));
                bloodBank.setCertificationDetails(resultSet.getString("certification_details"));
                bloodBank.setAccreditationDetails(resultSet.getString("accreditation_details"));
                bloodBank.setStorageCapacity(resultSet.getInt("storage_capacity"));
                bloodBank.setBloodComponentsHandled(resultSet.getString("blood_components_handled"));
                bloodBank.setTestingFacilities(resultSet.getString("testing_facilities"));
                bloodBank.setTransfusionServices(resultSet.getString("transfusion_services"));
                bloodBank.setOtherActivities(resultSet.getString("other_activities"));
                bloodBank.setAdditionalInformation(resultSet.getString("additional_information"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return bloodBank;
    }
}

