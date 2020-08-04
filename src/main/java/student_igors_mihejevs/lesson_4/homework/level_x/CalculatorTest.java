package student_igors_mihejevs.lesson_4.homework.level_x;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest(40);
    }
    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        boolean result = true;
        Calculator calculator = new Calculator();
        if (calculator.sum(firstNumber, secondNumber) != 75) result = false;
        resultVerification("Sum", result);
    }
    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        boolean result = true;
        Calculator calculator = new Calculator();
        if (calculator.sub(firstNumber, secondNumber) != 20) result = false;
        resultVerification("Sub", result);
    }
    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        boolean result = true;
        Calculator calculator = new Calculator();
        if (calculator.mul(firstNumber, secondNumber) != 25) result = false;
        resultVerification("Mul", result);
    }
    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        boolean result = true;
        Calculator calculator = new Calculator();
        if (calculator.div(firstNumber, secondNumber) != 5) result = false;
        resultVerification("Div", result);
    }
    public void isEvenTest(int testValue) {
        Calculator calculator = new Calculator();
        resultVerification("isEven", calculator.isEven(testValue));
    }
    public void resultVerification (String testName, boolean result) {
        if (result) System.out.println(testName + " test = OK");
        else System.out.println(testName + " test = FAIL");
    }

}
