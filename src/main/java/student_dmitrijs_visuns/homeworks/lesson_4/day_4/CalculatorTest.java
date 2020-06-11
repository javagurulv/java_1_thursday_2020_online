package student_dmitrijs_visuns.homeworks.lesson_4.day_4;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.divideTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();
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

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtract(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divideTest() {
        int firstNumber = 20;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.divide(firstNumber, secondNumber);
        if (result == 4) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEvenTest() {
        int firstNumber = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        if (result == true) {
            System.out.println("Even number test = OK");
        } else {
            System.out.println("Even number test = FAIL");
        }
    }


    public void maxOfTwoNumbersTest1() {
        int firstNumber = 5;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("Max Of Two Numbers test, case 1 (first number is bigger) - OK");
        } else {
            System.out.println("Max Of Two Numbers test, case 1 (first number is bigger) - FAIL");
        }
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 3;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == secondNumber) {
            System.out.println("Max Of Two Numbers test, case 2 (second number is bigger) - OK");
        } else {
            System.out.println("Max Of Two Numbers test, case 2 (second number is bigger) - FAIL");
        }

    }


    public void maxOfTwoNumbersTest3() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if ((result == firstNumber) && (result == secondNumber)) {
            System.out.println("Max Of Two Numbers test, case 3 (numbers are equals) - OK");
        } else {
            System.out.println("Max Of Two Numbers test, case 3 (numbers are equals) - FAIL");
        }
    }

    public void maxOfThreeNumbersTest1() {
        int firstNumber = 5;
        int secondNumber = 3;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("Max Of Three Numbers test, case 1 (1st is bigger than 2nd & 3rd) - OK");
        } else {
            System.out.println("Max Of Three Numbers test, case 1 (1st is bigger than 2nd & 3rd) - FAIL");
        }
    }

    public void maxOfThreeNumbersTest2() {
        int firstNumber = 1;
        int secondNumber = 5;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == secondNumber) {
            System.out.println("Max Of Three Numbers test, case 2 (2nd is bigger than 1st & 3rd) - OK");
        } else {
            System.out.println("Max Of Three Numbers test, case 2 (2nd is bigger than 1st & 3rd) - FAIL");
        }
    }

    public void maxOfThreeNumbersTest3() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == thirdNumber) {
            System.out.println("Max Of Three Numbers test, case 3 (3rd is bigger than 1st & 2nd) - OK");
        } else {
            System.out.println("Max Of Three Numbers test, case 3 (3rd is bigger than 1st & 2nd) - FAIL");
        }
    }

    public void maxOfThreeNumbersTest4() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if ((result == firstNumber) && (firstNumber == secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("Max Of Three Numbers test, case 4 (1st & 2nd are equals, bigger than 3rd) - OK");
        } else {
            System.out.println("Max Of Three Numbers test, case 4 (1st & 2nd are equals, bigger than 3rd) - FAIL");
        }
    }


    public void maxOfThreeNumbersTest5() {
        int firstNumber = 1;
        int secondNumber = 5;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if ((result == secondNumber) && (secondNumber == thirdNumber) && (secondNumber > firstNumber)) {
            System.out.println("Max Of Three Numbers test, case 5 (2nd & 3rd are equals, bigger than 1st) - OK");
        } else {
            System.out.println("Max Of Three Numbers test, case 5 (2nd & 3rd are equals, bigger than 1st) - FAIL");
        }
    }


    public void maxOfThreeNumbersTest6() {
        int firstNumber = 5;
        int secondNumber = 1;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if ((result == firstNumber) && (firstNumber == thirdNumber) && (firstNumber > secondNumber)) {
            System.out.println("Max Of Three Numbers test, case 6 (1st & 3rd are equals, bigger than 2nd) - OK");
        } else {
            System.out.println("Max Of Three Numbers test, case 6 (1st & 3rd are equals, bigger than 2nd) - FAIL");
        }
    }


    public void maxOfThreeNumbersTest7() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {
            System.out.println("Max Of Three Numbers test, case 7 (all three numbers are equals) - OK");
        } else {
            System.out.println("Max Of Three Numbers test, case 7 (all three numbers are equals) - FAIL");
        }
    }

}


