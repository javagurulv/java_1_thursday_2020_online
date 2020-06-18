package student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.businesslogic;

import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.InsuranceObject;
import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.InsuranceRisk;

import java.math.BigDecimal;

public class InsuranceObjectPremiumCalculator {

	private SubInsuranceObjectsPremiumCalculator subInsuranceObjectsPremiumCalculator = new SubInsuranceObjectsPremiumCalculator();
	private FireRiskCoeficientDetector fireRiskCoeficientDetector = new FireRiskCoeficientDetector();
	private TheftRiskCoeficientDetector theftRiskCoeficientDetector = new TheftRiskCoeficientDetector();
	private FloodRiskCoeficientDetector floodRiskCoeficientDetector = new FloodRiskCoeficientDetector();

	public BigDecimal calculate(InsuranceObject insuranceObject) {
		BigDecimal insuranceObjectRiskPremium = calculatePremiumForInsuranceObjectItself(insuranceObject);
		BigDecimal subInsuranceObjectRiskPremium = subInsuranceObjectsPremiumCalculator.calculate(insuranceObject);
		return insuranceObjectRiskPremium.add(subInsuranceObjectRiskPremium);
	}

	private BigDecimal calculatePremiumForInsuranceObjectItself(InsuranceObject insuranceObject) {
		return insuranceObject.getInsuranceRisks().stream()
				.map(insuranceRisk -> calculateInsuranceObjectRiskPremium(insuranceObject, insuranceRisk))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}

	private BigDecimal calculateInsuranceObjectRiskPremium(InsuranceObject insuranceObject,
                                                           InsuranceRisk insuranceRisk) {
		BigDecimal coeficient = getCoeficient(insuranceRisk, insuranceObject);
		return insuranceObject.getCadastralValue().multiply(coeficient);
	}

	private BigDecimal getCoeficient(InsuranceRisk insuranceRisk,
                                     InsuranceObject insuranceObject) {
		if (InsuranceRisk.FIRE == insuranceRisk) {
			return fireRiskCoeficientDetector.detect(insuranceObject);
		}
		if (InsuranceRisk.THEFT == insuranceRisk) {
			return theftRiskCoeficientDetector.detect(insuranceObject);
		}
		if (InsuranceRisk.FLOOD == insuranceRisk) {
			return floodRiskCoeficientDetector.detect(insuranceObject);
		}
		throw new IllegalArgumentException("Insurance risk not supported! " + insuranceRisk);
	}

}
