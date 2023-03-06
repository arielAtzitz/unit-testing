package testingil.unittesting.examples.demos.d04.characterization;

import org.springframework.stereotype.Component;

@Component
public class ExternalDisplay {

	Boolean on=false;
	String externalShow="";

	public void setExternalShow(String text) {
		this.externalShow = text;
	}

	public String getExternalShow() {
		return this.externalShow;
	}

	public Boolean isOn() {
		return on;
	}
}