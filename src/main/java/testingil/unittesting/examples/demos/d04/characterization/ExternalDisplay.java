package testingil.unittesting.examples.demos.d04.characterization;

import org.springframework.stereotype.Component;

@Component
public class ExternalDisplay {

	Boolean on;
	String externalShow;

	public String show(String text) {
		this.externalShow = text;
		return text;
	}

	public Boolean isOn() {
		return on;
	}
}