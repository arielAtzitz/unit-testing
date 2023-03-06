package testingil.unittesting.examples.solution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import testingil.unittesting.examples.demos.d04.characterization.CalculatorDisplay;
import testingil.unittesting.examples.demos.d04.characterization.ExternalDisplay;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatorDisplayTests {

	@Mock
	ExternalDisplay externalDisplay;

	@InjectMocks
	CalculatorDisplay calcDisplay;

	@Test
	public void calculator() {
		when(externalDisplay.show(any())).thenReturn("11");
		calcDisplay.press("5");
		calcDisplay.press("+");
		calcDisplay.press("6");
		String result = calcDisplay.press("=");
		assertEquals("11", result);
		// Mockito.verify(externalDisplay).isOn();
	}

}