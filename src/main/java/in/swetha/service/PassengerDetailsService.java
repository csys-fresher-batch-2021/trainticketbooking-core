package in.swetha.service;

import java.util.List;
import in.swetha.dao.PassengerDetailsDAO;
import in.swetha.model.PassengerDetails;
import in.swetha.validator.PassengerDetailsValidator;

public class PassengerDetailsService {
	public static void passengerDetails(PassengerDetails passengerDetails) throws Exception {
		
		boolean isValid = PassengerDetailsValidator.validate(passengerDetails);
		if(isValid)
		{
			PassengerDetailsDAO.save(passengerDetails);
		}
		else {
			System.out.println("Invalid Details");
			
		}
		
	}
	
	public static void checkUser(String passengerName, String passengerPassword) throws Exception {
		boolean isValidUser = false;
		List<PassengerDetails> passengerDetail = PassengerDetailsDAO.getPassengerDetails();
		for (PassengerDetails passengerDetails : passengerDetail) {
			if (passengerDetails.getPassangerName().equals(passengerName) && passengerDetails.getPassword().equals(passengerPassword))
			{
				System.out.println("Login Sucess");
				isValidUser = true;
				break;
			}
		}
		if (!isValidUser ) {
			throw new Exception("Name or PassWord Is Wrong");
		}
	}
	
}

	
	

