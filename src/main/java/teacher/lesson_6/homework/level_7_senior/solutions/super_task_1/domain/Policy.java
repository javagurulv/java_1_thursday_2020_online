package teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain;

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
