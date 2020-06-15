package student_vadim_sokolenko.Lesson4.lesson4Day4Task11_12_13_14_15;



class CalculatorTest {


    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.divideTest();
        calculatorTest.multiplyTest();
        calculatorTest.minus();
        calculatorTest.evenTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest(9, 8, 7);
        calculatorTest.maxOfThreeNumbersTest(9, 10,8);
        calculatorTest.maxOfThreeNumbersTest(9, 8, 10);
        calculatorTest.maxOfThreeNumbersTest(5, 5, 3);
        calculatorTest.maxOfThreeNumbersTest(9, 9, 9);
        calculatorTest.maxOfThreeNumbersTest(8, 9, 9);
        calculatorTest.maxOfThreeNumbersTest(9, 8, 9);
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void minus() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void evenTest() {
        int firstNumber = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        if (result) {
            System.out.println("Even Test = OK");
        } else {
            System.out.println("Even Test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest1() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("Max of two numbers Test1 = OK");
        } else {
            System.out.println("Max of two numbers Test1 = FAIL");
        }
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 10;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == secondNumber) {
            System.out.println("Max of two numbers Test2 = OK");
        } else {
            System.out.println("Max of two numbers Test2 = FAIL");
        }
    }

    public void maxOfTwoNumbersTest3() {
        int firstNumber = 10;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (firstNumber == secondNumber) {
            System.out.println("Max of two numbers Test3 = OK");
        } else {
            System.out.println("Max of two numbers Test3 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest(int firstNumber, int secondNumber, int thirdNumber) {

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if ((result == firstNumber) && (firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("maxOfThreeNumbersTest Test first number is most biggest - OK");
        } else if ((result == secondNumber) && (result > firstNumber) && (result > thirdNumber)) {
            System.out.println("maxOfThreeNumbersTest Test second number is most biggest - OK");
        } else if ((result == thirdNumber) && (result > firstNumber) && (result > secondNumber)) {
            System.out.println("maxOfThreeNumbersTest Test third number is most biggest - OK");
        } else if ((result == firstNumber) && (result == secondNumber) && (result > thirdNumber)) {
            System.out.println("maxOfThreeNumbersTest Test first number and second numbers are equal" +
                    " and bigger then third number - OK");
        } else if ((result == firstNumber) && (result == secondNumber) && (result == thirdNumber)) {
            System.out.println("maxOfThreeNumbersTest all three numbers are equal - OK");
        } else if ((result == secondNumber) && (result == thirdNumber) && (result > firstNumber)) {
            System.out.println("maxOfThreeNumbersTest second and third numbers are equal" +
                    " and bigger then first number - OK");
        } else if ((result == thirdNumber) && (result == firstNumber) && (result > secondNumber)) {
            System.out.println("maxOfThreeNumbersTest third and first numbers are equal" +
                    " and bigger then second number - OK");
        } else {
            System.out.println("maxOfThreeNumbersTest - FAIL!");
        }
    }
}
