package student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask4;

import student_aleksey_kodin.lesson7.dayx.supertask2_7.businesslogic.InsuranceObjectPremiumCalculator;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.domain.InsuranceObject;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.domain.InsuranceObjectType;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.domain.InsuranceRisk;

import java.math.BigDecimal;

class TestInsuranceObjectPremiumCalculator {

    public static void main(String[] args) {
        TestInsuranceObjectPremiumCalculator test = new TestInsuranceObjectPremiumCalculator();

        test.testInsuranceObjectFireFlat();
        test.testInsuranceObjectTheftFlat();
        test.testInsuranceObjectFireHouse();
        test.testInsuranceObjectTheftHouse();
    }


    private void testInsuranceObjectFireFlat() {
        InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator = new InsuranceObjectPremiumCalculator();
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.FLAT,new BigDecimal("25000.00"));
        insuranceObject.addInsuranceRisk(InsuranceRisk.FIRE);

        printTestResult( insuranceObjectPremiumCalculator.calculate(insuranceObject).compareTo(new BigDecimal("500.00")) == 0,"Object calculate flat fire premium");
    }
    private void testInsuranceObjectTheftFlat() {
        InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator = new InsuranceObjectPremiumCalculator();
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.FLAT,new BigDecimal("25000.00"));
        insuranceObject.addInsuranceRisk(InsuranceRisk.THEFT);

        printTestResult( insuranceObjectPremiumCalculator.calculate(insuranceObject).compareTo(new BigDecimal("250.00")) == 0,"Object calculate flat theft premium");
    }
    private void testInsuranceObjectFireHouse() {
        InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator = new InsuranceObjectPremiumCalculator();
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.HOUSE,new BigDecimal("75000.00"));
        insuranceObject.addInsuranceRisk(InsuranceRisk.FIRE);

        printTestResult( insuranceObjectPremiumCalculator.calculate(insuranceObject).compareTo(new BigDecimal("3750.00")) == 0,"Object calculate house fire premium");
    }
    private void testInsuranceObjectTheftHouse() {
        InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator = new InsuranceObjectPremiumCalculator();
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.HOUSE,new BigDecimal("75000.00"));
        insuranceObject.addInsuranceRisk(InsuranceRisk.THEFT);

        printTestResult( insuranceObjectPremiumCalculator.calculate(insuranceObject).compareTo(new BigDecimal("1500.00")) == 0,"Object calculate house theft premium");
    }
    private void printTestResult(boolean isResultOk,String testName) {
        if (isResultOk) {
            System.out.println("SubInsuranceObjectsPremiumCalculator test - " + testName + " = OK");
        } else {
            System.out.println("SubInsuranceObjectsPremiumCalculator test - " + testName + " = FAIL");
        }
    }
}
