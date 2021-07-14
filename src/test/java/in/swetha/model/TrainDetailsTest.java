package in.swetha.model;

import in.swetha.service.TrainDetailsService;

public class TrainDetailsTest {

		public static void main(String Arg[]) throws Exception {
		try {
			TrainDetails trainDetails= new TrainDetails(7,28657,"MumbaiExpress","trichy","madurai","10:00","13:00","srirangam","ponmalai","lalkudi",240,"daily",100);
			TrainDetailsService.trainDetails(trainDetails);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
		}
	}

