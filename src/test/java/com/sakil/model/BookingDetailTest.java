package com.sakil.model;

import java.time.LocalDate;
import com.sakil.connection.Logger;
import com.sakil.service.BookingDetailsService;

public class BookingDetailTest {
	static Logger logger = new Logger();

	public static void main(String[] args) throws Exception {
		LocalDate jdate = LocalDate.parse("2021-09-09");
		LocalDate bdate = LocalDate.parse("2021-09-11");
		BookingDetails bookingDetails = new BookingDetails(125, 1003, 1, 5869, "VAIGAIEXPRESS", "MADHURAI", "CHENNAI",
				jdate, bdate, 4, "mohamed", 1240f, "BOOKED");
		BookingDetailsService.bookingDetails(bookingDetails);
		logger.debug(bookingDetails.toString());
	}
}
