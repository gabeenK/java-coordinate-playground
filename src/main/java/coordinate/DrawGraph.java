package coordinate;

import coordinate.vo.Points;

import java.util.stream.IntStream;

public class DrawGraph {

	public DrawGraph(Points points) {
		drawCoordinate(points);
	}

	void drawCoordinate(Points points) {
		System.out.println("좌표 출력");
		for (int y = 24; y >= 1; y--) {
			StringBuilder sb = new StringBuilder();
			drawVertical(sb, y);
			drawInner(sb, y, points);
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

	void drawInner(StringBuilder sb, int y, Points points) {
		for (int x = 1; x <= 24; x++) {
			sb.append(" ").append(" ");
			drawPoint(sb, y, x, points);
		}
	}

	void drawHorizontal() {
		System.out.print("  +");
		IntStream.rangeClosed(1, 24).mapToObj(i -> "――").forEach(System.out::print);
		drawZero();
		IntStream.rangeClosed(1, 24).forEach(this::drawHorizontalNumber);
	}

	void drawZero() {
		System.out.println();
		System.out.print("  0 ");
	}

	void drawHorizontalNumber(int i) {
		String format;
		if (i % 2 == 0) {
			format = String.format("%4s", i);
			System.out.print(format);
		}
	}

	void drawPoint(StringBuilder sb, int y, int x, Points points) {
		points.stream().filter(a -> a.isEqual(x, y)).forEach(a -> {
			sb.deleteCharAt(sb.length() - 1);
			sb.append("*");
		});
	}
}