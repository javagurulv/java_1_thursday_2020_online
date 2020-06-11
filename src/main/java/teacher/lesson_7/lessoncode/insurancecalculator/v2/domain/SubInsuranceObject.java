package teacher.lesson_7.lessoncode.insurancecalculator.v2.domain;

import java.math.BigDecimal;
import java.util.List;

public class SubInsuranceObject {

	private String name;
	private BigDecimal price;
	private List<InsuranceRisk> insuranceRisks;

	public SubInsuranceObject(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}

	public void addInsuranceRisk(InsuranceRisk insuranceRisk) {
		this.insuranceRisks.add(insuranceRisk);
	}

	public List<InsuranceRisk> getInsuranceRisks() {
		return insuranceRisks;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public boolean isInsuredFrom(InsuranceRisk insuranceRisk) {
		return this.getInsuranceRisks().contains(insuranceRisk);
	}

}
