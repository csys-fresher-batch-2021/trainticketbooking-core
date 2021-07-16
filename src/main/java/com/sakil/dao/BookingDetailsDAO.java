package com.sakil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

import com.sakil.connection.ConnectionUtil;
import com.sakil.model.BookingDetails;

public class BookingDetailsDAO {

	public static void save(BookingDetails bookingDetails) throws Exception {
/*		create table booking_details(
				booking_id  number,
				passenger_id int NOT NULL,
				train_id int NOT NULL,
				pnr_no int NOT NULL,
				journey_date date NOT NULL,
				booking_date timestamp NOT NULL,
				no_of_tickets int NOT NULL,
				passenger_name varchar2(50),
				total_price int NOT NULL,
				status varchar2(20),
				UNIQUE(pnr_no),
				CONSTRAINT train_id_fk FOREIGN KEY (train_id)REFERENCES train_details (train_id),
				CONSTRAINT passenger_id_fk FOREIGN KEY (passe
	
*/			Connection connection = null;
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
				pst.setFloat(9,bookingDetails.getTotalPrice());
				pst.setString(10,bookingDetails.getStatus());

				pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Unable to insert pdetails");
			} finally {
				ConnectionUtil.close(connection, pst);
			}
		}
	}

