package teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.businesslogic;

import java.math.BigDecimal;

import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain.InsuranceObject;
import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain.Policy;

public class InsurancePolicyPremiumCalculator {

	private InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator;

	public InsurancePolicyPremiumCalculator(InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator) {
		this.insuranceObjectPremiumCalculator = insuranceObjectPremiumCalculator;
	}

	public BigDecimal calculate(Policy policy) {
		BigDecimal premium = BigDecimal.ZERO;
		for (InsuranceObject insuranceObject : policy.getInsuranceObjects()) {
			BigDecimal insuranceObjectPremium = insuranceObjectPremiumCalculator.calculate(insuranceObject);
			premium = premium.add(insuranceObjectPremium);
		}
		return premium;
	}

}