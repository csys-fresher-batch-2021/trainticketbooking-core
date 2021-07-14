package in.swetha.model;

import in.swetha.service.PassengerDetailsService;

public class PassengerDetailsTest {
	public static void main(String[] args) {

		PassengerDetails passengerDetails = new PassengerDetails(101, "swetha", "female", 9876543210L, "Swetha&123");
		System.out.println(passengerDetails.toString());
//		PassengerDetailsService.passengerDetails(passengerDetails);
	}

}
