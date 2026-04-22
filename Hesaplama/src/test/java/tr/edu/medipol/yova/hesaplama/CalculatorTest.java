package tr.edu.medipol.yova.hesaplama;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CalculatorTest {

	@Nested
	class SubtractionTests {
		@Test
		void testSumWithPositiveValues() {
			int actual = Calculator.subtract(5, 2);
			assertEquals(3, actual);
			System.out.println("Pozitif deger testi basarili.");
		}
	}

	@Nested
	class SummationTests {

		@Test
		void testSumWithPositiveValues() {
			int actual = Calculator.sum(2, 5);
			assertEquals(7, actual);
			System.out.println("Pozitif deger testi basarili.");
		}

		@Test
		void testSumWithNegativeValues() {
			int actual = Calculator.sum(-2, -5);
			assertEquals(-7, actual);
			System.out.println("Negatif deger testi basarili.");
		}

		@Test
		void testSumWithPositiveNegativeValues() {
			int actual = Calculator.sum(-2, +5);
			assertEquals(+3, actual);
			System.out.println("Karisik deger testi basarili.");
		}

		@Test
		void testSumGreaterThanMaxValue() {
			int actual = Calculator.sum(Integer.MAX_VALUE, -2);
			assertEquals(Integer.MAX_VALUE - 2, actual);
			System.out.println("Max deger testi basarili.");
		}

		@Test
		void testSumLessThanMinValue() {
			int actual = Calculator.sum(Integer.MIN_VALUE, +2);
			assertEquals(Integer.MIN_VALUE + 2, actual);
			System.out.println("Min deger testi basarili.");
		}
	}

	class PowerTests {
		void testPowerSimple() {
			int actual = Calculator.power(2, 3);
			assertEquals(8, actual);
		}
	}
}
