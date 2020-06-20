package student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.businesslogic;

import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.InsuranceObject;
import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.InsuranceObjectType;
import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.InsuranceRisk;
import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.SubInsuranceObject;

import java.math.BigDecimal;
import java.util.List;

public class FireRiskCoeficientDetector {

	private static final BigDecimal STANDARD_FIRE_RISK_COEF = new BigDecimal("0.03");
	private static final BigDecimal OVERPRICED_FIRE_RISK_COEF = new BigDecimal("0.04");
	private static final BigDecimal PRICE_BORDER = new BigDecimal("2000.00");

	public BigDecimal detect(InsuranceObject insuranceObject) {
		if (InsuranceObjectType.FLAT == insuranceObject.getInsuranceObjectType()) {
			return new BigDecimal("0.02");
		}
		if (InsuranceObjectType.HOUSE == insuranceObject.getInsuranceObjectType()) {
			return new BigDecimal("0.05");
		}
		throw new IllegalArgumentException("Insurance object type not supported! " + insuranceObject.getInsuranceObjectType());
	}

	public BigDecimal detect(List<SubInsuranceObject> subInsuranceObjects) {
		BigDecimal sumOfInsuredObjectsFromFire = subInsuranceObjects.stream()
				.filter(subInsuranceObject -> subInsuranceObject.isInsuredFrom(InsuranceRisk.FIRE))
				.map(SubInsuranceObject::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		if (sumOfInsuredObjectsFromFire.compareTo(PRICE_BORDER) < 0) {
			return STANDARD_FIRE_RISK_COEF;
		} else {
			return OVERPRICED_FIRE_RISK_COEF;
		}
	}

}