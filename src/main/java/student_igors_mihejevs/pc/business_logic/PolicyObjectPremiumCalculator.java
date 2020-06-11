package student_igors_mihejevs.pc.business_logic;

import student_igors_mihejevs.pc.domain.PolicyObject;
import student_igors_mihejevs.pc.domain.PolicyRisk;

import java.math.BigDecimal;

public class PolicyObjectPremiumCalculator {

	private SubInsuranceObjectsPremiumCalculator subInsuranceObjectsPremiumCalculator
			= new SubInsuranceObjectsPremiumCalculator();
	private FireRiskCoefficientDetector fireRiskCoefficientDetector = new FireRiskCoefficientDetector();
	private TheftRiskCoefficientDetector theftRiskCoefficientDetector = new TheftRiskCoefficientDetector();

	public BigDecimal calculate(PolicyObject policyObject) {
		BigDecimal insuranceObjectRiskPremium = BigDecimal.ZERO;
//		BigDecimal insuranceObjectRiskPremium = calculatePremiumForInsuranceObjectItself(policyObject);
		BigDecimal subInsuranceObjectRiskPremium = subInsuranceObjectsPremiumCalculator.calculate(policyObject);
		return insuranceObjectRiskPremium.add(subInsuranceObjectRiskPremium);
	}
/*
	private BigDecimal calculatePremiumForInsuranceObjectItself(PolicyObject policyObject) {
		BigDecimal insuranceObjectRiskPremium = BigDecimal.ZERO;
		for (PolicyRisk policyRisk : policyObject.getInsuranceRisks()) {
			// calculate premium for each insurance risk
			BigDecimal premium = calculateInsuranceObjectRiskPremium(policyObject, policyRisk);
			insuranceObjectRiskPremium = insuranceObjectRiskPremium.add(premium);
		}
		return insuranceObjectRiskPremium;
	}

	private BigDecimal calculateInsuranceObjectRiskPremium(PolicyObject policyObject,
                                                           PolicyRisk policyRisk) {
		BigDecimal coefficient = policyObject.getRiskCoefficient(policyRisk);
		return policyObject.getCadastralValue().multiply(coefficient);
	}
*/

	private BigDecimal getCoefficient(PolicyRisk policyRisk,
									 PolicyObject policyObject) {
		if (PolicyRisk.FIRE == policyRisk) {
			return fireRiskCoefficientDetector.detect(policyObject);
		}
		if (PolicyRisk.THEFT == policyRisk) {
			return theftRiskCoefficientDetector.detect(policyObject);
		}
		throw new IllegalArgumentException("Insurance risk not supported! " + policyRisk);
	}

}
