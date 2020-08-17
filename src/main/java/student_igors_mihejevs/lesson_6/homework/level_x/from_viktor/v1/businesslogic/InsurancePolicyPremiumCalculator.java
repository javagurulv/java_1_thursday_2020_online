package student_igors_mihejevs.lesson_6.homework.level_x.from_viktor.v1.businesslogic;

import student_igors_mihejevs.lesson_6.homework.level_x.from_viktor.v1.domain.InsuranceObject;
import student_igors_mihejevs.lesson_6.homework.level_x.from_viktor.v1.domain.Policy;

import java.math.BigDecimal;

public class InsurancePolicyPremiumCalculator {

	private InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator
			= new InsuranceObjectPremiumCalculator();

	public BigDecimal calculate(Policy policy) {
		BigDecimal premium = BigDecimal.ZERO;
		for (InsuranceObject insuranceObject : policy.getInsuranceObjects()) {
			BigDecimal insuranceObjectPremium = insuranceObjectPremiumCalculator.calculate(insuranceObject);
			premium = premium.add(insuranceObjectPremium);
		}
		return premium;
	}

}