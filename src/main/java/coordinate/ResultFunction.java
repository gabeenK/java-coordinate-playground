package coordinate;

import coordinate.vo.Point;

import java.util.List;

public interface ResultFunction {
	String getPrintMessage();
	Number calculate(List<Point> pointList);
}