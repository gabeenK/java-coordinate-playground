package fuel;

public class K5 implements Car {

	private final double distance;

	public K5(double distance) {
		this.distance = distance;
	}

	@Override
	public double getDistancePerLiter() {
		return 13;
	}

	@Override
	public double getTripDistance() {
		return this.distance;
	}

	@Override
	public String getName() {
		return "fuel.K5";
	}
}
