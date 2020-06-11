package student_igors_mihejevs.pc.business_logic;

import student_igors_mihejevs.pc.domain.PolicyObject;
import student_igors_mihejevs.pc.domain.PolicyRisk;
import student_igors_mihejevs.pc.domain.PolicySubObject;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class SubInsuranceObjectsPremiumCalculator {

	private static final BigDecimal STANDARD_FIRE_RISK_COEF = new BigDecimal("0.014");
	private static final BigDecimal OVERPRICED_FIRE_RISK_COEF = new BigDecimal("0.024");

	private static final BigDecimal STANDARD_THEFT_RISK_COEF = new BigDecimal("0.11");
	private static final BigDecimal OVERPRICED_THEFT_RISK_COEF = new BigDecimal("0.05");

	private static final BigDecimal PRICE_BORDER_FIRE = new BigDecimal("100.00");
	private static final BigDecimal PRICE_BORDER_THEFT = new BigDecimal("15.00");

	public BigDecimal calculate(PolicyObject policyObject) {
		Set<PolicyRisk> subObjectRisks = identifyAllRisksForSubObjects(policyObject);
		BigDecimal subInsuranceObjectRiskPremium = BigDecimal.ZERO;
		for (PolicyRisk policyRisk : subObjectRisks) {
			BigDecimal subObjectPriceForRisk = calculatePriceSumForSubObjectWithRisk(policyObject, policyRisk);
			BigDecimal coefficient = getRiskCoefficientForSubInsuranceObject(policyRisk, subObjectPriceForRisk);
			subInsuranceObjectRiskPremium = subInsuranceObjectRiskPremium.add(subObjectPriceForRisk.multiply(coefficient));
		}
		return subInsuranceObjectRiskPremium;
	}

	private BigDecimal calculatePriceSumForSubObjectWithRisk(
			PolicyObject policyObject,
			PolicyRisk policyRisk) {
		BigDecimal subObjectPriceForRisk = BigDecimal.ZERO;
		for (PolicySubObject policySubObject : policyObject.getPolicySubObjects()) {
			if (policySubObject.getPolicyRisks().contains(policyRisk)) {
				subObjectPriceForRisk.add(policySubObject.getPrice());
			}
		}
		return subObjectPriceForRisk;
	}

	private Set<PolicyRisk> identifyAllRisksForSubObjects(PolicyObject policyObject) {
		Set<PolicyRisk> subObjectRisks = new HashSet<>();
		for (PolicySubObject policySubObject : policyObject.getPolicySubObjects()) {
			subObjectRisks.addAll(policySubObject.getPolicyRisks());
		}
		return subObjectRisks;
	}

	private BigDecimal getRiskCoefficientForSubInsuranceObject(PolicyRisk policyRisk,
                                                              BigDecimal sum) {
		if (PolicyRisk.FIRE == policyRisk) {
			if (sum.compareTo(PRICE_BORDER_FIRE) < 0) {
				return STANDARD_FIRE_RISK_COEF;
			} else {
				return OVERPRICED_FIRE_RISK_COEF;
			}
		}
		if (PolicyRisk.THEFT == policyRisk) {
			if (sum.compareTo(PRICE_BORDER_THEFT) < 0) {
				return STANDARD_THEFT_RISK_COEF;
			} else {
				return OVERPRICED_THEFT_RISK_COEF;
			}
		}
		throw new IllegalArgumentException("Insurance risk not supported! " + policyRisk);
	}

}