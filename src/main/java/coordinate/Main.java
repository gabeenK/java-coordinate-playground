package coordinate;

public class Main {
	public static void main(String[] args) {
//		기능 요구사항

//		사용자가 점에 대한 좌표 정보를 입력하는 메뉴를 구성한다.
//		좌표 정보는 괄호"(", ")"로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분한다.
//		X, Y좌표 모두 최대 24까지만 입력할 수 있다.
//		입력 범위를 초과할 경우 에러 문구를 출력하고 다시 입력을 받는다.
//		정상적인 좌표값을 입력한 경우, 해당 좌표에 특수문자를 표시한다.
//				좌표값을 두 개 입력한 경우, 두 점을 있는 직선으로 가정한다. 좌표값과 좌표값 사이는 '-' 문자로 구분한다.
//		직선인 경우는 두 점 사이 거리를 계산해서 출력한다.


		/* userInput
		 * 사용자 입력값 받기
		 * */

		/* controller
		 * validate check
		 * 배열로 만들기
		 * 서비스로 던지기
		 * */

		/* service
		 * 입력 개수를 count해서 직선인지 삼각인지, 사각인지 구분해서 coordinate interFace output으로 던지기
		 * */

		/* coordinate abstract
		 * draw() : default 로 좌표 그리기 하나 (매개변수 여러개 받을 수 있도록 해서 해당 위치에 좌표가 있으면 그리도록)
		 * result() : 결과 값 출력로직 (선, 면적 상속 받아서 알아서 구현) (패키지마다 알아서 상속받아서 구현)
		 * */

		/* output
		 * coordinate.draw()
		 * coordinate.result()
		 * */

		Input input = new Input();
		input.client();
	}
}
