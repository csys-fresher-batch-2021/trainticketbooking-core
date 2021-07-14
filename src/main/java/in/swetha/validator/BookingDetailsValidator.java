package in.swetha.validator;

public class BookingDetailsValidator {

		public static boolean isBookingIdValid(Integer bookingId) {
				boolean valid = false;
				if (bookingId>0) {
					System.out.println("Valid bookingid");
					valid = true;
				} else {
					System.out.println("Invalid bookingid");
				}
				return valid;
			
		}

		public static boolean isPassengerIdValid(Integer passengerId) {
			boolean valid = false;
			if (passengerId>0) {
				System.out.println("Valid passengerid");
				valid = true;
			} else {
				System.out.println("Invalid passengerid");
			}
			return valid;
		}

		public static boolean isTrainIdValid(Integer trainId) {
			boolean valid = false;
			if (trainId>0) {
				System.out.println("Valid trainid");
				valid = true;
			} else {
				System.out.println("Invalid trainid");
			}
			return valid;
		}

		public static boolean isPnrNoValid(Integer pnrNo) {
			boolean valid = false;
			if (pnrNo>0) {
				System.out.println("Valid pnrno");
				valid = true;
			} else {
				System.out.println("Invalid pnrno");
			}
			return valid;
		}

		public static boolean isNoOfTicketValid(Integer noOfTickets) {
			boolean valid = false;
			if (noOfTickets>0) {
				System.out.println("Valid noofticket");
				valid = true;
			} else {
				System.out.println("Invalid noofticket");
			}
			return valid;
		}

		public static boolean isPassengerNameValid(String passengerName) {
			boolean valid = false;
			String regex = "[a-zA-Z]+\\.?";
			if (passengerName.matches(regex)) {
				System.out.println("Valid passengername");
				valid = true;
			} else {
				System.out.println("Invalid passengername");
			}
			return valid;
		}

		public static boolean isTotalPriceValid(Float totalPrice) {
			boolean valid = false;
			if (totalPrice>0) {
				System.out.println("Valid totalprice");
				valid = true;
			} else {
				System.out.println("Invalid totalprice");
			}
			return valid;
		}

		public static boolean isStatusValid(String status) {
			boolean valid = false;
			if (status.equalsIgnoreCase("booked") || status.equalsIgnoreCase("unbooked")) {
				System.out.println("Valid status");
				valid = true;
			} else {
				System.out.println("Invalid status");
			}
			return valid;
		}
	}


