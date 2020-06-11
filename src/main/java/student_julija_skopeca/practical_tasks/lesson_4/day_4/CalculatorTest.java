package student_julija_skopeca.practical_tasks.lesson_4.day_4;

class CalculatorTest {

    public static void main (String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.diffTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersFistNumberTest();
        calculatorTest.maxOfTwoNumbersSecondNumberTest();
        calculatorTest.maxOfTwoSimilarNumbersTest();
        calculatorTest.maxOfTheeNumFirstBiggerTest();
        calculatorTest.maxOfTheeNumSecondBiggerTest();
        calculatorTest.maxOfTheeNumThirdBiggerTest();
        calculatorTest.maxOfTheeNumTwoSimilarV1Test();
        calculatorTest.maxOfTheeNumTwoSimilarV2Test();
        calculatorTest.maxOfTheeNumTwoSimilarV3Test();
        calculatorTest.maxOfTheeNumTwoSimilarV4Test();
        calculatorTest.maxOfTheeNumTwoSimilarV5Test();
        calculatorTest.maxOfTheeNumTwoSimilarV6Test();
        calculatorTest.maxOfTheeAllSimilarTest();
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

    public void diffTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.diff(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mult(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result == true) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersFistNumberTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("maxOfTwoNumbersFistNumber test = OK");
        } else {
            System.out.println("maxOfTwoNumbersFistNumber test = FAIL");
        }
    }

    public void maxOfTwoNumbersSecondNumberTest() {
        int firstNumber = 1;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("maxOfTwoNumbersSecondNumber test = OK");
        } else {
            System.out.println("maxOfTwoNumbersSecondNumber test = FAIL");
        }
    }

    public void maxOfTwoSimilarNumbersTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("maxOfTwoSimilarNumbers = OK");
        } else {
            System.out.println("maxOfTwoSimilarNumbers = FAIL");
        }
    }

    //- 1>2>3
    public void maxOfTheeNumFirstBiggerTest() {
        int firstNumber = 11;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 11) {
            System.out.println("maxOfTheeNumFirstBigger = OK");
        } else {
            System.out.println("maxOfTheeNumFirstBigger = FAIL");
        }
    }

    //- 1<2>3
    public void maxOfTheeNumSecondBiggerTest() {
        int firstNumber = 1;
        int secondNumber = 22;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 22) {
            System.out.println("maxOfTheeNumSecondBigger = OK");
        } else {
            System.out.println("maxOfTheeNumSecondBigger = FAIL");
        }
    }
    //- 1<2<3
    public void maxOfTheeNumThirdBiggerTest() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 33;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 33) {
            System.out.println("maxOfTheeNumThirdBigger = OK");
        } else {
            System.out.println("maxOfTheeNumThirdBigger = FAIL");
        }
    }
    //- 1=2>3
    public void maxOfTheeNumTwoSimilarV1Test() {
        int firstNumber = 12;
        int secondNumber = 12;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 12) {
            System.out.println("maxOfTheeNumTwoSimilarV1 = OK");
        } else {
            System.out.println("maxOfTheeNumTwoSimilarV1 = FAIL");
        }
    }
    //- 1=2<3
    public void maxOfTheeNumTwoSimilarV2Test() {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 12) {
            System.out.println("maxOfTheeNumTwoSimilarV2 = OK");
        } else {
            System.out.println("maxOfTheeNumTwoSimilarV2 = FAIL");
        }
    }
    //- 1>2=3
    public void maxOfTheeNumTwoSimilarV3Test() {
        int firstNumber = 111;
        int secondNumber = 23;
        int thirdNumber = 23;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 111) {
            System.out.println("maxOfTheeNumTwoSimilarV3 = OK");
        } else {
            System.out.println("maxOfTheeNumTwoSimilarV3 = FAIL");
        }
    }
    //- 1<2=3
    public void maxOfTheeNumTwoSimilarV4Test() {
        int firstNumber = 11;
        int secondNumber = 23;
        int thirdNumber = 23;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 23) {
            System.out.println("maxOfTheeNumTwoSimilarV4 = OK");
        } else {
            System.out.println("maxOfTheeNumTwoSimilarV4 = FAIL");
        }
    }
    //- 1=3>2
    public void maxOfTheeNumTwoSimilarV5Test() {
        int firstNumber = 13;
        int secondNumber = 2;
        int thirdNumber = 13;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 13) {
            System.out.println("maxOfTheeNumTwoSimilarV5 = OK");
        } else {
            System.out.println("maxOfTheeNumTwoSimilarV5 = FAIL");
        }
    }
    //- 1=3<2
    public void maxOfTheeNumTwoSimilarV6Test() {
        int firstNumber = 13;
        int secondNumber = 22;
        int thirdNumber = 13;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 22) {
            System.out.println("maxOfTheeNumTwoSimilarV6 = OK");
        } else {
            System.out.println("maxOfTheeNumTwoSimilarV6 = FAIL");
        }
    }
    //- 1=2=3
    public void maxOfTheeAllSimilarTest() {
        int firstNumber = 13;
        int secondNumber = 13;
        int thirdNumber = 13;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 13) {
            System.out.println("maxOfTheeAllSimilar = OK");
        } else {
            System.out.println("maxOfTheeAllSimilar = FAIL");
        }
    }




}
