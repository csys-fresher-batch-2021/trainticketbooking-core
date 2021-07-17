package in.swetha.service;

import java.util.List;

import in.swetha.dao.TrainDetailsDao;
import in.swetha.model.TrainDetails;
import in.swetha.util.Logger;

public class TrainDetailsDeleteTest {

	public static void main(String Arg[]) throws Exception {
		Logger logger = new Logger();
		int trainId = 4;
		String trainName = "VAIKAIEXPRESS";
		TrainDetailsDeleteService.deleteTrain(trainId, trainName);
		List<TrainDetails> traindetails = TrainDetailsDao.getAllTrains();
		for (TrainDetails trainDetail : traindetails) {
			logger.debug(trainDetail);
		}
	}
}
