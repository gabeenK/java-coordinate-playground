package coordinate.client;

import coordinate.vo.Points;

public class Controller {

	public void start(String input) {
		Points points = new Points(input); 		 // business logic
		new Output(points); 					 // return output
	}
}