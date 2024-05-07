import fuel.Avante;
import fuel.K5;
import fuel.RentCompany;
import fuel.Sonata;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RentCompanyTest {
	private static final String NEWLINE = System.lineSeparator();

	@Test
	public void report() throws Exception {
		RentCompany company = RentCompany.create(); // factory method를 사용해 생성
		company.addCar(new Sonata(150));
		company.addCar(new K5(260));
		company.addCar(new Sonata(120));
		company.addCar(new Avante(300));
		company.addCar(new K5(390));

		String report = company.generateReport();
		assertThat(report).isEqualTo(
				"fuel.Sonata : 15리터" + NEWLINE +
						"fuel.K5 : 20리터" + NEWLINE +
						"fuel.Sonata : 12리터" + NEWLINE +
						"fuel.Avante : 20리터" + NEWLINE +
						"fuel.K5 : 30리터" + NEWLINE
		);
	}
}