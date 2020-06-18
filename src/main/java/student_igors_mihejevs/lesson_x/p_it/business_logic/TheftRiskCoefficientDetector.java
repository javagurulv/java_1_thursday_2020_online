package student_igors_mihejevs.lesson_x.p_it.business_logic;

import student_igors_mihejevs.lesson_x.p_it.domain.RiskType;
import student_igors_mihejevs.lesson_x.p_it.domain.PolicySubObject;

import java.math.BigDecimal;
import java.util.List;

public class TheftRiskCoefficientDetector {

	private static final BigDecimal STANDARD_THEFT_RISK_COEF = new BigDecimal("0.11");
	private static final BigDecimal OVERPRICED_THEFT_RISK_COEF = new BigDecimal("0.05");
	private static final BigDecimal PRICE_BORDER = new BigDecimal("15.00");

	public BigDecimal detect(List<PolicySubObject> policySubObjects) {
		BigDecimal sumOfInsuredObjectsFromTheft = policySubObjects.stream()
				.filter(policySubObject -> policySubObject.isInsuredFrom(RiskType.THEFT))
				.map(PolicySubObject::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		if (sumOfInsuredObjectsFromTheft.compareTo(PRICE_BORDER) < 0) {
			return STANDARD_THEFT_RISK_COEF;
		} else {
			return OVERPRICED_THEFT_RISK_COEF;
		}
	}

}
