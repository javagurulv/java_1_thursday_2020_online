package student_igors_mihejevs.pc.domain;

import student_igors_mihejevs.lesson_6.day_x.from_viktor.v2.domain.InsuranceRisk;

import java.math.BigDecimal;
import java.util.List;

public class PolicySubObject {

	private String subObjectName;
	private BigDecimal sumInsured;
	private List<PolicyRisk> policyRisk;

	public PolicySubObject(String name, BigDecimal sum) {
		this.subObjectName = name;
		this.sumInsured = sum;
	}

	public void addPolicyRisk(PolicyRisk policyRisk) {
		this.policyRisk.add(policyRisk);
	}

	public List<PolicyRisk> getPolicyRisks() {
		return policyRisk;
	}

	public BigDecimal getPrice() {
		return sumInsured;
	}

	public boolean isInsuredFrom(PolicyRisk policyRisk) {
		return this.getPolicyRisks().contains(policyRisk);
	}

}
