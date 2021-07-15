package in.swetha.model;

import in.swetha.service.PassengerDetailsService;

public class PassengerDetailsTest {
	public static void main(String[] args) throws Exception {

		PassengerDetails passengerDetails = new PassengerDetails(1003, "sakil", "male", 7654321098L, "sakil&123");
	try {
		PassengerDetailsService.passengerDetails(passengerDetails);
	} catch (Exception e) {
		
		e.printStackTrace();
		throw new Exception(e.getMessage());
	}
	}

}
