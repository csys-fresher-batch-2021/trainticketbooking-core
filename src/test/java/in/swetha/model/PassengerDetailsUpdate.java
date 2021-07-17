package in.swetha.model;

import in.swetha.service.PassengerDetailsService;
import in.swetha.util.Logger;

public class PassengerDetailsUpdate {
	static Logger logger = new Logger();

	public static void main(String[] args) throws Exception {
		try {
			boolean isUpdated = PassengerDetailsService.updatePassword(7654321098L, "sakil@123");
			if (isUpdated) {
				logger.debug("Changed Passenger password");
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());

		}
	}
}
