package coordinate.triangle;

import coordinate.Draw;
import coordinate.vo.Point;
import coordinate.vo.Points;

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
		Point point1 = pointList.get(0);
		Point point2 = pointList.get(1);
		Point point3 = pointList.get(2);

		double x = getLengthOfTwoPoints(point1, point2);
		double y = getLengthOfTwoPoints(point2, point3);
		double z = getLengthOfTwoPoints(point1, point3);

		return triangleArea(x, y, z);
	}

	double getLengthOfTwoPoints(Point point1, Point point2) {
		return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2)
				+ Math.pow(point1.getY() - point2.getY(), 2));
	}

	double triangleArea(double x, double y, double z) {
		double s = (x + y + z) / 2.0;
		double sqrt = Math.sqrt(s * (s - x) * (s - y) * (s - z));
		return Math.round(sqrt * 10) / 10.0;
	}

	@Override
	public void validateShape(List<Point> pointList) {
	}
}