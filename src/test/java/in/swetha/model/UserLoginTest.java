package in.swetha.model;

import in.swetha.service.PassengerDetailsService;

public class UserLoginTest {
	
	public static void main(String[] args) throws Exception {
		try {
			PassengerDetailsService.checkUser( "swetha", "swetha@123");
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
			}
		
}
}

	
	

