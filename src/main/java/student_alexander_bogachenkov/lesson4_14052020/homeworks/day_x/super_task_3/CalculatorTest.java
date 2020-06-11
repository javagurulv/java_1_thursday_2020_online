package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_x.super_task_3;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest(40);
    }

    public void resultChecking(int actualResult, int expectedResult) {
        if (actualResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        CalculatorTest test = new CalculatorTest();
        test.resultChecking(result, 75);
    }
    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        CalculatorTest test = new CalculatorTest();
        test.resultChecking(result, 20);
    }
    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        CalculatorTest test = new CalculatorTest();
        test.resultChecking(result, 25);
    }
    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        CalculatorTest test = new CalculatorTest();
        test.resultChecking(result, 5);
    }
    public void isEvenTest(int testValue) {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(testValue);
        if (result) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }
}