package in.swetha.util;

import java.util.List;

import in.swetha.model.PassengerDetails;
import in.swetha.model.TrainDetails;

public class Logger {
	public void debug(String object) {
		System.out.println(object);
	}

	public static void debug(PassengerDetails detail) {
		System.out.println(detail);

	}

	public void debug(List<TrainDetails> findStations) {
		System.out.println(findStations);
	}

	public void debug(TrainDetails trainDetail) {
		System.out.println(trainDetail);
	}
}
