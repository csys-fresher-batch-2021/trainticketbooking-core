package in.swetha.model;

public class TrainDetails {

	
		private Integer trainId;
		private Integer trainNumber;
		private String trainName;
		private String trainSource;
		private String trainDestination;
		private String sourceTime;
		private String destinationTime;
		private String stationOne;
		private String stationSecond;
		private String stationThree;
		private Integer fare;
		private String availableDays;
		private Integer availableSeats;

		public Integer getTrainId() {
			return trainId;
		}

		public void setTrainId(Integer trainId) {
			this.trainId = trainId;
		}

		public Integer getTrainNumber() {
			return trainNumber;
		}

		public void setTrainNumber(Integer trainNumber) {
			this.trainNumber = trainNumber;
		}

		public String getTrainName() {
			return trainName;
		}

		public void setTrainName(String trainName) {
			this.trainName = trainName;
		}

		public String getTrainSource() {
			return trainSource;
		}

		public void setTrainSource(String trainSource) {
			this.trainSource = trainSource;
		}

		public String getTrainDestination() {
			return trainDestination;
		}

		public void setTrainDestination(String trainDestination) {
			this.trainDestination = trainDestination;
		}

		public String getSourceTime() {
			return sourceTime;
		}

		public void setSourceTime(String sourceTime) {
			this.sourceTime = sourceTime;
		}

		public String getDestinationTime() {
			return destinationTime;
		}

		public void setDestinationTime(String destinationTime) {
			this.destinationTime = destinationTime;
		}

		public String getStationOne() {
			return stationOne;
		}

		public void setStationOne(String stationOne) {
			this.stationOne = stationOne;
		}

		public String getStationSecond() {
			return stationSecond;
		}

		public void setStationSecond(String stationSecond) {
			this.stationSecond = stationSecond;
		}

		public String getStationThree() {
			return stationThree;
		}

		public void setStationThree(String stationThree) {
			this.stationThree = stationThree;
		}

		public Integer getFare() {
			return fare;
		}

		public void setFare(Integer fare) {
			this.fare = fare;
		}

		public String getAvailableDays() {
			return availableDays;
		}

		public void setAvailableDays(String availableDays) {
			this.availableDays = availableDays;
		}

		public Integer getAvailableSeats() {
			return availableSeats;
		}

		public void setAvailableSeats(Integer availableSeats) {
			this.availableSeats = availableSeats;
		}

		public TrainDetails() {
			super();
		}

		public TrainDetails(Integer trainId, Integer trainNumber, String trainName, String trainSource,
				String trainDestination, String sourceTime, String destinationTime, String stationOne, String stationSecond,
				String stationThree, Integer fare, String availableDays, Integer availableSeats) {
			super();
			this.trainId = trainId;
			this.trainNumber = trainNumber;
			this.trainName = trainName;
			this.trainSource = trainSource;
			this.trainDestination = trainDestination;
			this.sourceTime = sourceTime;
			this.destinationTime = destinationTime;
			this.stationOne = stationOne;
			this.stationSecond = stationSecond;
			this.stationThree = stationThree;
			this.fare = fare;
			this.availableDays = availableDays;
			this.availableSeats = availableSeats;
		}

		@Override
		public String toString() {
			return "TrainDetails [trainId=" + trainId + ", trainNumber=" + trainNumber + ", trainName=" + trainName
					+ ", trainSource=" + trainSource + ", trainDestination=" + trainDestination + ", sourceTime="
					+ sourceTime + ", destinationTime=" + destinationTime + ", stationOne=" + stationOne
					+ ", stationSecond=" + stationSecond + ", stationThree=" + stationThree + ", fare=" + fare
					+ ", availableDays=" + availableDays + ", availableSeats=" + availableSeats + "]";
		}
	}


