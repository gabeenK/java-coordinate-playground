package coordinate.vo;

import coordinate.Coordinate;
import coordinate.ResultFunction;
import coordinate.ValidateFunction;
import coordinate.line.LineDraw;
import coordinate.square.SquareDraw;
import coordinate.triangle.TriangleDraw;

import java.util.*;
import java.util.stream.Stream;

public class Points {

	private final List<Point> pointList = new ArrayList<>();

	public Points(String input) {
		setPoints(input);
	}

	void setPoints(String userInput) {
		String[] inputs = userInput.split("-");

		Arrays.stream(inputs)
				.map(this::getPointWithThrow)
				.forEach(pointList::add);

		this.pointList.sort((o1, o2) -> o1.getX() == o2.getX() ? o1.getY() - o2.getY() : o1.getX() - o2.getX());
	}

	Point getPointWithThrow(String input) {
		String inputWithoutBracketInput = removeBracket(input);

		String[] spots = inputWithoutBracketInput.split(",");

		Arrays.stream(spots)
				.mapToInt(Integer::parseInt)
				.forEach(this::validateNumberRange);

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

	public Coordinate getCoordinate() {
		if (this.pointList.size() == 2) {
			return new LineDraw(this);
		}

		if (this.pointList.size() == 3) {
			return new TriangleDraw(this);
		}

		if (this.pointList.size() == 4) {
			return new SquareDraw(this);
		}
		throw new RuntimeException("직선, 삼각형, 사각형 모두 아님");
	}

	public Stream<Point> stream() {
		return pointList.stream();
	}

	public void validate(ValidateFunction validateFunction) {
		validateFunction.validateShape(this.pointList);
	}

	public Number getResultByFunction(ResultFunction resultFunction) {
		return resultFunction.calculate(this.pointList);
	}
}
