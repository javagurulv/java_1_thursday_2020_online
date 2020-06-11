package student_aleksey_kodin.lesson7.day6.task10;

import java.math.BigDecimal;
import java.math.BigInteger;

class PowerCalculatorTest {
    private final PowerCalculator powerCalculator = new PowerCalculator();
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();

            powerCalculatorTest.testExponentiationPositiveDegree();
            powerCalculatorTest.testExponentiationNegativeDegree();
            powerCalculatorTest.testDegreeZero();
            powerCalculatorTest.testDegreeOne();
    }
    void testExponentiationPositiveDegree() {
        BigDecimal result = powerCalculator.exponentiation(new BigDecimal(5),4);
        System.out.println("PowerCalculator test - 5 ^ 4 = " + result);
        printTestResult(result.compareTo(new BigDecimal("625")) == 0.,"Exponentiation positive degree");
    }
    void testExponentiationNegativeDegree() {
        BigDecimal result = powerCalculator.exponentiation(new BigDecimal(5),-4);
        System.out.println("PowerCalculator test - 5 ^ -4 = " + result);
        printTestResult(result.compareTo(new BigDecimal("0.0016")) == 0.,"Exponentiation negative degree");
    }
    void testDegreeZero() {
        PowerCalculator powerCalculator = new PowerCalculator();
        BigDecimal result = powerCalculator.exponentiation(new BigDecimal(2),0);
        printTestResult(result.compareTo(new BigDecimal("1")) == 0,"Degree zero");
    }
    void testDegreeOne() {
        PowerCalculator powerCalculator = new PowerCalculator();
        BigDecimal result = powerCalculator.exponentiation(new BigDecimal(2),1);
        printTestResult(result.compareTo(new BigDecimal("2")) == 0,"Degree one");
    }
    private void printTestResult(boolean isResultOk,String result) {
        if (isResultOk) {
            System.out.println("PowerCalculator test - " + result + " = OK");
        } else {
            System.out.println("PowerCalculator test - " + result + " = FAIL");
        }
    }
}
