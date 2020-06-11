package student_oleg_ivanov.lesson4.homeWorkDay4;


class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.differenceTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.evenNumberTest();
        calculatorTest.evenNumberTest2();
        calculatorTest.maxOfTwoNumberAreEqualsTest();
        calculatorTest.maxOfTwoNumberTest1();
        calculatorTest.maxOfTwoNumberTest2();
        calculatorTest.maxOfThreeNumberTest1();
        calculatorTest.maxOfThreeNumberTest2();
        calculatorTest.maxOfThreeNumberTest3();
        calculatorTest.maxOfThreeNumberTest4();
        calculatorTest.maxOfThreeNumberTest5();
        calculatorTest.maxOfThreeNumberTest6();
        calculatorTest.maxOfThreeNumberTest7();
    }

    public void sumTest() {
        int firstNumber = 40;
        int secondNumber = 20;

        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);

        if (result == 60) {
            System.out.println("Test sum = OK");
        } else {
            System.out.println("Test sum = Fail");
        }
    }

    public void differenceTest() {
        int firstNumber = 40;
        int secondNumber = 20;

        Calculator calculator = new Calculator();
        int result = calculator.difference(firstNumber, secondNumber);
        if (result == 20) {
            System.out.println("Test difference = OK");
        } else {
            System.out.println("Test difference = Fail");
        }
    }

    public void divisionTest() {
        int firsNumber = 40;
        int secondNumber = 20;

        Calculator calculator = new Calculator();
        int result = calculator.division(firsNumber, secondNumber);
        if (result == 2) {
            System.out.println("Test division = OK");
        } else {
            System.out.println("Test division = Fail");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 40;
        int secondNumber = 20;

        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == 800) {
            System.out.println("Test multiplication = OK");
        } else {
            System.out.println("Test multiplication = Fail");
        }
    }

    public void evenNumberTest() {
        int firstNumber = 40;

        Calculator calculator = new Calculator();
        boolean result = calculator.isEvenNumber(firstNumber);
        if (result) {
            System.out.println(firstNumber + " is even number");
        } else {
            System.out.println(firstNumber + " is odd number");
        }

    }

    public void evenNumberTest2() {
        int secondNumber = 20;

        Calculator calculator = new Calculator();
        boolean result = calculator.isEvenNumber2(secondNumber);
        if (result) {
            System.out.println(secondNumber + " is even number");
        } else {
            System.out.println(secondNumber + " is odd number");
        }
    }
    public void maxOfTwoNumberAreEqualsTest() {
        int firstNumber = 40;
        int secondNumber = 40;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if ((result == firstNumber) && (result == secondNumber)) {
            System.out.println("The number are equal, test OK");
        } else {
            System.out.println("The number not equal, test Fail ");
        }
    }
    public void maxOfTwoNumberTest1() {
        int firstNumber =30;
        int secondNumber = 20;

        Calculator calculator= new Calculator();
        int result = calculator.maxOfTwoNumbersTest1(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("The first number is largest about second number. Test OK ");
        } else {
            System.out.println("The first number is not largest about second numberTest Fail");
        }
    }
    public void maxOfTwoNumberTest2 (){
        int firstNumber = 20;
        int secondNumber = 40;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbersTest2(firstNumber, secondNumber);
        if (result == secondNumber) {
            System.out.println("The second number is largest about first number. Test OK");
        } else {
            System.out.println("The second number is not largest about first number.Test Fail");
        }
    }
    public  void maxOfThreeNumberTest1 () {
        // first number > second number & third number
        int firsNumber = 30;
        int secondNumber = 20;
        int thirdNumber = 10;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbersTest(firsNumber, secondNumber, thirdNumber);
        if (result == firsNumber) {
            System.out.println("The largest number is first and = " + result +
                    ". Bigger number of three test1 - OK");
        } else {
            System.out.println("Bigger number of three test1 = FAIL");
        }
    }
    public void maxOfThreeNumberTest2 () {
        // second number > first number & third number
        int firsNumber = 30;
        int secondNumber = 60;
        int thirdNumber = 10;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbersTest(firsNumber, secondNumber, thirdNumber);
        if (result == secondNumber) {
            System.out.println("The largest number is second and = " + result +
                    ". Bigger number of three test2 - OK");
        } else {
            System.out.println("Bigger number of three test2 = FAIL");

        }
    }
    public void maxOfThreeNumberTest3 () {
        // third number > first number & second number
        int firsNumber = 30;
        int secondNumber = 60;
        int thirdNumber = 70;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbersTest(firsNumber, secondNumber, thirdNumber);
        if (result == thirdNumber) {
            System.out.println("The largest number is second and = " + result +
                    ". Bigger number of three test3 - OK");
        } else {
            System.out.println("Bigger number of three test3 = FAIL");
        }
    }
    public void maxOfThreeNumberTest4 () {
        // firs number = second number > third number
        int firsNumber = 30;
        int secondNumber = 30;
        int thirdNumber = 20;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbersTest(firsNumber, secondNumber, thirdNumber);
        if (result == firsNumber) {
            System.out.println("The firs and second number are equals and largest abots third number test4 - OK");
        } else {
            System.out.println("test4 = FAIL");
        }
    }
    public void maxOfThreeNumberTest5 () {
        // second number = third number > firs number
        int firsNumber = 30;
        int secondNumber = 40;
        int thirdNumber = 40;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbersTest(firsNumber, secondNumber, thirdNumber);
        if (result == thirdNumber) {
            System.out.println("The third and second number are equals and largest abouts first number test5 - OK");
        } else {
            System.out.println("test5 = FAIL");
        }
    }
    public void maxOfThreeNumberTest6 () {
        // first number = third number > second number
        int firsNumber = 40;
        int secondNumber = 30;
        int thirdNumber = 40;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbersTest(firsNumber, secondNumber, thirdNumber);
        if (result == firsNumber) {
            System.out.println("The third and first number are equals and largest abouts second number test6 - OK");
        } else {
            System.out.println("test6 = FAIL");
        }
    }
    public void maxOfThreeNumberTest7 () {
        // first number = third number = second number
        int firsNumber = 40;
        int secondNumber = 40;
        int thirdNumber = 40;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbersTest(firsNumber, secondNumber, thirdNumber);
        if (result == thirdNumber) {
            System.out.println("The firs, second and third numbers are equals test7 - OK");
        } else {
            System.out.println("test7 = FAIL");
        }
    }
}