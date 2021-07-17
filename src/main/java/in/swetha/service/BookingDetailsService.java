package in.swetha.service;

import in.swetha.dao.BookingDetailsDAO;
import in.swetha.model.BookingDetails;
import in.swetha.validator.BookingDetailsValidator;

public class BookingDetailsService {

		public static void bookingDetails(BookingDetails bookingDetails) throws Exception {
			boolean bookingId = BookingDetailsValidator.isBookingIdValid(bookingDetails.getBookingId());
			boolean passengerId = BookingDetailsValidator.isPassengerIdValid(bookingDetails.getPassengerId());
			boolean trainId = BookingDetailsValidator.isTrainIdValid(bookingDetails.getTrainId());
			boolean pnrNo = BookingDetailsValidator.isPnrNoValid(bookingDetails.getPnrNo());
			boolean trainDestination = BookingDetailsValidator.isNoOfTicketValid(bookingDetails.getNoOfTickets());
			boolean passengerName = BookingDetailsValidator.isPassengerNameValid(bookingDetails.getPassengerName());
			boolean totalPrice = BookingDetailsValidator.isTotalPriceValid(bookingDetails.getTotalPrice());
			boolean status = BookingDetailsValidator.isStatusValid(bookingDetails.getStatus());
			if (bookingId && passengerId && trainId && pnrNo && trainDestination && trainDestination && passengerName
					&& totalPrice && status) {
				BookingDetailsDAO.save(bookingDetails);
			} else {
				System.out.println("Details not correctly");
			}
		}
	
}