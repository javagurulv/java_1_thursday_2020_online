package student_aleksey_kodin.lesson7.dayx.supertask2_7.businesslogic;

import student_aleksey_kodin.lesson7.dayx.supertask2_7.domain.InsuranceObject;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.domain.Policy;

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