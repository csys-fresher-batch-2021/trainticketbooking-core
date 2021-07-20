package com.sakil.service;

import java.util.List;

import com.sakil.connection.Logger;
import com.sakil.dao.BookingDetailsDAO;
import com.sakil.model.BookingDetails;
import com.sakil.validator.PassengerNameValidator;

public class BookingDetailsFindStatusService {
	static Logger logger = new Logger();

	public static void checkStatus(String passengerName) throws Exception {
		boolean checkPassengerName = PassengerNameValidator.checkPassengerName(passengerName);
		if (checkPassengerName) {
			List<BookingDetails> findStatus = BookingDetailsDAO.findStatus(passengerName);
			logger.debug(findStatus);
		} else {
			logger.debug("Invalid passenger name");
		}

	}
}
