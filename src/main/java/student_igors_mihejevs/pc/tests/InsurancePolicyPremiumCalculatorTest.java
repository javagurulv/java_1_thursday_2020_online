package student_igors_mihejevs.pc.tests;

import student_igors_mihejevs.pc.business_logic.PremiumCalculator;
import student_igors_mihejevs.pc.domain.PolicyObject;
import student_igors_mihejevs.pc.domain.PolicyObjectType;
import student_igors_mihejevs.pc.domain.PolicyRisk;
import student_igors_mihejevs.pc.domain.Policy;

import java.math.BigDecimal;

public class InsurancePolicyPremiumCalculatorTest {

	private PremiumCalculator premiumCalculator = new PremiumCalculator();

	public static void main(String[] args) {
		InsurancePolicyPremiumCalculatorTest test = new InsurancePolicyPremiumCalculatorTest();
		test.testPolicyForOneInsuranceObject();
	}

	public void testPolicyForOneInsuranceObject() {
		PolicyObject house = new PolicyObject(PolicyObjectType.HOUSE, new BigDecimal("100000.00"));
		house.addPolicyRisk(PolicyRisk.FIRE);

		Policy policy = new Policy();
		policy.addPolicyObject(house);

		BigDecimal premium = premiumCalculator.calculate(policy);
		if (premium.compareTo(new BigDecimal("0.00")) == 0) {
			System.out.println("OK!");
		} else {
			System.out.println("FAIL!");
		}
	}

}
