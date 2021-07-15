package in.swetha.service;

import in.swetha.dao.TrainDetailsDao;
import in.swetha.model.TrainDetails;

public class TrainDetailsDeleteService {


		public static void deleteTrain(int trianId, String trainName) throws Exception {
			System.out.println(trianId+trainName);
			TrainDetails searchProduct = null;
			for (TrainDetails trainDetails : TrainDetailsDao.getAllTrains()) {
				System.out.println(trainDetails);
				if (trainDetails.getTrainId().equals(trianId) && trainDetails.getTrainName().equals(trainName)) {
					TrainDetailsDao.deleteTrainDetails(trianId, trainName);
					searchProduct = trainDetails;
					break;
				}
			}
			if (searchProduct != null) {
				TrainDetailsDao.getAllTrains().remove(searchProduct);
			} else {
				throw new Exception("No trains matching");
			}
		}
	}

