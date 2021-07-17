package in.swetha.model;

import java.time.LocalDate;

import in.swetha.service.BookingDetailsService;

public class BookingDetailTest {

	public static void main(String[] args) {
		LocalDate jdate = LocalDate.parse("09-09-2021");
		LocalDate bdate = LocalDate.parse("09-11-2021");
		BookingDetails bookingDetails = new BookingDetails(1, 1, 1, 1, jdate, bdate, 4, "sakil", 1240f, "BOOKED");
		System.out.println(bookingDetails.toString());
		try {
			BookingDetailsService.bookingDetails(bookingDetails);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}
}
