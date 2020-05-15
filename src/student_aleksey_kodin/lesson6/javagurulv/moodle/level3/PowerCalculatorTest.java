package student_aleksey_kodin.lesson6.javagurulv.moodle.level3;

import java.math.BigInteger;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();

            System.out.println("Test loop method:");
            BigInteger result = powerCalculator.exponentiation(5,4);
            System.out.println("PowerCalculator test - 5 ^ 4 = " + result);
                 if (result.equals(BigInteger.valueOf(625))) {
                    System.out.println("PowerCalculator test - 5 ^ 4 = " + result + " OK");
                 } else {
                     System.out.println("PowerCalculator test - 5 ^ 4 = " + result + " FAIL");
                 }
            powerCalculatorTest.testDegreeZero();
            powerCalculatorTest.testDegreeOne();
            System.out.println("Test recursion method:");
            BigInteger resultRecursion = powerCalculator.exponentiationRecursion(5,4);
            System.out.println("PowerCalculator test - 5 ^ 4 = " + resultRecursion);
                if (resultRecursion.equals(BigInteger.valueOf(625))) {
                    System.out.println("PowerCalculator test - 5 ^ 4 = " + resultRecursion + " OK");
                } else {
                    System.out.println("PowerCalculator test - 5 ^ 4 = " + resultRecursion + " FAIL");
                }
            powerCalculatorTest.testDegreeZeroRecursion();
            powerCalculatorTest.testDegreeOneRecursion();
    }
    void testDegreeZero() {
        PowerCalculator powerCalculator = new PowerCalculator();
        BigInteger result = powerCalculator.exponentiation(2,0);
        if (result.equals(BigInteger.valueOf(1))) {
            System.out.println("PowerCalculator test - 2 ^ 0 = " + result + " OK");
        } else {
            System.out.println("PowerCalculator test - 2 ^ 0 = " + result + " FAIL");
        }
    }
    void testDegreeOne() {
        PowerCalculator powerCalculator = new PowerCalculator();
        BigInteger result = powerCalculator.exponentiation(2,1);
        if (result.equals(BigInteger.valueOf(2))) {
            System.out.println("PowerCalculator test - 2 ^ 1 = " + result + " OK");
        } else {
            System.out.println("PowerCalculator test - 2 ^ 1 = " + result + " FAIL");
        }
    }
    void testDegreeZeroRecursion() {
        PowerCalculator powerCalculator = new PowerCalculator();
        BigInteger result = powerCalculator.exponentiationRecursion(2,0);
        if (result.equals(BigInteger.valueOf(1))) {
            System.out.println("PowerCalculator test - 2 ^ 0 = " + result + " OK");
        } else {
            System.out.println("PowerCalculator test - 2 ^ 0 = " + result + " FAIL");
        }
    }
    void testDegreeOneRecursion() {
        PowerCalculator powerCalculator = new PowerCalculator();
        BigInteger result = powerCalculator.exponentiationRecursion(2,1);
        if (result.equals(BigInteger.valueOf(2))) {
            System.out.println("PowerCalculator test - 2 ^ 1 = " + result + " OK");
        } else {
            System.out.println("PowerCalculator test - 2 ^ 1 = " + result + " FAIL");
        }
    }
}
