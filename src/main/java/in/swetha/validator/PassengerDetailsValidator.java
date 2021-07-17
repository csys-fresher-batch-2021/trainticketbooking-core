package in.swetha.validator;

import in.swetha.model.PassengerDetails;
import in.swetha.util.Logger;

public class PassengerDetailsValidator {
	static Logger logger = new Logger();

	public static boolean validate(PassengerDetails passengerDetails) throws Exception {
		boolean passengerId = PassengerDetailsValidator.idValidator(passengerDetails.getPassengerId());
		boolean passengerName = PassengerDetailsValidator.nameValidator(passengerDetails.getPassangerName());
		boolean passengerGender = PassengerDetailsValidator.genderValidator(passengerDetails.getGender());
		boolean passengerMobileNo = PassengerDetailsValidator.numberValidator(passengerDetails.getMobileNumber());
		boolean passengerPassWord = PassengerDetailsValidator.passwordValidator(passengerDetails.getPassword());
		if (passengerId & passengerName && passengerGender && passengerMobileNo && passengerPassWord) {
			return true;
		} else {
			// return false;
			throw new Exception("Invalid Details");
		}
	}

	public static boolean idValidator(Integer id) {
		boolean isValid = false;
		if (id > 0) {
			isValid = true;
			logger.debug("Valid id");
		} else {
			logger.debug("Invalid Id");
		}
		return isValid;
	}

	public static boolean nameValidator(String passengerName) {
		boolean isValid = false;

		String regex = "[a-zA-Z]+\\.?";
		if ((passengerName.matches(regex) && passengerName.trim().length() > 2)) {
			isValid = true;
			logger.debug("Valid Name");
		} else {
			logger.debug("Invalid Name");

		}
		return isValid;

	}

	public static boolean genderValidator(String gender) {
		boolean isValid = false;
		if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("others")) {
			isValid = true;
			logger.debug("Valid Gender Details");
		} else {
			logger.debug("Invalid Gender Details");
		}

		return isValid;

	}

	public static boolean numberValidator(Long mobileNo) {
		boolean isValid = false;
		String number = String.valueOf(mobileNo);
		if (number.length() == 10) {
			isValid = true;
			logger.debug("Valid MobileNumber");
		} else {
			logger.debug("Invalid MobileNumber");
		}
		return isValid;
	}

	public static boolean passwordValidator(String passWord) {
		boolean isValid = false;
		if (passWord != null && passWord.trim().length() >= 8) {
			isValid = true;
			logger.debug("Valid PassWord");
		} else {
			logger.debug("Invalid PassWord");
		}
		return isValid;

	}

}
