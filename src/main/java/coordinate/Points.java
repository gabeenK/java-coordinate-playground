package coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Points {

	private final List<Point> pointList = new ArrayList<>();

	public Points(String input) {
		makePoints(input);
	}

	void makePoints(String input) {
		String[] coordinates = input.split("-");
		for (String coordinate : coordinates) {
			coordinate = removeBracket(coordinate);
			Point spot = setPointWithThrow(coordinate);
			pointList.add(spot);
		}
	}

	Point setPointWithThrow(String coordinate) {
		String[] spots = coordinate.split(",");
		for (String spot : spots) {
			validateNumberRange(Integer.parseInt(spot));
		}

		return new Point(Integer.parseInt(spots[0]), Integer.parseInt(spots[1]));
	}

	String removeBracket(String str) {
		str = str.replace("(", "");
		str = str.replace(")", "");
		return str;
	}


	void validateNumberRange(int number) {
		if (number > 24) {
			throw new RuntimeException("정상적인 좌표값을 입력해 주세요");
		}
	}

	int getPointListSize() {
		return pointList.size();
	}

	Stream<Point> stream() {
		return pointList.stream();
	}

	Number getResultByFunction(ResultFunction resultFunction) {
		return resultFunction.calculate(this.pointList);
	}
}
