package teacher.lesson_7.lessoncode.insurancecalculator.v2.businesslogic;

import java.math.BigDecimal;

import teacher.lesson_7.lessoncode.insurancecalculator.v2.domain.InsuranceObject;
import teacher.lesson_7.lessoncode.insurancecalculator.v2.domain.Policy;

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