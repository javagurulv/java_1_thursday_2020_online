package teacher.lesson_7.lessoncode.insurancecalculator.v3.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsuranceObject {

	private List<SubInsuranceObject> subInsuranceObjects;

	public InsuranceObject(SubInsuranceObject ... subInsuranceObjects) {
		this.subInsuranceObjects = new ArrayList<>(Arrays.asList(subInsuranceObjects));
	}

	public List<SubInsuranceObject> getSubInsuranceObjects() {
		return subInsuranceObjects;
	}
}
