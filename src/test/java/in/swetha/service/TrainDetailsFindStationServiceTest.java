package in.swetha.service;

import java.util.List;

import in.swetha.dao.TrainDetailsDao;
import in.swetha.model.TrainDetails;
import in.swetha.util.Logger;

public class TrainDetailsFindStationServiceTest {
	private TrainDetailsFindStationServiceTest() {

	}

	public static void main(String[] args) throws Exception {
		Logger logger = new Logger();
		String trainFrom = "TRICHY";
		String trainTo = "MADUARAI";
		TrainDetailsFindStationService.findStations(trainFrom, trainTo);
		logger.debug("Finded");
		List<TrainDetails> findStations = TrainDetailsDao.findStations(trainFrom, trainTo);
		logger.debug(findStations);

	}

}
