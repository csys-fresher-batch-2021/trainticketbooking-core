package com.sakil.model;

import com.sakil.connection.Logger;
import com.sakil.service.BookingDetailsUpdateService;

public class BookingDetailsUpdateTest {
	static Logger logger = new Logger();

	public static void main(String[] args) {
		try {
			boolean isUpdated = BookingDetailsUpdateService.changeBookingStatus(143, "CANCELLED");
			if (isUpdated) {
				logger.debug("Booking Status Updated");
			}
		} catch (Exception e) {
			logger.debug("Cannot See Booking Status");
			e.printStackTrace();
		}

	}
}
