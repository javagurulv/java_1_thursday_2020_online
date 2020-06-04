package teacher.lesson_7.lessoncode.insurancecalculator.domain;

import java.util.ArrayList;
import java.util.List;

public class Policy {

	private List<InsuranceObject> insuranceObjects = new ArrayList<>();

	public void addInsuranceObject(InsuranceObject insuranceObject) {
		this.insuranceObjects.add(insuranceObject);
	}

	public List<InsuranceObject> getInsuranceObjects() {
		return this.insuranceObjects;
	}

}
