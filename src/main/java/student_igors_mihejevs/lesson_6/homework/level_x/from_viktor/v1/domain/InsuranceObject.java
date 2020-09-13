package student_igors_mihejevs.lesson_6.homework.level_x.from_viktor.v1.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class InsuranceObject {

	private List<SubInsuranceObject> subInsuranceObjects;
	private BigDecimal cadastralValue;
	private List<InsuranceRisk> insuranceRisks;

	public InsuranceObject(BigDecimal cadastralValue) {
		this.cadastralValue = cadastralValue;
		this.subInsuranceObjects = new ArrayList<>();
		this.insuranceRisks = new ArrayList<>();
	}

	public void addSubInsuranceObject(SubInsuranceObject subInsuranceObject) {
		this.subInsuranceObjects.add(subInsuranceObject);
	}

	public void addInsuranceRisk(InsuranceRisk insuranceRisk) {
		this.insuranceRisks.add(insuranceRisk);
	}

	public List<SubInsuranceObject> getSubInsuranceObjects() {
		return subInsuranceObjects;
	}

	public List<InsuranceRisk> getInsuranceRisks() {
		return insuranceRisks;
	}

	public abstract BigDecimal getRiskCoeficient(InsuranceRisk insuranceRisk);

	public BigDecimal getCadastralValue() {
		return cadastralValue;
	}
}
