package student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask6.test;

import student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask6.businesslogic.InsurancePolicyPremiumCalculator;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask6.domain.InsuranceObject;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask6.domain.InsuranceObjectType;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask6.domain.InsuranceRisk;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask6.domain.Policy;

import java.math.BigDecimal;

public class TestFloodRisk {
    public static void main(String[] args) {
        TestFloodRisk test = new TestFloodRisk();

        test.testFloodPolicyForHouseInsuranceObject();
        test.testFloodPolicyForFlatInsuranceObject();
        test.testFloodPolicyForTwoInsuranceObject();
    }

    private void testFloodPolicyForHouseInsuranceObject() {
        InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("100000.00"));
        house.addInsuranceRisk(InsuranceRisk.FLOOD);

        Policy policy = new Policy();
        policy.addInsuranceObject(house);

        printTestResult( insurancePolicyPremiumCalculator.calculate(policy).compareTo(new BigDecimal("200.00")) == 0,"One Object calculate house flood premium");
    }
    private void testFloodPolicyForFlatInsuranceObject() {
        InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();
        InsuranceObject flat = new InsuranceObject(InsuranceObjectType.FLAT, new BigDecimal("25000.00"));
        flat.addInsuranceRisk(InsuranceRisk.FLOOD);

        Policy policy = new Policy();
        policy.addInsuranceObject(flat);

        printTestResult( insurancePolicyPremiumCalculator.calculate(policy).compareTo(new BigDecimal("25.00")) == 0,"One Object calculate flat flood premium");
    }
    private void testFloodPolicyForTwoInsuranceObject() {
        InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();
        InsuranceObject flat = new InsuranceObject(InsuranceObjectType.FLAT, new BigDecimal("25000.00"));
        flat.addInsuranceRisk(InsuranceRisk.FLOOD);
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("100000.00"));
        house.addInsuranceRisk(InsuranceRisk.FLOOD);

        Policy policy = new Policy();
        policy.addInsuranceObject(flat);
        policy.addInsuranceObject(house);

        printTestResult( insurancePolicyPremiumCalculator.calculate(policy).compareTo(new BigDecimal("225.00")) == 0,"One Object calculate flat & house flood premium");
    }

    private void printTestResult(boolean isResultOk,String testName) {
        if (isResultOk) {
            System.out.println("SubInsuranceObjectsPremiumCalculator test - " + testName + " = OK");
        } else {
            System.out.println("SubInsuranceObjectsPremiumCalculator test - " + testName + " = FAIL");
        }
    }
}
