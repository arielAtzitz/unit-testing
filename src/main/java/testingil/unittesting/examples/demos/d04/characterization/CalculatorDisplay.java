package testingil.unittesting.examples.demos.d04.characterization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorDisplay {
	@Autowired
	ExternalDisplay externalDisplay;
	String display = "";
	int lastArgument = 0;
	int result = 0;
	Boolean newArgument = false;
	Boolean shouldReset = true;
	OperationType lastOperation;

	public String press(String key) {
		if (key.equals("+")) {
			lastOperation = OperationType.Plus;
			lastArgument = Integer.parseInt(display);
			newArgument = true;
		} else {
			if (key.equals("/")) {
				lastOperation = OperationType.Div;
				lastArgument = Integer.parseInt(display);
				newArgument = true;
			} else if (key.equals("=")) {
				int currentArgument = Integer.parseInt(display);
				if (lastOperation == OperationType.Plus) {
					display = Integer.toString(lastArgument + currentArgument);
				}
				if (lastOperation == OperationType.Div && currentArgument == 0) {
					display = "Division By Zero Error";
				}
				shouldReset = true;
			} else {
				if (shouldReset) {
					display = "";
					shouldReset = false;
				}
				if (newArgument) {
					display = "";
					newArgument = false;
				}
				display += key;
			}
		}
		return showDisplay();
	}

	public String getDisplay() {
		if (display.equals(""))
			return "0";
		if (display.length() > 5)
			return "E";
		return display;
	}

	public String showDisplay() {
		if (externalDisplay.isOn()) {
			externalDisplay.show(display);
		}
		return display;
	}
}