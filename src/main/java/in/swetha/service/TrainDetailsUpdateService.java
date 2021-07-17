package in.swetha.service;

import in.swetha.dao.TrainDetailsDao;
import in.swetha.util.Logger;

public class TrainDetailsUpdateService {
	private TrainDetailsUpdateService() {

	}

	public static void updateTrains(int trainId, String availableDays) throws Exception {
		Logger logger = new Logger();
		boolean isValidTrains = false;
		isValidTrains = TrainDetailsDao.updateTrainDetails(trainId, availableDays);
		if (isValidTrains) {
			logger.debug("Updated");
		} else {
			logger.debug("Not updated");
		}
	}
}
