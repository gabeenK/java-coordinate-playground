package coordinate;

import java.util.ArrayList;
import java.util.List;

public class Controller {

	private final List<String[]> coordinateList = new ArrayList<>();

	public void start(String input) {
		makeCoordinate(input);
		Service service = new Service(this.coordinateList);
	}

	void makeCoordinate(String input) {
		String[] coordinates = input.split("-");
		for (String coordinate : coordinates) {
			coordinate = removeBracket(coordinate);
			String[] spot = setSpotWithThrow(coordinate);
			coordinateList.add(spot);
		}
	}

	String[] setSpotWithThrow(String coordinate) {
		String[] spots = coordinate.split(",");
		for (String spot : spots) {
			validateNumberRange(Integer.parseInt(spot));
		}
		return spots;
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
}
