package tr.edu.medipol.yova.hesaplama;

public final class Calculator {

	private Calculator() {
		
	}

	public static int sum(int number1, int number2) {
		return number1 + number2;
	}
	
	public static int subtract(int number1, int number2) {
		return number1 - number2;
	}
	
	public static int multiply(int number1, int number2) {
		return number1 * number2;
	}
	
	public static int divide(int number1, int number2) {
		return number1 / number2;
	}
}
