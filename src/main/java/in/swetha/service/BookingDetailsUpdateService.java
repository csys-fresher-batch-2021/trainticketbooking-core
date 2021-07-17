package in.swetha.service;

import in.swetha.dao.BookingDetailsDAO;

public class BookingDetailsUpdateService {

	public static boolean changeBookingStatus(int bookingId, String status) {
		boolean isUpdated = false;
		try {
			isUpdated = BookingDetailsDAO.updateBookingDetails(bookingId, status);
			if (isUpdated) {
				isUpdated = true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return isUpdated;
	}

}
