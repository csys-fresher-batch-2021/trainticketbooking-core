package com.sakil.validator;

import java.util.List;
import com.sakil.connection.Logger;
import com.sakil.dao.BookingDetailsDAO;
import com.sakil.model.BookingDetails;

public class PassengerNameValidator {
	static Logger logger = new Logger();

	public static boolean checkPassengerName(String passengerName) throws Exception {
		boolean isValid = false;
		List<BookingDetails> booking = BookingDetailsDAO.getAllBookingDetails();
		for (BookingDetails bookingDetail : booking) {
			logger.debug(bookingDetail);
			if (bookingDetail.getPassengerName().equals(passengerName)) {
				isValid = true;
			}
		}
		return isValid;
	}

}
