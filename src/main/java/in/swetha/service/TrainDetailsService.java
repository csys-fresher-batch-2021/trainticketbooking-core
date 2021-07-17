package in.swetha.service;
import in.swetha.dao.TrainDetailsDao;
import in.swetha.exception.ServiceException;
import in.swetha.model.TrainDetails;
import in.swetha.validator.TrainDetailsValidator;
public class TrainDetailsService {
	private TrainDetailsService(){
		
	}
	public static void trainDetails(TrainDetails trainDetails) throws Exception {
		try {
			boolean trainId = TrainDetailsValidator.isTrainIdValid(trainDetails.getTrainId());
			boolean trainNumber = TrainDetailsValidator.isTrainNumberValid(trainDetails.getTrainNumber());
			boolean trainName = TrainDetailsValidator.isTrainNameValid(trainDetails.getTrainName());
			boolean trainSource = TrainDetailsValidator.isTrainSourceValid(trainDetails.getTrainSource());
			boolean trainDestination = TrainDetailsValidator
					.isTrainDestinationValid(trainDetails.getTrainDestination());
			boolean stationOne = TrainDetailsValidator.isStationOneValid(trainDetails.getStationOne());
			boolean stationTwo = TrainDetailsValidator.isStationTwoValid(trainDetails.getStationSecond());
			boolean stationThree = TrainDetailsValidator.isStationThreeValid(trainDetails.getStationThree());
			boolean fare = TrainDetailsValidator.isFareValid(trainDetails.getFare());
			boolean avalabilityDays = TrainDetailsValidator.isAvalabilityDaysValid(trainDetails.getAvailableDays());
			boolean avalabilitySeats = TrainDetailsValidator.isAvalabilitySeatsValid(trainDetails.getAvailableSeats());
			if (trainId && trainNumber && trainName && trainSource && trainDestination && stationOne && stationTwo
					&& stationThree && fare && avalabilityDays && avalabilitySeats) {
				TrainDetailsDao.insertDetails(trainDetails);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException(e.getMessage());
		}
	}
}
