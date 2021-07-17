package in.swetha.service;

import java.util.List;

import in.swetha.dao.TrainDetailsDao;
import in.swetha.model.TrainDetails;
import in.swetha.util.Logger;

public class TrainDetailsListTest {
	static Logger logger = new Logger();

	public static void main(String[] args) throws Exception {
		List<TrainDetails> traindetails = TrainDetailsDao.getAllTrains();
		for (TrainDetails trainDetail : traindetails) {
			logger.debug(trainDetail);
		}
	}
}
