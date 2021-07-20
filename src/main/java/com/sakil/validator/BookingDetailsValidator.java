package com.sakil.validator;

import com.sakil.connection.Logger;

public class BookingDetailsValidator {
	static Logger logger = new Logger();

	public static boolean isBookingIdValid(Integer bookingId) {
		boolean valid = false;
		if (bookingId > 0) {
			logger.debug("Valid bookingid");
			valid = true;
		} else {
			logger.debug("Invalid bookingid");
		}
		return valid;
	}

	public static boolean isPassengerIdValid(Integer passengerId) {
		boolean valid = false;
		if (passengerId > 0) {
			logger.debug("Valid passengerid");
			valid = true;
		} else {
			logger.debug("Invalid passengerid");
		}
		return valid;
	}

	public static boolean isTrainIdValid(Integer trainId) {
		boolean valid = false;
		if (trainId > 0) {
			logger.debug("Valid trainid");
			valid = true;
		} else {
			logger.debug("Invalid trainid");
		}
		return valid;
	}

	public static boolean isPnrNoValid(Integer pnrNo) {
		boolean valid = false;
		if (pnrNo > 0) {
			logger.debug("Valid pnrno");
			valid = true;
		} else {
			logger.debug("Invalid pnrno");
		}
		return valid;
	}

	public static boolean isNoOfTicketValid(Integer noOfTickets) {
		boolean valid = false;
		if (noOfTickets > 0) {
			logger.debug("Valid noofticket");
			valid = true;
		} else {
			logger.debug("Invalid noofticket");
		}
		return valid;
	}

	public static boolean isPassengerNameValid(String passengerName) {
		boolean valid = false;
		String regex = "[a-zA-Z]+\\.?";
		if (passengerName.matches(regex) && passengerName.trim().length() > 2) {
			logger.debug("Valid passengername");
			valid = true;
		} else {
			logger.debug("Invalid passengername");
		}
		return valid;
	}

	public static boolean isTotalPriceValid(Float totalPrice) {
		boolean valid = false;
		if (totalPrice > 0) {
			logger.debug("Valid totalprice");
			valid = true;
		} else {
			logger.debug("Invalid totalprice");
		}
		return valid;
	}

	public static boolean isStatusValid(String status) {
		boolean valid = false;
		if (status.equalsIgnoreCase("booked") || status.equalsIgnoreCase("unbooked")) {
			logger.debug("Valid status");
			valid = true;
		} else {
			logger.debug("Invalid status");
		}
		return valid;
	}
}
