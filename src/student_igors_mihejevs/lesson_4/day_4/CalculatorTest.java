package student_igors_mihejevs.lesson_4.day_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
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

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEvenTest() {
        int firstNumber = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        if (result) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest1() {
        // second number is more than first number
        int firstNumber = 10;
        int secondNumber = 20;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == secondNumber) {
            System.out.println("Second number is bigger. Bigger number of two test1 = OK");
        } else {
            System.out.println("Second number is bigger. Bigger number of two test2 = FAIL");
        }
    }

    public void maxOfTwoNumbersTest2() {
        // first number is more than second number
        int firstNumber = 30;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("First number is bigger. Bigger number of two test2 = OK");
        } else {
            System.out.println("First number is bigger. Bigger number of two test2 = FAIL");
        }
    }

    public void maxOfTwoNumbersTest3() {
        // numbers are equals
        int firstNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, firstNumber);
        if (result == firstNumber) {
            System.out.println("Numbers are equals. Bigger number of two test3 = OK");
        } else {
            System.out.println("Numbers are equals. Bigger number of two test3 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest1() {
        // first number more then second and third
        int firstNumber = 30;
        int secondNumber = 20;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 30) {
            System.out.println("The largest number is first and = " + firstNumber + " Bigger number of three test1 - OK");
        } else {
            System.out.println("Bigger number of three test1 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest2() {
        // second number more then first and third
        int firstNumber = 10;
        int secondNumber = 40;
        int thirdNumber = 20;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 40) {
            System.out.println("The largest number is second and = " + secondNumber +
                               " Bigger number of three test2 - OK");
        } else {
            System.out.println("Bigger number of three test2 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest3() {
        // third number more then first and second
        int firstNumber = 10;
        int secondNumber = 30;
        int thirdNumber = 50;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 50) {
            System.out.println("The largest number is third and = " + thirdNumber +
                    " Bigger number of three test3 - OK");
        } else {
            System.out.println("Bigger number of three test3 = FAIL");
        }
    }

}
