package in.swetha.model;

import java.time.LocalDate;

public class BookingDetailTest {

		public static void main(String[] args) {
				LocalDate jdate = LocalDate.parse("09-09-2021");
				BookingDetails bookingDetails= new BookingDetails(1,1,1,1,"2021-07-12","2021-07-10",4,"sakil"
						,1240f,"BOOKED");
				System.out.println(bookingDetails.toString());
				BookingDetailsService.bookingDetails(bookingDetails);
				//BookingDetailsService.BookingDetails(bookingDetails);
			}
	}




