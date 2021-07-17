package in.swetha.service;

import java.util.List;
import in.swetha.dao.PassengerDetailsDAO;
import in.swetha.model.PassengerDetails;
import in.swetha.util.Logger;
import in.swetha.validator.PassengerDetailsValidator;

public class PassengerDetailsService {
	static Logger logger = new Logger();

	public static void passengerDetails(PassengerDetails passengerDetails) throws Exception {

		boolean isValid = PassengerDetailsValidator.validate(passengerDetails);
		if (isValid) {
			PassengerDetailsDAO.save(passengerDetails);
		} else {
			logger.debug("Invalid Details");

		}

	}

	public static void checkUser(String passengerName, String passengerPassword) throws Exception {
		boolean isValidUser = false;
		List<PassengerDetails> passengerDetail = PassengerDetailsDAO.getPassengerDetails();
		for (PassengerDetails passengerDetails : passengerDetail) {
			if (passengerDetails.getPassangerName().equals(passengerName)
					&& passengerDetails.getPassword().equals(passengerPassword)) {
				logger.debug("Login Sucess");
				isValidUser = true;
				break;
			}
		}
		if (!isValidUser) {
			throw new Exception("Name or PassWord Is Wrong");
		}
	}

	public static boolean updatePassword(Long mobileNo, String passWord) throws Exception {
		boolean isValid = false;

		if (PassengerDetailsValidator.numberValidator(mobileNo)
				&& PassengerDetailsValidator.passwordValidator(passWord)) {
			PassengerDetailsDAO.updatePassengerDetails(mobileNo, passWord);
			isValid = true;
		}
		return isValid;
	}
}
