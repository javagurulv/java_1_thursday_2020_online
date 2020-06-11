package student_igors_mihejevs.pc.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PolicyObject {

	private PolicyObjectType policyObjectType;
	private BigDecimal cadastralValue;
	private List<PolicyRisk> policyRisks;
	private List<PolicySubObject> policySubObjects;

	public PolicyObject(PolicyObjectType policyObjectType,
						   BigDecimal cadastralValue) {
		this.policyObjectType = policyObjectType;
		this.cadastralValue = cadastralValue;
		this.policySubObjects = new ArrayList<>();
		this.policyRisks = new ArrayList<>();
	}

	public void addPolicySubObject(PolicySubObject policySubObject) {
		this.policySubObjects.add(policySubObject);
	}

	public void addPolicyRisk(PolicyRisk policyRisk) {
		this.policyRisks.add(policyRisk);
	}

	public PolicyObjectType getPolicyObjectType() {
		return policyObjectType;
	}

	public List<PolicySubObject> getPolicySubObjects() {
		return policySubObjects;
	}

	public List<PolicyRisk> getPolicyRisks() {
		return policyRisks;
	}

//	public BigDecimal getCadastralValue() {
//		return cadastralValue;
//	}

}
