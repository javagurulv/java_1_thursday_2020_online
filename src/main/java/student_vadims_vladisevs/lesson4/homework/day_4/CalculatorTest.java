package student_vadims_vladisevs.lesson4.homework.day_4;

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calcTest = new CalculatorTest();
        calcTest.sumTest();
        calcTest.difTest();
        calcTest.divTest();
        calcTest.multiTest();
        calcTest.evenTest();
        calcTest.maxOfTwoNumbersTestSecondNumberIsMax();
        calcTest.maxOfTwoNumbersTestFirstNumberIsMax();
        calcTest.maxOfTwoNumbersTestNumbersAreEquals();
        calcTest.maxOfThreeNumbersTestFirstIsMax();
        calcTest.maxOfThreeNumbersTestSecondIsMax();
        calcTest.maxOfThreeNumbersTestThirdIsMax();
        calcTest.maxOfThreeNumbersTestFirstAndSecondAreEquals();
        calcTest.maxOfThreeNumbersTestFirstAndThirdAreEquals();
        calcTest.maxOfThreeNumbersTestSecondAndThirdAreEquals();
        calcTest.maxOfThreeNumbersTestNumbersAreEquals();



    }

    public void maxOfThreeNumbersTestNumbersAreEquals() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;

        Calculator calc = new Calculator();
        int result = calc.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if ((result == firstNumber) && (result == secondNumber) && (result == thirdNumber)) {
            System.out.println("Max of three numbers(all numbers are equals) test = OK");
        } else {
            System.out.println("Max of three numbers(all numbers are equals) test = FAIL");
        }

    }


    public void maxOfThreeNumbersTestSecondAndThirdAreEquals() {
        int firstNumber = 3;
        int secondNumber = 10;
        int thirdNumber = 10;

        Calculator calc = new Calculator();
        int result = calc.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if ((result == thirdNumber) && (result == secondNumber)) {
            System.out.println("Max of three numbers(third = second > first) test = OK");
        } else {
            System.out.println("Max of three numbers(third = second > first) test = FAIL");
        }

    }



    public void maxOfThreeNumbersTestFirstAndThirdAreEquals() {
        int firstNumber = 10;
        int secondNumber = 4;
        int thirdNumber = 10;

        Calculator calc = new Calculator();
        int result = calc.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if ((result == firstNumber) && (result == thirdNumber)) {
            System.out.println("Max of three numbers(first = third > second) test = OK");
        } else {
            System.out.println("Max of three numbers(first = third > second) test = FAIL");
        }

    }


    public void maxOfThreeNumbersTestFirstAndSecondAreEquals() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 3;

        Calculator calc = new Calculator();
        int result = calc.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if ((result == firstNumber) && (result == secondNumber)) {
            System.out.println("Max of three numbers(first = second > third) test = OK");
        } else {
            System.out.println("Max of three numbers(first = second > third) test = FAIL");
        }

    }



    public void maxOfThreeNumbersTestThirdIsMax() {
        int firstNumber = 5;
        int secondNumber = 4;
        int thirdNumber = 10;

        Calculator calc = new Calculator();
        int result = calc.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == thirdNumber) {
            System.out.println("Max of three numbers(third number is max) test = OK");
        } else {
            System.out.println("Max of three numbers(third numbers is max) test = FAIL");
        }

    }


    public void maxOfThreeNumbersTestSecondIsMax() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 3;

        Calculator calc = new Calculator();
        int result = calc.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == secondNumber) {
            System.out.println("Max of three numbers(second number is max) test = OK");
        } else {
            System.out.println("Max of three numbers(second numbers is max) test = FAIL");
        }

    }


    public void maxOfThreeNumbersTestFirstIsMax() {
        int firstNumber = 10;
        int secondNumber = 4;
        int thirdNumber = 3;

        Calculator calc = new Calculator();
        int result = calc.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (result == firstNumber) {
            System.out.println("Max of three numbers(first number is max) test = OK");
        } else {
            System.out.println("Max of three numbers(first numbers is max) test = FAIL");
        }

    }


    public void maxOfTwoNumbersTestNumbersAreEquals(){
        int firstNumber = 5;
        int secondNumber = 5;

        Calculator calc = new Calculator();
        int result = calc.maxOfTwoNumbers(firstNumber, secondNumber);

        if ((result == firstNumber) && (result == secondNumber)) {
            System.out.println("Max of two numbers(numbers are equals) test = OK");
        } else {
            System.out.println("Max of two numbers(numbers are equals) test = FAIL");
        }
    }


    public void maxOfTwoNumbersTestFirstNumberIsMax() {
        int firstNumber = 10;
        int secondNumber = 5;

        Calculator calc = new Calculator();
        int result = calc.maxOfTwoNumbers(firstNumber, secondNumber);

        if (result == firstNumber) {
            System.out.println("Max of two numbers(first number is greater) test = OK");
        } else {
            System.out.println("Max of two numbers(first number is greater) test = FAIL");
        }
    }

        public void maxOfTwoNumbersTestSecondNumberIsMax(){
        int firstNumber = 5;
        int secondNumber = 10;

        Calculator calc = new Calculator();
        int result = calc.maxOfTwoNumbers(firstNumber, secondNumber);

        if (result == secondNumber){
            System.out.println("Max of two numbers(second number is greater) test = OK");
        }
        else {
            System.out.println("Max of two numbers(second number is greater) test = FAIL");
        }


    }

    public void evenTest(){
        int number = 2;

        Calculator calc = new Calculator();
        boolean result = calc.isEven(number);

        if (result){
            System.out.println("Even test = OK");
        }
        else {
            System.out.println("Even test = FAIL");
        }


    }

    public void multiTest (){
        double firstNumber = 5.0;
        int secondNumber = 10;

        Calculator calc = new Calculator();
        double result = calc.multiResult(firstNumber, secondNumber);
        if (result == 50){
            System.out.println("Multiplication test = OK");
        }
        else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divTest (){
        double firstNumber = 5.0;
        int secondNumber = 10;

        Calculator calc = new Calculator();
        double result = calc.divResult(firstNumber, secondNumber);
        if (result == 0.5){
            System.out.println("Divided test = OK");
        }
        else {
            System.out.println("Divided test = FAIL");
        }
    }

    public void difTest (){
        int firstNumber = 5;
        int secondNumber = 10;

        Calculator calc = new Calculator();
        int result = calc.difResult(firstNumber, secondNumber);
        if (result == -5){
            System.out.println("Difference test = OK");
        }
        else {
            System.out.println("Difference test = FAIL");
        }
    }

    public void sumTest (){
        int firstNumber = 5;
        int secondNumber = 10;

        Calculator calc = new Calculator();
        int result = calc.sumResult(firstNumber, secondNumber);
        if (result == 15){
            System.out.println("Sum test = OK");
        }
        else {
            System.out.println("Sum test = FAIL");
        }
    }

}
