package in.swetha.validator;

public class TrainDetailsValidator {
	


		public static boolean isTrainIdValid(Integer trainId) {
			boolean valid = false;
			if (trainId>0) {
				System.out.println("Train id valid");
				valid = true;
			} else {
				System.out.println("Train id not valid");
			}
			return valid;
		}

		public static boolean isTrainNumberValid(Integer trainNumber) {
			boolean valid = false;
			if (trainNumber>0) {
				System.out.println("Train number valid");
				valid = true;
			} else {
				System.out.println("Train number not valid");
			}
			return valid;
		}

		public static boolean isTrainNameValid(String trainName) {
			boolean valid = false;
			String regex = "[a-zA-Z]+\\.?";
			if (trainName.matches(regex)) {
				System.out.println("Train name valid");
				valid = true;
			} else {
				System.out.println("Train name not valid");
			}
			return valid;
		}

		public static boolean isTrainSourceValid(String trainSource) {
			boolean valid = false;
			trainSource=trainSource.trim();
			String regex = "[a-zA-Z]+\\.?";
			if (trainSource.matches(regex)) {
				System.out.println("Train source valid");
				valid = true;
			} else {
				System.out.println("Train source not valid");
			}
			return valid;
		}

		public static boolean isTrainDestinationValid(String trainDestination) {
			boolean valid = false;
			trainDestination=trainDestination.trim();
			String regex = "[a-zA-Z]+\\.?";
			if (trainDestination.matches(regex)) {
				System.out.println("Train destination valid");
				valid = true;
			} else {
				System.out.println("Train destination not valid");
				}
			return valid;
		}

		public static boolean isStationOneValid(String stationOne) {
			boolean valid = false;
			stationOne=stationOne.trim();
			String regex = "[a-zA-Z]+\\.?";
			if (stationOne.matches(regex)) {
				System.out.println("Train station one valid");
				valid = true;
			} else {
				System.out.println("Train station one not valid");
			}
			return valid;
		}

		public static boolean isStationTwoValid(String stationSecond) {
			boolean valid = false;
			stationSecond=stationSecond.trim();
			String regex = "[a-zA-Z]+\\.?";
			if (stationSecond.matches(regex)) {
				System.out.println("Train station Two valid");
				valid = true;
			} else {
				System.out.println("Train station two not valid");
			}
			return valid;
		}

		public static boolean isStationThreeValid(String stationThree) {
			boolean valid = false;
			stationThree=stationThree.trim();
			String regex = "[a-zA-Z]+\\.?";
			if (stationThree.matches(regex)) {
				System.out.println("Train station three valid");
				valid = true;
			} else {
				System.out.println("Train station three not valid");
			}
			return valid;
		}

		public static boolean isFareValid(Integer fare) {
			boolean valid = false;
			if (fare>0) {
				System.out.println("Train fare valid");
				valid = true;
			} else {
				System.out.println("Train fare not valid");
			}
			return valid;
		}

		public static boolean isAvalabilityDaysValid(String availableDays) {
			boolean valid = false;
			availableDays=availableDays.trim();
			String regex = "[a-zA-Z]+\\.?";
			if (availableDays.matches(regex)) {
				System.out.println("Train avalabilitydays valid");
				valid = true;
			} else {
				System.out.println("Train avalabilitydays not valid");
			}
			return valid;
		}

		public static boolean isAvalabilitySeatsValid(Integer availableSeats) {
			boolean valid = false;
			if (availableSeats>0) {
				System.out.println("Train availableseats valid");
				valid = true;
			} else {
				System.out.println("Train availableseats not valid");
			}
			return valid;
		}

	}



