package student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.tests;

import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.businesslogic.InsurancePolicyPremiumCalculator;
import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.InsuranceObject;
import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.InsuranceObjectType;
import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.InsuranceRisk;
import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.Policy;

import java.math.BigDecimal;

public class InsurancePolicyPremiumCalculatorTest {

	private InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();

	public static void main(String[] args) {
		InsurancePolicyPremiumCalculatorTest test = new InsurancePolicyPremiumCalculatorTest();
		test.testPolicyForOneInsuranceObject();
	}

	public void testPolicyForOneInsuranceObject() {
		InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("100000.00"));
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
