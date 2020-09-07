package teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.test;

import java.util.ArrayList;
import java.util.List;

import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain.InsuranceObject;
import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain.Policy;

public class PolicyBuilder {

	private List<InsuranceObject> insuranceObjects = new ArrayList<>();

	public static PolicyBuilder createPolicy() {
		return new PolicyBuilder();
	}

	private PolicyBuilder() { }

	public Policy build() {
		Policy policy = new Policy();
		insuranceObjects.forEach(insuranceObject -> policy.addInsuranceObject(insuranceObject));
		return policy;
	}

	public PolicyBuilder with(InsuranceObject insuranceObject) {
		this.insuranceObjects.add(insuranceObject);
		return this;
	}

}