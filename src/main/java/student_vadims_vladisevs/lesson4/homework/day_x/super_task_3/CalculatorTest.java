package student_vadims_vladisevs.lesson4.homework.day_x.super_task_3;

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        int firstNumber = 10;
        int secondNumber = 2;
        calculatorTest.sumTest(firstNumber,secondNumber);
        calculatorTest.subTest(firstNumber,secondNumber);
        calculatorTest.mulTest(firstNumber,secondNumber);
        calculatorTest.divTest(firstNumber,secondNumber);
        calculatorTest.isEvenTest(firstNumber);
    }


    public void printTestResult(int expectedResult, int result){
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();

        if (result == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }


    public void sumTest(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        printTestResult(12, result);
    }


    public void subTest(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
         printTestResult(8, result);
    }


    public void mulTest(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        printTestResult(20, result);
    }


    public void divTest(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        printTestResult(5, result);
    }
    public void isEvenTest(int testValue) {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(testValue);

        if (result) {
            System.out.println("isEvenTest = OK");
        } else {
            System.out.println("isEvenTest = FAIL");
        }
    }
}

