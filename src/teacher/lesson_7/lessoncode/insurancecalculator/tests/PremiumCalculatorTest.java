package teacher.lesson_7.lessoncode.insurancecalculator.tests;

import java.math.BigDecimal;

import teacher.lesson_7.lessoncode.insurancecalculator.businesslogic.PolicyPremiumCalculator;
import teacher.lesson_7.lessoncode.insurancecalculator.domain.House;
import teacher.lesson_7.lessoncode.insurancecalculator.domain.InsuranceObject;
import teacher.lesson_7.lessoncode.insurancecalculator.domain.InsuranceRisk;
import teacher.lesson_7.lessoncode.insurancecalculator.domain.Policy;

public class PremiumCalculatorTest {

	private PolicyPremiumCalculator policyPremiumCalculator = new PolicyPremiumCalculator();

	public static void main(String[] args) {
		PremiumCalculatorTest test = new PremiumCalculatorTest();
		test.testPolicyForOneInsuranceObject();
	}

	public void testPolicyForOneInsuranceObject() {
		InsuranceObject house = new House(new BigDecimal("100000.00"));
		house.addInsuranceRisk(InsuranceRisk.FIRE);

		Policy policy = new Policy();
		policy.addInsuranceObject(house);

		BigDecimal premium = policyPremiumCalculator.calculate(policy);
		if (premium.compareTo(new BigDecimal("5000.00")) == 0) {
			System.out.println("OK!");
		} else {
			System.out.println("FAIL!");
		}
	}

}
