package in.swetha.model;

import java.util.List;

import in.swetha.dao.PassengerDetailsDAO;
import in.swetha.service.PassengerDetailsService;
import in.swetha.util.Logger;

public class PassengerDetailsTest {
	Logger logger = new Logger();

	public static void main(String[] args) throws Exception {

		PassengerDetails passengerDetails = new PassengerDetails(1003, "sakil", "male", 7654321098L, "sakil&123");
		try {
			PassengerDetailsService.passengerDetails(passengerDetails);
			List<PassengerDetails> passengerDetail = PassengerDetailsDAO.getPassengerDetails();
			for (PassengerDetails detail : passengerDetail) {
				Logger.debug(detail);
			}
		} catch (Exception e) {

			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

}
