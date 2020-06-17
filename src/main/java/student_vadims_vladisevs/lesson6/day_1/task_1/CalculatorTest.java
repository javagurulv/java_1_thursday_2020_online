package student_vadims_vladisevs.lesson6.day_1.task_1;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calc = new CalculatorTest();
        calc.test();
        calc.testV2();
        // а где негативный тест?
    }


    public void testV2(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(1);
        if (result) {
            System.out.println("Calculator isEven test = FAIL");
        } else {
            System.out.println("Calculator isEven test = OK");
        }
    }


    public void test(){
        Calculator calcTest = new Calculator();

        boolean result = calcTest.isEven(2);

        if (result) {
            System.out.println("Calculator isEven test = OK");
        } else {
            System.out.println("Calculator isEven test = FAIL");
        }
    }
}
