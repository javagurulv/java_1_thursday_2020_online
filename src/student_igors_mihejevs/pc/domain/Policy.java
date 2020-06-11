package student_igors_mihejevs.pc.domain;

import java.util.ArrayList;
import java.util.List;

public class Policy {

	private String policyNumber;
	private String policyStatus;
	private List<PolicyObject> policyObjects = new ArrayList<>();

	public void addPolicyObject(PolicyObject policyObject) {
		this.policyObjects.add(policyObject);
	}

	public List<PolicyObject> getPolicyObjects() {
		return this.policyObjects;
	}

}
