package student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain;

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
