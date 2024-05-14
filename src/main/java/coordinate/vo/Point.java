package coordinate.vo;

public class Point {
	private int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isEqual(int targetX, int targetY) {
		return x == targetX && y == targetY;
	}
}
