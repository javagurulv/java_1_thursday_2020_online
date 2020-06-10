package student_dmitrijs_visuns.homeworks.lesson_7.day_6;

class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest newTest = new PowerCalculatorTest();
        newTest.calculatePositivePowerTest();
        newTest.calculateNegativePowerTest();
        newTest.calculateZeroPowerTest();
    }


    public void calculatePositivePowerTest () {
        PowerCalculator powerCalculator = new PowerCalculator();
        if (powerCalculator.mainCalculator(2,3) == 8) {
            System.out.println("Calculate positive power test - OK");
        } else {
            System.out.println("Calculate positive power test - FAIL");
        }
    }


    public void calculateNegativePowerTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        if (powerCalculator.mainCalculator(10,-1) == 0.1) {
            System.out.println("Calculate negative power test - OK");
        } else {
            System.out.println("Calculate negative power test - FAIL");
        }
    }

    public void calculateZeroPowerTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        if (powerCalculator.mainCalculator(10, 0) == 1) {
            System.out.println("Calculate zero power test - OK");
        } else {
            System.out.println("Calculate zero power test - FAIL");
        }
    }



}
