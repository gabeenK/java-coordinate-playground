package coordinate;

import java.util.List;

public abstract class Coordinate {

	private final List<int[]> coordinateList;

	private double result = 0;

	public Coordinate(List<int[]> coordinateList) {
		this.coordinateList = coordinateList;
	}

	public void drawCoordinate() {
		System.out.println("좌표 출력");

		for (int y = 24; y >= 1; y--) {
			StringBuilder sb = new StringBuilder();
			drawVertical(sb, y);
			for (int x = 1; x <= 24; x++) {
				sb.append(" ").append(" ");
				drawPoint(sb, y, x);
			}
			System.out.println(sb);
		}

		drawHorizontal();
	}

	void drawVertical(StringBuilder sb, int y) {
		String format = String.format("%3s", y + "|");
		if (y % 2 != 0) {
			format = String.format("%3s", "|");
		}
		sb.append(format);
	}

	void drawHorizontal() {
		System.out.print("  +");
		for (int i = 1; i <= 24; i++) {
			System.out.print("――");

		}

		System.out.println();
		System.out.print("  0 ");

		for (int i = 1; i <= 24; i++) {
			String format;
			if (i % 2 == 0) {
				format = String.format("%4s", i);
				System.out.print(format);
			}
		}
	}

	void drawPoint(StringBuilder sb, int y, int x) {
		this.coordinateList.forEach(a -> {
			if (a[0] == x && a[1] == y) {
				sb.deleteCharAt(sb.length() - 1);
				sb.append("*");
			}
		});
	}

	public void printResult() {
		System.out.println();
		System.out.print("결과: ");
		System.out.print(getResult());
	}

	public List<int[]> getCoordinateList() {
		return coordinateList;
	}

	public double getResult() {
		return 0;
	}
}
