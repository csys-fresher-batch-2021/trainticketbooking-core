package in.swetha.model;

import java.util.ArrayList;
import java.util.List;
import in.swetha.service.TrainDetailsDeleteService;

public class TrainDetailsDeleteTest {

	public static void main(String Arg[]) throws Exception {
		List<TrainDetails> trainDetails = new ArrayList<>();
		System.out.println(trainDetails);
		TrainDetailsDeleteService.deleteTrain(1, "TEJASEXPRESS");
	}
}
