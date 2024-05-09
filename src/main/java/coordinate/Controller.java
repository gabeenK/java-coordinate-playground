package coordinate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Controller {

	public void start(String input) {
		Points points = new Points(input);
		Service service = new Service(points);
		service.output();
	}
}