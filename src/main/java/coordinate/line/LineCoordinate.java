package coordinate.line;

import coordinate.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class LineCoordinate extends Coordinate {
	public LineCoordinate(List<int[]> coordinateList) {
		super(coordinateList);
	}

	@Override
	public double getResult() {
		return Math.sqrt(Math.pow(super.getCoordinateList().get(0)[0] - super.getCoordinateList().get(1)[0], 2)
				+ Math.pow(super.getCoordinateList().get(0)[1] - super.getCoordinateList().get(1)[1], 2));
	}
}


