package in.swetha.service;

import java.util.List;

import in.swetha.dao.TrainDetailsDao;
import in.swetha.model.TrainDetails;
import in.swetha.util.Logger;

public class TrainDetailsTest {

	public static void main(String[] args) throws Exception {
		Logger logger = new Logger();
		try {
			TrainDetails trainDetails = new TrainDetails(4, 28654, "VAIKAIEXPRESS", "trichy", "madurai", "10:00",
					"13:00", "srirangam", "ponmalai", "lalkudi", 240, "daily", 100);
			TrainDetailsService.trainDetails(trainDetails);
			List<TrainDetails> traindetails = TrainDetailsDao.getAllTrains();
			for (TrainDetails trainDetail : traindetails) {
				logger.debug(trainDetail);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

}
