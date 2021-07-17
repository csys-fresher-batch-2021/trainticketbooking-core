package in.swetha.model;

import in.swetha.service.PassengerDetailsService;

public class UserLoginTest {
	
	public static void main(String[] args)  {
		try {
			PassengerDetailsService.checkUser( "swetha", "swetha@123");
			System.out.println("Login Success");
			
		} catch (Exception e) {
			System.out.println("ERror:" + e.getMessage());
			e.printStackTrace();
			
			}
		
}
}

	
	

