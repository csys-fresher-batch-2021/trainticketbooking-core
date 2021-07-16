package com.sakil.model;

import java.time.LocalDate;

import com.sakil.service.BookingDetailsService;

public class BookingDetailTest {
		public static void main(String[] args) throws Exception {
			LocalDate jdate = LocalDate.parse("2021-09-09");		
//			Date journeydate=Date.valueOf(jdate);
			LocalDate bdate = LocalDate.parse("2021-09-11");
//			Date bookdate=Date.valueOf(bdate);

			BookingDetails bookingDetails= new BookingDetails(122,1002,1,5863,jdate,bdate,4,"sakil",1240f,"BOOKED");
			System.out.println(bookingDetails.toString());
			BookingDetailsService.bookingDetails(bookingDetails);
			//BookingDetailsService.BookingDetails(bookingDetails);
		}
}


		