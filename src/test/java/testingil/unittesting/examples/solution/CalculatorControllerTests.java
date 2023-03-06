package testingil.unittesting.examples.solution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import testingil.unittesting.examples.demos.d04.characterization.CalculatorDisplay;
import testingil.unittesting.examples.exercise.e03.spring.CalculatorController;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatorControllerTests {

	@Mock
	CalculatorController controller;

	@Test
	public void control() {
		// CalculatorDisplay calcDisplay = new CalculatorDisplay();
		when(controller.press(any())).thenReturn(ResponseEntity.ok(null));
		when(controller.getDisplay()).thenReturn(ResponseEntity.badRequest().build());
		ResponseEntity resp = controller.press("5");
		ResponseEntity disp = controller.getDisplay();
		//System.err.println("xxx"+controller.press("5"));
		//System.err.println("yyyy"+controller.getDisplay());
		assertEquals(200, resp.getStatusCodeValue());
		assertEquals(400, disp.getStatusCodeValue());
	}

}