package student_igors_mihejevs.lesson_x.p_it.business_logic;

import student_igors_mihejevs.lesson_x.p_it.domain.PolicyObject;
import student_igors_mihejevs.lesson_x.p_it.domain.RiskType;
import student_igors_mihejevs.lesson_x.p_it.domain.PolicySubObject;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class SubObjectsPremiumCalculator {

	private FireRiskCoefficientDetector fireRiskCoefficientDetector = new FireRiskCoefficientDetector();
	private TheftRiskCoefficientDetector theftRiskCoefficientDetector = new TheftRiskCoefficientDetector();

	public BigDecimal calculate(PolicyObject policyObject) {
		Set<RiskType> subObjectRisks = identifyAllRisksForSubObjects(policyObject);
		BigDecimal subInsuranceObjectRiskPremium = BigDecimal.ZERO;
		for (RiskType riskType : subObjectRisks) {
			BigDecimal subObjectPriceForRisk = calculatePriceSumForSubObjectWithRisk(policyObject, riskType);
			BigDecimal coefficient = getCoefficientForSubInsuranceObjects(riskType, policyObject);
			subInsuranceObjectRiskPremium = subInsuranceObjectRiskPremium.add(subObjectPriceForRisk.multiply(coefficient));
		}
		return subInsuranceObjectRiskPremium;
	}

	private BigDecimal calculatePriceSumForSubObjectWithRisk(PolicyObject policyObject,
                                                             RiskType riskType) {
		return policyObject.getPolicySubObjects().stream()
				.filter(subInsuranceObject -> subInsuranceObject.isInsuredFrom(riskType))
				.map(PolicySubObject::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	private BigDecimal getCoefficientForSubInsuranceObjects(RiskType riskType,
															PolicyObject policyObject) {
		if (RiskType.FIRE == riskType) {
			return fireRiskCoefficientDetector.detect(policyObject.getPolicySubObjects());
		}
		if (RiskType.THEFT == riskType) {
			return theftRiskCoefficientDetector.detect(policyObject.getPolicySubObjects());
		}
		throw new IllegalArgumentException("Insurance risk not supported! " + riskType);
	}

	private Set<RiskType> identifyAllRisksForSubObjects(PolicyObject policyObject) {
		Set<RiskType> subObjectRisks = new HashSet<>();
		for (PolicySubObject policySubObject : policyObject.getPolicySubObjects()) {
			subObjectRisks.addAll(policySubObject.getPolicyRisks());
		}
		return subObjectRisks;
	}

}