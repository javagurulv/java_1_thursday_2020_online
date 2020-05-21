package student_aleksey_kodin.lesson4.dayx.supertask3;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest(35,40);
        calculatorTest.subTest(35,15);
        calculatorTest.mulTest(5,5);
        calculatorTest.divTest(40,8);
        calculatorTest.isEvenTest(40);
    }
    public void sumTest(int firstNumber,int secondNumber) {
        int result = calculator.sum(firstNumber, secondNumber);
            printOperationResult(result == 75,"Sum");
    }
    public void subTest(int firstNumber,int secondNumber) {
        int result = calculator.sub(firstNumber, secondNumber);
            printOperationResult(result == 20,"Sub");
    }
    public void mulTest(int firstNumber,int secondNumber) {
        int result = calculator.mul(firstNumber, secondNumber);
            printOperationResult(result == 25,"Mul");
    }
    public void divTest(int firstNumber,int secondNumber) {
        int result = calculator.div(firstNumber, secondNumber);
            printOperationResult(result == 5,"Div");
    }
    public void isEvenTest(int testValue) {
        boolean result = calculator.isEven(testValue);
            printOperationResult(result,"isEven");
    }
    private void printOperationResult(boolean isResultOk, String operationName) {
        if (isResultOk) {
            System.out.println(operationName + " test = OK");
        } else {
            System.out.println(operationName + " test = FAIL");
        }
    }
}
