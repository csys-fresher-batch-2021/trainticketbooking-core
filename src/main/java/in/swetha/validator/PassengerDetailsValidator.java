package in.swetha.validator;

import in.swetha.model.PassengerDetails;

public class PassengerDetailsValidator {

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

	public static boolean idValidator(Integer id) throws Exception {
		boolean isValid = false;
		if (id > 0) {
			isValid = true;
			System.out.println("Valid id");
		} else {
			//System.out.println("Invalid id");
			 throw new Exception("Invalid Id");
		}
		return isValid;
	}

	public static boolean nameValidator(String passengerName) {
		boolean isValid = false;
		// passengerName="swetha";
		// String regex = "[a-zA-Z]+\\.?";(passengerName.matches(regex)
		if (passengerName.trim().length() > 2) {
			isValid = true;
			System.out.println("Valid Name");
		} else {
			System.out.println("Invalid Name");

		}
		return isValid;

	}

	public static boolean genderValidator(String gender) {
		boolean isValid = false;
		if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("others")) {
			isValid = true;
			System.out.println("Valid Gender Details");
		} else {
			System.out.println("Invalid Gender Details");
		}

		return isValid;

	}

	public static boolean numberValidator(Long mobileNo) {
		boolean isValid = false;
		String number = String.valueOf(mobileNo);
		if (number.length() == 10) {
			isValid = true;
			System.out.println("Valid MobileNumber");
		} else {
			System.out.println("Invalid MobileNumber");
		}
		return isValid;
	}

	public static boolean passwordValidator(String passWord) {
		boolean isValid = false;
		if (passWord != null && passWord.trim().length() >= 8) {
			isValid = true;
			System.out.println("Valid PassWord");
		} else {
			System.out.println("Invalid PassWord");
		}
		return isValid;

	}

}
