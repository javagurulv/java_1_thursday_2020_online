package student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask3;

import student_aleksey_kodin.lesson7.dayx.supertask2_7.businesslogic.SubInsuranceObjectsPremiumCalculator;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.domain.*;

import java.math.BigDecimal;

class TestSubInsuranceObjectsPremiumCalculator {


    public static void main(String[] args) {
        TestSubInsuranceObjectsPremiumCalculator test = new TestSubInsuranceObjectsPremiumCalculator();
        test.testSubInsuranceObjectFireDefaultCoefficient();
        test.testSubInsuranceObjectFireOverpricedCoefficient();
        test.testSubInsuranceObjectTheftDefaultCoefficient();
        test.testSubInsuranceObjectTheftOverpricedCoefficient();
    }

    private void testSubInsuranceObjectFireDefaultCoefficient() {
        SubInsuranceObjectsPremiumCalculator subInsuranceObjectsPremiumCalculator = new SubInsuranceObjectsPremiumCalculator();
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.FLAT,new BigDecimal("0"));

        SubInsuranceObject phone = new SubInsuranceObject("Phone_1", new BigDecimal("500"));
        phone.addInsuranceRisk(InsuranceRisk.FIRE);
        insuranceObject.addSubInsuranceObject(phone);

        printTestResult( subInsuranceObjectsPremiumCalculator.calculate(insuranceObject).compareTo(new BigDecimal("15.00")) == 0,"SubObject calculate fire premium less 2000");
    }
    private void testSubInsuranceObjectFireOverpricedCoefficient() {
        SubInsuranceObjectsPremiumCalculator subInsuranceObjectsPremiumCalculator = new SubInsuranceObjectsPremiumCalculator();
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.FLAT,new BigDecimal("0"));

        SubInsuranceObject phone = new SubInsuranceObject("Phone_1", new BigDecimal("2500"));
        phone.addInsuranceRisk(InsuranceRisk.FIRE);
        insuranceObject.addSubInsuranceObject(phone);

        printTestResult( subInsuranceObjectsPremiumCalculator.calculate(insuranceObject).compareTo(new BigDecimal("100.00")) == 0,"SubObject calculate fire premium more 2000");
    }
    private void testSubInsuranceObjectTheftDefaultCoefficient() {
        SubInsuranceObjectsPremiumCalculator subInsuranceObjectsPremiumCalculator = new SubInsuranceObjectsPremiumCalculator();
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.FLAT,new BigDecimal("0"));

        SubInsuranceObject phone = new SubInsuranceObject("Phone_1", new BigDecimal("500"));
        phone.addInsuranceRisk(InsuranceRisk.THEFT);
        insuranceObject.addSubInsuranceObject(phone);

        printTestResult( subInsuranceObjectsPremiumCalculator.calculate(insuranceObject).compareTo(new BigDecimal("5.00")) == 0,"SubObject calculate theft premium less 2000");
    }
    private void testSubInsuranceObjectTheftOverpricedCoefficient() {
        SubInsuranceObjectsPremiumCalculator subInsuranceObjectsPremiumCalculator = new SubInsuranceObjectsPremiumCalculator();
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.FLAT,new BigDecimal("0"));

        SubInsuranceObject phone = new SubInsuranceObject("Phone_1", new BigDecimal("2500"));
        phone.addInsuranceRisk(InsuranceRisk.THEFT);
        insuranceObject.addSubInsuranceObject(phone);

        printTestResult( subInsuranceObjectsPremiumCalculator.calculate(insuranceObject).compareTo(new BigDecimal("50.00")) == 0,"SubObject calculate theft premium more 2000");
    }

    private void printTestResult(boolean isResultOk,String testName) {
        if (isResultOk) {
            System.out.println("SubInsuranceObjectsPremiumCalculator test - " + testName + " = OK");
        } else {
            System.out.println("SubInsuranceObjectsPremiumCalculator test - " + testName + " = FAIL");
        }
    }
}
