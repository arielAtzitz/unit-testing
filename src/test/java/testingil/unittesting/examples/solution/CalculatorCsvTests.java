package testingil.unittesting.examples.solution;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import testingil.unittesting.examples.demos.d00.coverage.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorCsvTests {

	@ParameterizedTest
	@CsvFileSource(resources = "/calculatorFromFile.csv")
	public void testCalculator_HappyFlows(Integer total, Integer num1, Integer num2) {
		Calculator calc = new Calculator();
		// System.out.println(num1+"+"+num2+"="+total);
		assertEquals(total, calc.add(num1,num2));
	}
}