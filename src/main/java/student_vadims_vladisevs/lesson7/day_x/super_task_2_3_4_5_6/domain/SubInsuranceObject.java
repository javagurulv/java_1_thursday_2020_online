package student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SubInsuranceObject {

	private String name;
	private BigDecimal price;
	private List<InsuranceRisk> insuranceRisks;

	public SubInsuranceObject(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
		this.insuranceRisks = new ArrayList<>();
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
