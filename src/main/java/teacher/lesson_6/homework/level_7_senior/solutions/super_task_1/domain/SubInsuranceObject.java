package teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SubInsuranceObject {

	private String name;
	private BigDecimal price;
	private List<InsuranceRisk> insuranceRisks = new ArrayList<>();

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

}
