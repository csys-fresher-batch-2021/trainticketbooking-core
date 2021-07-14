package in.swetha.service;

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

	
	
}
