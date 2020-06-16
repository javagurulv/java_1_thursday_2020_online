package student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask5;

import student_aleksey_kodin.lesson7.dayx.supertask2_7.businesslogic.InsurancePolicyPremiumCalculator;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.domain.InsuranceObject;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.domain.InsuranceObjectType;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.domain.InsuranceRisk;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.domain.Policy;

import java.math.BigDecimal;

class TestInsurancePolicyPremiumCalculator {

    public static void main(String[] args) {
        TestInsurancePolicyPremiumCalculator test = new TestInsurancePolicyPremiumCalculator();
        test.testFirePolicyForOneInsuranceObject();
        test.testFirePolicyForTwoInsuranceObject();
        test.testTheftPolicyForTwoInsuranceObject();
        test.testTheftPolicyForOneInsuranceObject();
    }

    public void testFirePolicyForOneInsuranceObject() {
        InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("100000.00"));
        house.addInsuranceRisk(InsuranceRisk.FIRE);

        Policy policy = new Policy();
        policy.addInsuranceObject(house);

        printTestResult( insurancePolicyPremiumCalculator.calculate(policy).compareTo(new BigDecimal("5000.00")) == 0,"One Object calculate house fire premium");

    }
    public void testFirePolicyForTwoInsuranceObject() {
        InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("100000.00"));
        house.addInsuranceRisk(InsuranceRisk.FIRE);

        InsuranceObject flat = new InsuranceObject(InsuranceObjectType.FLAT, new BigDecimal("25000.00"));
        flat.addInsuranceRisk(InsuranceRisk.FIRE);

        Policy policy = new Policy();
        policy.addInsuranceObject(house);
        policy.addInsuranceObject(flat);

        printTestResult( insurancePolicyPremiumCalculator.calculate(policy).compareTo(new BigDecimal("5500.00")) == 0,"Two Object calculate house & flat fire premium");

    }
    public void testTheftPolicyForTwoInsuranceObject() {
        InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("100000.00"));
        house.addInsuranceRisk(InsuranceRisk.THEFT);

        InsuranceObject flat = new InsuranceObject(InsuranceObjectType.FLAT, new BigDecimal("25000.00"));
        flat.addInsuranceRisk(InsuranceRisk.THEFT);

        Policy policy = new Policy();
        policy.addInsuranceObject(house);
        policy.addInsuranceObject(flat);

        printTestResult( insurancePolicyPremiumCalculator.calculate(policy).compareTo(new BigDecimal("2250.00")) == 0,"Two Object calculate house & flat theft premium");
    }
    public void testTheftPolicyForOneInsuranceObject() {
        InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("100000.00"));
        house.addInsuranceRisk(InsuranceRisk.THEFT);

        Policy policy = new Policy();
        policy.addInsuranceObject(house);

        printTestResult( insurancePolicyPremiumCalculator.calculate(policy).compareTo(new BigDecimal("2000.00")) == 0,"One Object calculate house theft premium");
    }

    private void printTestResult(boolean isResultOk,String testName) {
        if (isResultOk) {
            System.out.println("SubInsuranceObjectsPremiumCalculator test - " + testName + " = OK");
        } else {
            System.out.println("SubInsuranceObjectsPremiumCalculator test - " + testName + " = FAIL");
        }
    }
}
