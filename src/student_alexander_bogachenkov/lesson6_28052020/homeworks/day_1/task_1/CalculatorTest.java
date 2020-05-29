package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_1.task_1;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenTest();
    }

    public void isEvenTest() {
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(8);

        if (actualResult == expectedResult) {
            System.out.println("isEvenTest PASSED");
        } else {
            System.out.println("isEvenTest FAILED");
        }
    }

}
