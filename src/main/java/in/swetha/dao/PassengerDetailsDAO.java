package in.swetha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import in.swetha.model.PassengerDetails;
import in.swetha.util.ConnectionUtil;

public class PassengerDetailsDAO {
	Map<String, String> userDetails = new HashMap<>();

	public static void save(PassengerDetails passengerDetails) throws Exception {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into passenger_details(passenger_id,passenger_name,gender,mobile_number,passenger_password)values(?,?,?,?,?)";
			pst = connection.prepareStatement(sql);
			pst.setInt(1, passengerDetails.getPassengerId());
			pst.setString(2, passengerDetails.getPassangerName());
			pst.setString(3, passengerDetails.getGender());
			pst.setLong(4, passengerDetails.getMobileNumber());
			pst.setString(5, passengerDetails.getPassword());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Unable to insert passengerdetails");
		} finally {
			ConnectionUtil.close(connection, pst);
		}
	}

	public static List<PassengerDetails> getPassengerDetails() throws Exception {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet result = null;
		List<PassengerDetails> passengerDetails = new ArrayList<>();
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from passenger_details";
			pst = connection.prepareStatement(sql);
			result = pst.executeQuery();
			while (result.next()) {
				PassengerDetails passengerDetail = new PassengerDetails();
				Integer passId = result.getInt("passenger_id");
				String name = result.getString("passenger_name");
				String gender = result.getString("gender");
				Long mobilenumber = result.getLong("mobile_number");
				String password = result.getString("passenger_password");
				passengerDetail.setPassengerId(passId);
				passengerDetail.setPassangerName(name);
				passengerDetail.setGender(gender);
				passengerDetail.setMobileNumber(mobilenumber);
				passengerDetail.setPassword(password);
				passengerDetails.add(passengerDetail);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new Exception("Unable to fetch User");
		} finally {
			ConnectionUtil.close(connection, pst);
		}
		return passengerDetails;
			}
	
	
}