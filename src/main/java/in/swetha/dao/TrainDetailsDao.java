package in.swetha.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import in.swetha.model.TrainDetails;
import in.swetha.util.ConnectionUtil;

public class TrainDetailsDao {


	
		public static void insertDetails(TrainDetails trainDetails) throws Exception {
			Connection connection = null;
			PreparedStatement pst = null;
			try {
				connection = ConnectionUtil.getConnection();
				String sql = "insert into train_details(tr_id,train_number,train_name,train_source,train_destination,source_time,destination_time,station_one,station_two,station_three,fare,available_Days,available_seats) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
				pst = connection.prepareStatement(sql);
				pst.setInt(1, trainDetails.getTrainId());
				pst.setInt(2, trainDetails.getTrainNumber());
				pst.setString(3, trainDetails.getTrainName());
				pst.setString(4, trainDetails.getTrainSource());
				pst.setString(5, trainDetails.getTrainDestination());
				pst.setString(6, trainDetails.getSourceTime());
				pst.setString(7, trainDetails.getDestinationTime());
				pst.setString(8, trainDetails.getStationOne());
				pst.setString(9, trainDetails.getStationSecond());
				pst.setString(10, trainDetails.getStationThree());
				pst.setInt(11, trainDetails.getFare());
				pst.setString(12, trainDetails.getAvailableDays());
				pst.setInt(13, trainDetails.getAvailableSeats());
				pst.executeUpdate();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				throw new Exception("Unable to insert product");
			} finally {
				ConnectionUtil.close(connection, pst);
			}
		}

		public static void findAll() {

		}
	}


