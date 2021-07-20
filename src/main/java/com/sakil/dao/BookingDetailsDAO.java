package com.sakil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.sakil.connection.ConnectionUtil;
import com.sakil.model.BookingDetails;

public class BookingDetailsDAO {

	public static List<BookingDetails> getAllBookingDetails() throws Exception {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet result = null;
		List<BookingDetails> bookingDetails = new ArrayList<>();
		try {

			connection = ConnectionUtil.getConnection();
			String sql = "select * from booking_details";
			pst = connection.prepareStatement(sql);
			result = pst.executeQuery();
			while (result.next()) {
				BookingDetails bookingDetail = new BookingDetails();
				int bookingId = result.getInt("booking_id");
				int passengerId = result.getInt("passenger_id");
				int trainId = result.getInt("train_id");
				int pnrNo = result.getInt("pnr_no");
				String trainName = result.getString("train_name");
				String trainFrom = result.getString("train_from");
				String trainTo = result.getString("train_to");
				Date jDate = result.getDate("journey_date");
				LocalDate journeyDate = ((java.sql.Date) jDate).toLocalDate();
				Date bDate = result.getDate("booking_date");
				LocalDate bookingDate = ((java.sql.Date) bDate).toLocalDate();
				int noOfTicket = result.getInt("no_of_tickets");
				String passengerName = result.getString("passenger_name");
				float totalPrice = result.getInt("total_price");
				String status = result.getString("status");
				bookingDetail.setBookingId(bookingId);
				bookingDetail.setPassengerId(passengerId);
				bookingDetail.setTrainId(trainId);
				bookingDetail.setPnrNo(pnrNo);
				bookingDetail.setTrainName(trainName);
				bookingDetail.setTrainFrom(trainFrom);
				bookingDetail.setTrainTo(trainTo);
				bookingDetail.setJourneyLocalDate(journeyDate);
				bookingDetail.setBookingLocalDate(bookingDate);
				bookingDetail.setNoOfTickets(noOfTicket);
				bookingDetail.setPassengerName(passengerName);
				bookingDetail.setTotalPrice(totalPrice);
				bookingDetail.setStatus(status);
				bookingDetails.add(bookingDetail);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new Exception("Unable to Show List");
		} finally {
			ConnectionUtil.close(connection, pst);
		}
		return bookingDetails;

	}

	public static void save(BookingDetails bookingDetails) throws Exception {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into booking_details(booking_id,passenger_id,train_id,pnr_no,train_name,train_from,train_to,journey_date,booking_date,no_of_tickets,passenger_name,total_price,status)values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			Date journeyDate = java.sql.Date.valueOf(bookingDetails.getJourneyLocalDate());
			Date bookingDate = java.sql.Date.valueOf(bookingDetails.getBookingLocalDate());
			pst = connection.prepareStatement(sql);
			pst.setInt(1, bookingDetails.getBookingId());
			pst.setInt(2, bookingDetails.getPassengerId());
			pst.setInt(3, bookingDetails.getTrainId());
			pst.setInt(4, bookingDetails.getPnrNo());
			pst.setString(5, bookingDetails.getTrainName());
			pst.setString(6, bookingDetails.getTrainFrom());
			pst.setString(7, bookingDetails.getTrainTo());
			pst.setDate(8, (java.sql.Date) journeyDate);
			pst.setDate(9, (java.sql.Date) bookingDate);
			pst.setInt(10, bookingDetails.getNoOfTickets());
			pst.setString(11, bookingDetails.getPassengerName());
			pst.setFloat(12, bookingDetails.getTotalPrice());
			pst.setString(13, bookingDetails.getStatus());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Unable to insert details");
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

	public static List<BookingDetails> findStatus(String passengerName) throws Exception {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet result = null;
		List<BookingDetails> findBooking = new ArrayList<>();
		try {

			connection = ConnectionUtil.getConnection();
			String sql = "select status FROM booking_details WHERE passenger_name=?";
			pst = connection.prepareStatement(sql);
			pst.setString(1, passengerName);
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
