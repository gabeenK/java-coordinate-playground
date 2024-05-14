package coordinate.square;

import coordinate.Draw;
import coordinate.vo.Point;
import coordinate.vo.Points;

import java.util.List;
import java.util.Objects;

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
		// (10,10)-(22,10)-(22,18)-(10,18)
		List<Integer> lengths = getLengthAndHeight(pointList);
		return lengths.get(0) * lengths.get(2);
	}

	@Override
	public void validateShape(List<Point> pointList) {
		List<Integer> lengths = getLengthAndHeight(pointList);

		if (!lengths.get(0).equals(lengths.get(1)) || !Objects.equals(lengths.get(2), lengths.get(3))) {
			throw new RuntimeException("직사각형이 아님");
		}
	}

	List<Integer> getLengthAndHeight(List<Point> pointList) {
		int length_bottom = Math.absExact(pointList.get(2).getX() - pointList.get(0).getX());
		int length_top= Math.absExact(pointList.get(3).getX() - pointList.get(1).getX());

		int height_left = Math.absExact(pointList.get(1).getY() - pointList.get(0).getY());
		int height_right = Math.absExact(pointList.get(3).getY() - pointList.get(2).getY());

		return List.of(length_bottom, length_top, height_left, height_right);
	}
}