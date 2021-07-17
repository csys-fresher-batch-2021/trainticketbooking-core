package in.swetha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import in.swetha.model.BookingDetails;
import in.swetha.util.ConnectionUtil;

public class BookingDetailsDAO {

		public static void save(BookingDetails bookingDetails) throws Exception {
			Connection connection = null;
			PreparedStatement pst = null;
			try {
				connection = ConnectionUtil.getConnection();
				String sql = "insert into booking_details(booking_id,passenger_id,train_id,pnr_no,journey_date,booking_date,no_of_tickets,passenger_name,total_price,status)values(?,?,?,?,?,?,?,?,?,?)";
				Date journeyDate = java.sql.Date.valueOf(bookingDetails.getJourneyLocalDate());
				Date bookingDate = java.sql.Date.valueOf(bookingDetails.getBookingLocalDate());
				pst = connection.prepareStatement(sql);
				pst.setInt(1, bookingDetails.getBookingId());
				pst.setInt(2, bookingDetails.getPassengerId());
				pst.setInt(3, bookingDetails.getTrainId());
				pst.setInt(4, bookingDetails.getPnrNo());
				pst.setDate(5, (java.sql.Date) journeyDate);
				pst.setDate(6, (java.sql.Date) bookingDate);
				pst.setInt(7, bookingDetails.getNoOfTickets());
				pst.setString(8, bookingDetails.getPassengerName());
				pst.setFloat(9, bookingDetails.getTotalPrice());
				pst.setString(10, bookingDetails.getStatus());
				pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Unable to insert Booking Details");
			} finally {
				ConnectionUtil.close(connection, pst);
			}
		}

		public static boolean updateBookingDetails(int bookingId, String status) throws Exception {
			boolean isValid = false;
			Connection connection = null;
			PreparedStatement pst = null;
			String sql = "UPDATE booking_details set status =? where booking_id=?";
			try {
				connection = ConnectionUtil.getConnection();
				pst = connection.prepareStatement(sql);
				pst.setString(1, status);
				pst.setInt(2, bookingId);
				pst.executeUpdate();
				isValid = true;
			} catch (SQLException e) {
				throw new Exception("Can't update the booking status");
			} finally {
				ConnectionUtil.close(connection, pst);
			}
			return isValid;
		}

		public static List<BookingDetails> findStatus(int bookingId) throws Exception {
			Connection connection = null;
			PreparedStatement pst = null;
			ResultSet result = null;
			List<BookingDetails> findBooking = new ArrayList<>();
			try {
				connection = ConnectionUtil.getConnection();
				String sql = "select status FROM booking_details WHERE booking_id=?";
				pst = connection.prepareStatement(sql);
				pst.setInt(1, bookingId);
				result = pst.executeQuery();
				while (result.next()) {
					BookingDetails bookingDetail = new BookingDetails();
					String findStatus = result.getString("status");
					bookingDetail.setStatus(findStatus);
					findBooking.add(bookingDetail);
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Unable to show status");
			} finally {
				ConnectionUtil.close(connection, pst);
			}
			return findBooking;
		}
	}


