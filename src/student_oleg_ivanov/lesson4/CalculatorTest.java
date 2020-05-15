package student_oleg_ivanov.lesson4;
class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.test1();
        calculatorTest.test2();
        calculatorTest.test3();
        calculatorTest.test4();
    }


    // Test 1: f = -10; s = -3; r = -13
    public void test1(){
        int firstNumber = -10;
        int secondNumber = -3;

        Calculaor calculaor = new Calculaor();
        int actualResult = calculaor.sum(firstNumber, secondNumber);

        if (actualResult == -13) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }


    // Test 2: f = -0; s = 0; r = 0
    public void test2(){
        int firstNumber = 0;
        int secondNumber = 0;

        Calculaor calculator = new Calculaor();
        int actualResult = calculator.sum(firstNumber, secondNumber);

        if (actualResult == 0) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }


    }
    // Test 3: f = 10; s = 20; r = 30
    public void test3(){
        int firstNumber = 10;
        int secondNumber = 20;

        Calculaor calculator = new Calculaor();
        int actualResult = calculator.sum(firstNumber, secondNumber);

        if (actualResult == 30) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }

    }
    // Test 4: f = 0; s = 20; r = 20
    public void test4(){
        int firstNumber = 0;
        int secondNumber = 20;

        Calculaor calculator = new Calculaor();
        int actualResult = calculator.sum(firstNumber, secondNumber);

        if (actualResult == 20) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }

    }
