package student_vadims_vladisevs.lesson6.day_1.task_1;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calc = new CalculatorTest();
        calc.test();
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
