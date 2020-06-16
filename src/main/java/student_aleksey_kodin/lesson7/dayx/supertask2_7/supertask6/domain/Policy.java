package student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask6.domain;

import java.util.ArrayList;
import java.util.List;

public class Policy {

	private final List<InsuranceObject> insuranceObjects = new ArrayList<>();

	public void addInsuranceObject(InsuranceObject insuranceObject) {
		this.insuranceObjects.add(insuranceObject);
	}

	public List<InsuranceObject> getInsuranceObjects() {
		return this.insuranceObjects;
	}

}
