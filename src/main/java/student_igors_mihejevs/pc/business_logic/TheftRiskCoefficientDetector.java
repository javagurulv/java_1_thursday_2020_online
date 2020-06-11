package student_igors_mihejevs.pc.business_logic;

import student_igors_mihejevs.pc.domain.PolicyObject;
import student_igors_mihejevs.pc.domain.PolicyObjectType;
import student_igors_mihejevs.pc.domain.PolicyRisk;
import student_igors_mihejevs.pc.domain.PolicySubObject;

import java.math.BigDecimal;
import java.util.List;

public class TheftRiskCoefficientDetector {

	private static final BigDecimal STANDARD_THEFT_RISK_COEF = new BigDecimal("0.01");
	private static final BigDecimal OVERPRICED_THEFT_RISK_COEF = new BigDecimal("0.02");
	private static final BigDecimal PRICE_BORDER = new BigDecimal("2000.00");

	public BigDecimal detect(PolicyObject policyObject) {
		if (PolicyObjectType.APARTMENT == policyObject.getPolicyObjectType()) {
			return new BigDecimal("0.01");
		}
		if (PolicyObjectType.HOUSE == policyObject.getPolicyObjectType()) {
			return new BigDecimal("0.02");
		}
		throw new IllegalArgumentException("Insurance object type not supported! " + policyObject.getPolicyObjectType());
	}

	public BigDecimal detect(List<PolicySubObject> policySubObjects) {
		BigDecimal sumOfInsuredObjectsFromTheft = policySubObjects.stream()
				.filter(policySubObject -> policySubObject.isInsuredFrom(PolicyRisk.THEFT))
				.map(PolicySubObject::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		if (sumOfInsuredObjectsFromTheft.compareTo(PRICE_BORDER) < 0) {
			return STANDARD_THEFT_RISK_COEF;
		} else {
			return OVERPRICED_THEFT_RISK_COEF;
		}
	}

}
