package coordinate.triangle;

import coordinate.Draw;
import coordinate.Point;
import coordinate.Points;
import coordinate.ResultFunction;

import java.util.List;

public class TriangleDraw extends Draw {

	public TriangleDraw(Points points) {
		super(points);
	}

	@Override
	public String getPrintMessage() {
		return "삼각형 넓이는";
	}

	@Override
	public Double calculate(List<Point> pointList) {
		return 0D;
	}
}