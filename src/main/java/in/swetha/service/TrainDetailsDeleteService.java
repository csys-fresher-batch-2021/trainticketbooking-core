package in.swetha.service;
import in.swetha.dao.TrainDetailsDao;
import in.swetha.exception.ServiceException;
import in.swetha.model.TrainDetails;

public class TrainDetailsDeleteService {
	private TrainDetailsDeleteService() {
		
	}
	public static void deleteTrain(int trianId, String trainName) throws Exception {
		TrainDetails searchProduct = null;
		for (TrainDetails trainDetails : TrainDetailsDao.getAllTrains()) {
			if (trainDetails.getTrainId().equals(trianId) && trainDetails.getTrainName().equals(trainName)) {
				TrainDetailsDao.deleteTrainDetails(trianId, trainName);
				searchProduct = trainDetails;
				break;
			}
		}
		if (searchProduct != null) {
			TrainDetailsDao.getAllTrains().remove(searchProduct);
		} else {
			throw new ServiceException("No trains matching");
		}
	}
}
