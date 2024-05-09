package coordinate;

import coordinate.line.LineDraw;
import coordinate.square.SquareDraw;
import coordinate.triangle.TriangleDraw;

public class Service {

	private Coordinate coordinate;

	public Service(Points points) {
		setCoordinate(points);
	}

	// 서비스 세팅
	void setCoordinate(Points points) {
		if (points.getPointListSize() == 2) {
			this.coordinate = new LineDraw(points);
			return;
		}

		if (points.getPointListSize() == 3) {
			this.coordinate = new TriangleDraw(points);
			return;
		}

		if (points.getPointListSize() == 4) {
			this.coordinate = new SquareDraw(points);
			return;
		}
		throw new RuntimeException("직선, 삼각형, 사각형 모두 아님");
	}

	public void output() {
		this.coordinate.drawCoordinate();
		this.coordinate.printResult();
	}
}
