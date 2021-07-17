package in.swetha.model;
import in.swetha.service.PassengerDetailsService;

public class PassengerDetailsUpdate {
	public static void main(String[] args) throws Exception {
		try {
			boolean isUpdated=PassengerDetailsService.updatePassword(7654321098L,"sakil@123");
			if(isUpdated)
			{
				System.out.println("Changed Passenger password");
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
			
		}
	}
}
