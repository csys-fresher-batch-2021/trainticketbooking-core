package com.sakil.model;

import java.util.List;
import com.sakil.connection.Logger;
import com.sakil.dao.BookingDetailsDAO;

public class BookingDetailsListTest {
	static Logger logger = new Logger();

	public static void main(String[] args) throws Exception {
		List<BookingDetails> traindetails = BookingDetailsDAO.getAllBookingDetails();
		for (BookingDetails trainDetail : traindetails) {
			logger.debug(trainDetail);
		}
	}

}
