package student_oleg_ivanov.lesson6.day1;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEven();
    }
    public void isEven() {
        Calculator number = new Calculator();
        boolean testNumber = number.isEven(10);
        if (testNumber) {
            System.out.println("Test even number is OK");
        } else {
            System.out.println("Test even number is Fail");
        }

    }

}
