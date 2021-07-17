package in.swetha.model;

import in.swetha.service.PassengerDetailsService;
import in.swetha.util.Logger;

public class UserLoginTest {
	static Logger logger=new Logger();
	public static void main(String[] args)  {
		try {
			PassengerDetailsService.checkUser( "swetha", "swetha@123");
			logger.debug("Login Success");
			
		} catch (Exception e) {
			logger.debug("Error:" + e.getMessage());
			e.printStackTrace();
			
			}
		
}
}

	
	

