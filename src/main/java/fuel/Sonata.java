package fuel;

public class Sonata implements Car {

	private final double distance;

	public Sonata(double distance) {
		this.distance = distance;
	}

	@Override
	public double getDistancePerLiter() {
		return 10;
	}

	@Override
	public double getTripDistance() {
		return this.distance;
	}

	@Override
	public String getName() {
		return "fuel.Sonata";
	}
}
