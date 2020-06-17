package student_igors_mihejevs.lesson_x.p_it.domain;

import java.util.ArrayList;
import java.util.List;

public class PolicyObject {

	private PolicyObjectName policyObjectName;
	private List<PolicySubObject> policySubObjects;

	public PolicyObject(PolicyObjectName policyObjectName) {
		this.policyObjectName = policyObjectName;
		this.policySubObjects = new ArrayList<>();
	}

	public void addPolicySubObject(PolicySubObject policySubObject) {
		this.policySubObjects.add(policySubObject);
	}

	public PolicyObjectName getPolicyObjectName() {
		return policyObjectName;
	}

	public List<PolicySubObject> getPolicySubObjects() {
		return policySubObjects;
	}

}
