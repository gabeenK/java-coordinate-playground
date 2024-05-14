package coordinate.client;

import coordinate.vo.Points;

public class Output {

	public Output(Points points) {;
		points.getCoordinate().print();
	}
}