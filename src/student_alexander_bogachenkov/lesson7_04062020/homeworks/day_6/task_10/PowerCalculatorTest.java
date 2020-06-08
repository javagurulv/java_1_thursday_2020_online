package student_alexander_bogachenkov.lesson7_04062020.homeworks.day_6.task_10;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.shouldRaiseToPowerTest1();
        powerCalculatorTest.shouldRaiseToPowerTest2();
    }

    public void shouldRaiseToPowerTest1() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 125;
        int actualResult = powerCalculator.raiseToPower(5,3);

        if (actualResult == expectedResult) {
            System.out.println("shouldRaiseToPower PASSED");
        } else {
            System.out.println("shouldRaiseToPower FAILED");
        }
    }

    public void shouldRaiseToPowerTest2() {
        PowerCalculator powerCalculator = new PowerCalculator();
        int expectedResult = 1;
        int actualResult = powerCalculator.raiseToPower(7,0);

        if (actualResult == expectedResult) {
            System.out.println("shouldRaiseToPower PASSED");
        } else {
            System.out.println("shouldRaiseToPower FAILED");
        }
    }
}
