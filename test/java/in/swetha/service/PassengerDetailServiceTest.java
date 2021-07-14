package in.swetha.service;

import in.swetha.model.PassengerDetails;

public class PassengerDetailServiceTest {
	public static void main(String[] args) {

		PassengerDetails passengerDetails = new PassengerDetails(101, "swetha", "female", 9876543210L, "Swetha&123");
		System.out.println(passengerDetails.toString());
		try {
			PassengerDetailsService.passengerDetails(passengerDetails);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
