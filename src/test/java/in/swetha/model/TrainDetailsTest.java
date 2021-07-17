package in.swetha.model;

import in.swetha.util.Logger;

public class TrainDetailsTest {

	public static void main(String Arg[]) throws Exception {
		Logger logger = new Logger();
		TrainDetails trainDetails = new TrainDetails(4, 28654, "VAIKAIEXPRESS", "trichy", "madurai", "10:00", "13:00",
				"srirangam", "ponmalai", "lalkudi", 240, "daily", 100);
		logger.debug(trainDetails);
	}
}
