package com.sakil.model;

import com.sakil.connection.Logger;
import com.sakil.service.BookingDetailsFindStatusService;

public class BookingDetailsFindStatus {
	static Logger logger = new Logger();

	public static void main(String[] args) throws Exception {
		try {
			BookingDetailsFindStatusService.checkStatus("swetha");
		} catch (Exception e) {
			logger.debug("error");
			e.printStackTrace();
		}
	}
}
