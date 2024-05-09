package coordinate.square;

import coordinate.Draw;
import coordinate.Point;
import coordinate.Points;
import coordinate.ResultFunction;

import java.util.ArrayList;
import java.util.List;

public class SquareDraw extends Draw {
	
	public SquareDraw(Points points) {
		super(points);
	}

	@Override
	public String getPrintMessage() {
		return "사각형 넓이는";
	}

	@Override
	public Integer calculate(List<Point> pointList) {
		int length = pointList.get(2).getX() - pointList.get(0).getX();
		int height = pointList.get(2).getY() - pointList.get(0).getY();
		return length * height;
	}
}
