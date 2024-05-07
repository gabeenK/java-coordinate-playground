package fuel;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
	/*
	 * fuel.Sonata : 10km/리터
	 * fuel.Avante : 15km/리터
	 * fuel.K5 : 13km/리터
	 */
	private final List<Car> cars = new ArrayList<>();

	private RentCompany() {

	}

	public static RentCompany create() {
		return new RentCompany();
	}

	public void addCar(Car car) {
		this.cars.add(car);
	}

	public String generateReport() {
		StringBuilder sb = new StringBuilder();
		for (Car car : this.cars) {
			sb.append(car.getName());
			sb.append(" : ");
			sb.append((int) car.getChargeQuantity());
			sb.append("리터");
			sb.append(System.lineSeparator());
		}

	return sb.toString();
	}
}