package fuel;

public class Avante implements Car {
	private final double distance;

	public Avante(double distance) {
		this.distance = distance;
	}

	@Override
	public double getDistancePerLiter() {
		return 15;
	}

	@Override
	public double getTripDistance() {
		return this.distance;
	}

	@Override
	public String getName() {
		return "fuel.Avante";
	}
}
