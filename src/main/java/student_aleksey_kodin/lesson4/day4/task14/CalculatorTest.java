package student_aleksey_kodin.lesson4.day4.task14;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        System.out.println();
        calculatorTest.isEvenTest(40);
        System.out.println();
        calculatorTest.maxOfTwoNumbersTest(10,5);
        calculatorTest.maxOfTwoNumbersTest(15,85);
        calculatorTest.maxOfTwoNumbersTest(50,50);
    }
    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 75) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        if (result == 20) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        if (result == 25) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }
    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
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
    public void maxOfTwoNumbersTest(int testFirstValue, int testSecondValue) {
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(testFirstValue,testSecondValue);
        if (result == testFirstValue && result == testSecondValue) {
            System.out.println("maxOfTwoNumbersTest test - The numbers is equals = OK");
        } else if (result == testFirstValue) {
            System.out.println("maxOfTwoNumbersTest test - First value bigger = OK");
        } else {
            System.out.println("maxOfTwoNumbersTest test - Second value bigger = OK");
        }
    }
}
