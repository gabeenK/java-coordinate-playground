package coordinate.line;

import coordinate.Draw;
import coordinate.vo.Point;
import coordinate.vo.Points;

import java.util.List;

public class LineDraw extends Draw {

	public LineDraw(Points points) {
		super(points);
	}

	@Override
	public String getPrintMessage() {
		return "두 점 사이 거리는";
	}

	@Override
	public Double calculate(List<Point> pointList) {
		 return Math.sqrt(Math.pow(pointList.get(0).getX() - pointList.get(1).getX(), 2)
				+ Math.pow(pointList.get(0).getY() - pointList.get(1).getY(), 2));
	}

	@Override
	public void validateShape(List<Point> pointList) {
	}

}