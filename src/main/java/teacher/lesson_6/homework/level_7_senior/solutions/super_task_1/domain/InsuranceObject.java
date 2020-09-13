package teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain;

import java.util.ArrayList;
import java.util.List;

public class InsuranceObject {

	private List<SubInsuranceObject> subInsuranceObjects;

	public InsuranceObject() {
		this.subInsuranceObjects = new ArrayList<>();
	}

	public void addSubInsuranceObject(SubInsuranceObject subInsuranceObject) {
		this.subInsuranceObjects.add(subInsuranceObject);
	}

	public List<SubInsuranceObject> getSubInsuranceObjects() {
		return subInsuranceObjects;
	}

}
