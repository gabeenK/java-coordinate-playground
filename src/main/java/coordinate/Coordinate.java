package coordinate;

import java.util.ArrayList;
import java.util.List;

public abstract class Coordinate {
	public void drawCoordinate() {
		System.out.println("좌표 출력");
	}

	public void printResult() {
		System.out.println("결과 : ");
	}


	public static void main(String[] args) {
		String[] string1 = new String[2];
		string1[0] = "10";
		string1[1] = "10";
		String[] string2 = new String[2];
		string2[0] = "14";
		string2[1] = "15";

		List<String[]> test = new ArrayList<>();
		test.add(string1);
		test.add(string2);


		for (int y = 24; y >= 1; y--) {
			StringBuilder sb = new StringBuilder();
			drawVertical(sb, y);
			for (int x = 1; x <= 24; x++) {
				sb.append(" ").append(" ");
				drawPoint(sb, y, x, test);
			}
			System.out.println(sb);
		}

		drawHorizontal();
	}

	static void drawVertical(StringBuilder sb, int y) {
		String format = String.format("%3s", y + "|");
		if (y % 2 != 0) {
			format = String.format("%3s", "|");
		}
		sb.append(format);
	}

	static void drawHorizontal() {
		System.out.print("  +");
		for (int i = 0; i < 24; i++) {
			System.out.print("――");
		}

		System.out.println();

		for (int i = 0; i <= 24; i++) {
			if (i % 2 == 0) {
				String format = String.format("%4s", i + " ");
				System.out.print(format);
			}
		}
	}

	static void drawPoint(StringBuilder sb, int y, int x, List<String[]> list) {
		list.forEach(a -> {
			if (Integer.parseInt(a[0]) == x && Integer.parseInt(a[1]) == y) {
				sb.append("#");
			}
		});
	}
}
