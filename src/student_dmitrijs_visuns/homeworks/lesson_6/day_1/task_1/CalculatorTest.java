package student_dmitrijs_visuns.homeworks.lesson_6.day_1.task_1;

class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest newTest = new CalculatorTest();
        newTest.evenNumberTest();
        newTest.oddNumberTest();

    }


    public void evenNumberTest() {
        Calculator calc = new Calculator();
        int number = 4;
        if (calc.isEven(number)) {
            System.out.println("Even number test - OK");
        } else {
            System.out.println("Even number test - FAIL");
        }

    }

    public void oddNumberTest() {
        Calculator calc = new Calculator();
        int number = 5;
        if (calc.isEven(number)) {
            System.out.println("Odd number test - FAIL");
        } else {
            System.out.println("Odd number test - OK");
        }

    }

}
