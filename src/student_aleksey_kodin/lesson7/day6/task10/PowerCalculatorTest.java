package student_aleksey_kodin.lesson7.day6.task10;

import java.math.BigInteger;

class PowerCalculatorTest {
    private final PowerCalculator powerCalculator = new PowerCalculator();
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();

            powerCalculatorTest.testExponentiation();
            powerCalculatorTest.testDegreeZero();
            powerCalculatorTest.testDegreeOne();
    }
    void testExponentiation() {
        BigInteger result = powerCalculator.exponentiation(5,4);
        System.out.println("PowerCalculator test - 5 ^ 4 = " + result);
        printTestResult(result.equals(BigInteger.valueOf(625)),"Exponentiation");
    }
    void testDegreeZero() {
        PowerCalculator powerCalculator = new PowerCalculator();
        BigInteger result = powerCalculator.exponentiation(2,0);
        printTestResult(result.equals(BigInteger.valueOf(1)),"Degree zero");
    }
    void testDegreeOne() {
        PowerCalculator powerCalculator = new PowerCalculator();
        BigInteger result = powerCalculator.exponentiation(2,1);
        printTestResult(result.equals(BigInteger.valueOf(2)),"Degree one");
    }
    private void printTestResult(boolean isResultOk,String result) {
        if (isResultOk) {
            System.out.println("PowerCalculator test - " + result + " = OK");
        } else {
            System.out.println("PowerCalculator test - " + result + " = FAIL");
        }
    }
}
