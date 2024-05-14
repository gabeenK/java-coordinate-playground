package coordinate;

import coordinate.vo.Points;

import java.util.stream.IntStream;

public abstract class Draw implements Coordinate, ResultFunction, ValidateFunction {

	private final Points points;

	public Draw(Points points) {
		this.points = points;
	}

	@Override
	public void print() {
		validate();
		new DrawGraph(points);
		printResult();
	}

	void validate() {
		points.validate(this);
	}

	void printResult() {
		System.out.println();
		System.out.print(getPrintMessage());

		System.out.print(" ");
		System.out.print(getResult());
	}

	Number getResult() {
		return points.getResultByFunction(this);
	}
}