package in.swetha.service;

import java.util.List;

import in.swetha.dao.TrainDetailsDao;
import in.swetha.model.TrainDetails;
import in.swetha.util.Logger;

public class TrainDetailsUpdateServiceTest {
		private TrainDetailsUpdateServiceTest() {

		}

		static Logger logger=new Logger();
		public static void main(String arg[]) throws Exception {
			int trainId = 1;
			String availableDays = "MONDAY";
			TrainDetailsUpdateService.updateTrains(trainId, availableDays);
			List<TrainDetails> traindetails = TrainDetailsDao.getAllTrains();
			for (TrainDetails trainDetail : traindetails) {
				logger.debug(trainDetail);
			}
			
	}
	}
