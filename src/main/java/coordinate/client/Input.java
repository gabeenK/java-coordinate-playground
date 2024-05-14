package coordinate.client;

import java.util.Scanner;

public class Input {

	private final Controller controller = new Controller();

	public void client() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("좌표를 입력하세요.");
		String input = scanner.next();

		controller.start(input);
	}
}
