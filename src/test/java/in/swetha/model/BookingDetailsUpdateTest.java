package in.swetha.model;

import in.swetha.service.BookingDetailsUpdateService;

public class BookingDetailsUpdateTest {
	
		public static void main(String[] args) {
			try {
				boolean isUpdated = BookingDetailsUpdateService.changeBookingStatus(143, "CANCELLED");
				if(isUpdated)
				{
					System.out.println("Booking Status Updated");
				}
			} catch (Exception e) {
				System.out.println("Cannot See Booking Status");
				e.printStackTrace();
			}
			
	}
	}

