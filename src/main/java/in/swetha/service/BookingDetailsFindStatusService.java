package in.swetha.service;

import java.util.List;

import in.swetha.dao.BookingDetailsDAO;
import in.swetha.model.BookingDetails;

public class BookingDetailsFindStatusService {

		public static void main(String[] arg) throws Exception {
		int bookingId=143;
		List<BookingDetails> findStations =BookingDetailsDAO.findStatus(bookingId);
		System.out.println(findStations);
		}
	}
