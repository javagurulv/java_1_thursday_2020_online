package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtrTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
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
        int firstNumber = 12;
        int secondNumber = 4;
        int expectedResult = 16;

        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("sumTest passed");
        } else {
            System.out.println("sumTest failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void subtrTest() {
        int firstNumber = 12;
        int secondNumber = 4;
        int expectedResult = 8;

        Calculator calculator = new Calculator();
        int actualResult = calculator.subtr(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("subtrTest passed");
        } else {
            System.out.println("subtrTest failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void multTest() {
        int firstNumber = 12;
        int secondNumber = 4;
        int expectedResult = 48;

        Calculator calculator = new Calculator();
        int actualResult = calculator.mult(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("multTest passed");
        } else {
            System.out.println("multTest failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void divTest() {
        int firstNumber = 12;
        int secondNumber = 4;
        int expectedResult = 3;

        Calculator calculator = new Calculator();
        int actualResult = calculator.div(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("divTest passed");
        } else {
            System.out.println("divTest failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void isEvenTest() {
        int number = 6;
        boolean expectedResult = true;

        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(number);

        if (actualResult == expectedResult) {
            System.out.println("isEvenTest passed");
        } else {
            System.out.println("isEvenTest failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void maxOfTwoNumbersTest1() {
        int firstNumber = 33;
        int secondNumber = 15;
        int expectedResult = 33;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest1 passed");
        } else {
            System.out.println("maxOfTwoNumbersTest1 failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 12;
        int secondNumber = 34;
        int expectedResult = 34;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest2 passed");
        } else {
            System.out.println("maxOfTwoNumbersTest2 failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void maxOfTwoNumbersTest3() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfTwoNumbersTest3 passed");
        } else {
            System.out.println("maxOfTwoNumbersTest3 failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void maxOfThreeNumbersTest1() {
        int firstNumber = 33;
        int secondNumber = 15;
        int thirdNumber = 8;
        int expectedResult = 33;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfThreeNumbersTest1 passed");
        } else {
            System.out.println("maxOfThreeNumbersTest1 failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void maxOfThreeNumbersTest2() {
        int firstNumber = 15;
        int secondNumber = 33;
        int thirdNumber = 8;
        int expectedResult = 33;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfThreeNumbersTest2 passed");
        } else {
            System.out.println("maxOfThreeNumbersTest2 failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void maxOfThreeNumbersTest3() {
        int firstNumber = 15;
        int secondNumber = 8;
        int thirdNumber = 33;
        int expectedResult = 33;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfThreeNumbersTest3 passed");
        } else {
            System.out.println("maxOfThreeNumbersTest3 failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void maxOfThreeNumbersTest4() {
        int firstNumber = 15;
        int secondNumber = 15;
        int thirdNumber = 8;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfThreeNumbersTest4 passed");
        } else {
            System.out.println("maxOfThreeNumbersTest4 failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void maxOfThreeNumbersTest5() {
        int firstNumber = 8;
        int secondNumber = 15;
        int thirdNumber = 15;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfThreeNumbersTest5 passed");
        } else {
            System.out.println("maxOfThreeNumbersTest5 failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void maxOfThreeNumbersTest6() {
        int firstNumber = 15;
        int secondNumber = 8;
        int thirdNumber = 15;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfThreeNumbersTest6 passed");
        } else {
            System.out.println("maxOfThreeNumbersTest6 failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }

    public void maxOfThreeNumbersTest7() {
        int firstNumber = 15;
        int secondNumber = 15;
        int thirdNumber = 15;
        int expectedResult = 15;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (actualResult == expectedResult) {
            System.out.println("maxOfThreeNumbersTest7 passed");
        } else {
            System.out.println("maxOfThreeNumbersTest7 failed");
            System.out.println("Expected result: " + expectedResult);
            System.out.println("Actual result: " + actualResult);
        }
    }
}
