package in.swetha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.swetha.exception.DBException;
import in.swetha.model.TrainDetails;
import in.swetha.util.ConnectionUtil;

public class TrainDetailsDao {
	private TrainDetailsDao() {

	}

	public static void insertDetails(TrainDetails trainDetails) throws DBException {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into train_details(train_id,train_number,train_name,train_source,train_destination,source_time,destination_time,station_one,station_two,station_three,fare,available_Days,available_seats) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Unable to insert trains");
		} finally {
			ConnectionUtil.close(connection, pst);
		}
	}

	public static List<TrainDetails> getAllTrains() throws DBException {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet result = null;
		List<TrainDetails> trainDetails = new ArrayList<>();
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from train_details";
			pst = connection.prepareStatement(sql);
			result = pst.executeQuery();
			while (result.next()) {
				TrainDetails trainDetail = new TrainDetails();
				int trainId = result.getInt("train_id");
				int trainNumber = result.getInt("train_number");
				String trainName = result.getString("train_name");
				String trainSource = result.getString("train_source");
				String trainDestination = result.getString("train_destination");
				String sourceTime = result.getString("source_time");
				String destinationTime = result.getString("destination_time");
				String stationOne = result.getString("station_one");
				String stationSecond = result.getString("station_two");
				String stationThree = result.getString("station_three");
				int fare = result.getInt("fare");
				String availableDays = result.getString("available_Days");
				int availableSeats = result.getInt("available_seats");
				trainDetail.setTrainId(trainId);
				trainDetail.setTrainNumber(trainNumber);
				trainDetail.setTrainName(trainName);
				trainDetail.setTrainId(trainId);
				trainDetail.setTrainSource(trainSource);
				trainDetail.setTrainDestination(trainDestination);
				trainDetail.setSourceTime(sourceTime);
				trainDetail.setDestinationTime(destinationTime);
				trainDetail.setStationOne(stationOne);
				trainDetail.setStationSecond(stationSecond);
				trainDetail.setStationThree(stationThree);
				trainDetail.setFare(fare);
				trainDetail.setAvailableDays(availableDays);
				trainDetail.setAvailableSeats(availableSeats);
				trainDetails.add(trainDetail);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Unable to Show List");
		} finally {
			ConnectionUtil.close(connection, pst);
		}
		return trainDetails;
	}

	public static void deleteTrainDetails(int trainId, String trainName) throws DBException {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "DELETE FROM train_details WHERE train_id= ? and train_Name= ? ";
			pst = connection.prepareStatement(sql);
			pst.setInt(1, trainId);
			pst.setString(2, trainName);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Unable to delete trains");
		} finally {
			ConnectionUtil.close(connection, pst);
		}
	}

	public static boolean updateTrainDetails(int trainId, String availableDays) throws DBException {
		boolean isValid = false;
		Connection connection = null;
		PreparedStatement pst = null;
		String sql = "UPDATE train_details set available_Days =? where train_id=?";
		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setString(1, availableDays);
			pst.setInt(2, trainId);
			pst.executeUpdate();
			isValid = true;
		} catch (SQLException e) {
			throw new DBException("Can't update the train availabledays");
		} finally {
			ConnectionUtil.close(connection, pst);
		}
		return isValid;
	}

	public static List<TrainDetails> findStations(String trainSource, String trainDestination) throws DBException {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet result = null;
		List<TrainDetails> findStations = new ArrayList<>();
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select station_one, station_two,station_three FROM train_details WHERE train_source=? and train_destination=?";
			pst = connection.prepareStatement(sql);
			pst.setString(1, trainSource);
			pst.setString(2, trainDestination);
			result = pst.executeQuery();
			while (result.next()) {
				TrainDetails trainDetail = new TrainDetails();
				String stationOne = result.getString("station_one");
				String stationSecond = result.getString("station_two");
				String stationThree = result.getString("station_three");
				trainDetail.setStationOne(stationOne);
				trainDetail.setStationSecond(stationSecond);
				trainDetail.setStationThree(stationThree);
				findStations.add(trainDetail);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Unable to Show List");
		} finally {
			ConnectionUtil.close(connection, pst);
		}
		return findStations;
	}
}
