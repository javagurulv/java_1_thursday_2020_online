package student_igors_mihejevs.lesson_x.p_it.domain;

import java.util.ArrayList;
import java.util.List;

public class Policy {

	private String policyNumber;
	private PolicyStatus policyStatus;
	private List<PolicyObject> policyObjects = new ArrayList<>();

	public Policy(String policyNumber, PolicyStatus policyStatus) {
		this.policyNumber = policyNumber;
		this.policyStatus = policyStatus;
	}

	public void addPolicyObject(PolicyObject policyObject) {
		this.policyObjects.add(policyObject);
	}

	public List<PolicyObject> getPolicyObjects() {
		return this.policyObjects;
	}

}
