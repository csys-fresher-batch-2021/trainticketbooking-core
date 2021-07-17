package in.swetha.service;

import in.swetha.model.PassengerDetails;
import in.swetha.util.Logger;

public class PassengerDetailServiceTest {
	static Logger logger = new Logger();

	public static void main(String[] args) {

		PassengerDetails passengerDetails = new PassengerDetails(101, "swetha", "female", 9876543210L, "Swetha&123");
		logger.debug(passengerDetails.toString());
		try {
			PassengerDetailsService.passengerDetails(passengerDetails);
		} catch (Exception e) {
			logger.debug(e.getMessage());
			e.printStackTrace();
		}
	}

}
