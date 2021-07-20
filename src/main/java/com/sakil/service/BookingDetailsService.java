package com.sakil.service;

import com.sakil.connection.Logger;
import com.sakil.dao.BookingDetailsDAO;
import com.sakil.model.BookingDetails;
import com.sakil.validator.BookingDetailsValidator;

public class BookingDetailsService {
	static Logger logger = new Logger();

	public static void bookingDetails(BookingDetails bookingDetails) throws Exception {
		boolean bookingId = BookingDetailsValidator.isBookingIdValid(bookingDetails.getBookingId());
		boolean passengerId = BookingDetailsValidator.isPassengerIdValid(bookingDetails.getPassengerId());
		boolean trainId = BookingDetailsValidator.isTrainIdValid(bookingDetails.getTrainId());
		boolean pnrNo = BookingDetailsValidator.isPnrNoValid(bookingDetails.getPnrNo());
		boolean trainDestination = BookingDetailsValidator.isNoOfTicketValid(bookingDetails.getNoOfTickets());
		boolean passengerName = BookingDetailsValidator.isPassengerNameValid(bookingDetails.getPassengerName());
		boolean totalPrice = BookingDetailsValidator.isTotalPriceValid(bookingDetails.getTotalPrice());
		boolean status = BookingDetailsValidator.isStatusValid(bookingDetails.getStatus());
		if (bookingId && passengerId && trainId && pnrNo && trainDestination && trainDestination && passengerName
				&& totalPrice && status) {
			BookingDetailsDAO.save(bookingDetails);
		} else {
			logger.debug("Details not correctly");
		}
	}

}
