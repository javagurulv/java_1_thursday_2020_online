package student_igors_mihejevs.lesson_6.homework.level_x.from_viktor.v1.tests;

import student_igors_mihejevs.lesson_6.homework.level_x.from_viktor.v1.businesslogic.InsurancePolicyPremiumCalculator;
import student_igors_mihejevs.lesson_6.homework.level_x.from_viktor.v1.domain.House;
import student_igors_mihejevs.lesson_6.homework.level_x.from_viktor.v1.domain.InsuranceObject;
import student_igors_mihejevs.lesson_6.homework.level_x.from_viktor.v1.domain.InsuranceRisk;
import student_igors_mihejevs.lesson_6.homework.level_x.from_viktor.v1.domain.Policy;

import java.math.BigDecimal;

public class InsurancePolicyPremiumCalculatorTest {

	private InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();

	public static void main(String[] args) {
		InsurancePolicyPremiumCalculatorTest test = new InsurancePolicyPremiumCalculatorTest();
		test.testPolicyForOneInsuranceObject();
	}

	public void testPolicyForOneInsuranceObject() {
		InsuranceObject house = new House(new BigDecimal("100000.00"));
		house.addInsuranceRisk(InsuranceRisk.FIRE);

		Policy policy = new Policy();
		policy.addInsuranceObject(house);

		BigDecimal premium = insurancePolicyPremiumCalculator.calculate(policy);
		if (premium.compareTo(new BigDecimal("5000.00")) == 0) {
			System.out.println("OK!");
		} else {
			System.out.println("FAIL!");
		}
	}

}
