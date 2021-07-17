package in.swetha.service;

import java.util.List;

import in.swetha.dao.TrainDetailsDao;
import in.swetha.model.TrainDetails;

public class TrainDetailsFindStationService {
	private TrainDetailsFindStationService() {

	}

	public static List<TrainDetails> findStations(String trainFrom, String trainTo) throws Exception {
		return TrainDetailsDao.findStations(trainFrom, trainTo);

	}

}
