package coordinate;

import coordinate.line.LineCoordinate;
import coordinate.square.SquareCoordinate;
import coordinate.triangle.TriangleCoordinate;

import java.util.List;

public class Service {

	private Coordinate coordinate;

	public Service(List<int[]> coordinateList) {
		setCoordinate(coordinateList);
		output();
	}

	// 서비스 세팅
	void setCoordinate(List<int[]> coordinateList) {
		if (coordinateList.size() == 2) {
			this.coordinate = new LineCoordinate(coordinateList);
			return;
		}

		if (coordinateList.size() == 3) {
			this.coordinate = new TriangleCoordinate(coordinateList);
			return;
		}

		if (coordinateList.size() == 4) {
			this.coordinate = new SquareCoordinate(coordinateList);
			return;
		}
		throw new RuntimeException("직선, 삼각형, 사각형 모두 아님");
	}

	void output() {
		this.coordinate.drawCoordinate();
		this.coordinate.printResult();
	}
}
