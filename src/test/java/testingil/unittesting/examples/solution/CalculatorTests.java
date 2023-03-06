package testingil.unittesting.examples.solution;

import org.junit.jupiter.api.Test;
import testingil.unittesting.examples.demos.d00.coverage.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

	@Test
	public void calculator() {
		Calculator calc = new Calculator();
		assertEquals(3, calc.add(1,2));
		assertEquals(13, calc.add(13,0));
		assertEquals(365, calc.add(-100,465));
		assertEquals(789, calc.add(389,400));
		assertEquals(1000, calc.add(500,500));
	}
}