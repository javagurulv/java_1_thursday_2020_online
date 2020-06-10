package student_igors_mihejevs.pc.business_logic;

import student_igors_mihejevs.pc.domain.PolicyObject;
import student_igors_mihejevs.pc.domain.PolicyObjectType;
import student_igors_mihejevs.pc.domain.PolicyRisk;
import student_igors_mihejevs.pc.domain.PolicySubObject;

import java.math.BigDecimal;
import java.util.List;

public class FireRiskCoefficientDetector {

	private static final BigDecimal STANDARD_FIRE_RISK_COEF = new BigDecimal("0.14");
	private static final BigDecimal OVERPRICED_FIRE_RISK_COEF = new BigDecimal("0.24");
	private static final BigDecimal PRICE_BORDER = new BigDecimal("100.00");

	public BigDecimal detect(PolicyObject policyObject) {
		if (PolicyObjectType.APARTMENT == policyObject.getPolicyObjectType()) {
			return new BigDecimal("0.02");
		}
		if (PolicyObjectType.HOUSE == policyObject.getPolicyObjectType()) {
			return new BigDecimal("0.05");
		}
		throw new IllegalArgumentException("Insurance object type not supported! " + policyObject.getPolicyObjectType());
	}

	public BigDecimal detect(List<PolicySubObject> policySubObjects) {
		BigDecimal sumOfInsuredObjectsFromFire = policySubObjects.stream()
				.filter(subInsuranceObject -> subInsuranceObject.isInsuredFrom(PolicyRisk.FIRE))
				.map(PolicySubObject::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		if (sumOfInsuredObjectsFromFire.compareTo(PRICE_BORDER) < 0) {
			return STANDARD_FIRE_RISK_COEF;
		} else {
			return OVERPRICED_FIRE_RISK_COEF;
		}
	}

}