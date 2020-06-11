package student_julija_skopeca.practical_tasks.lesson_6.day_1.task_1_CaculatorBooleanisEven;

class CalculatorTestBoolean  {

    public static void main(String[] args) {
        CalculatorTestBoolean calculatorTest = new CalculatorTestBoolean();
        calculatorTest.isEvenBooleanTestEven();
        calculatorTest.isEvenBooleanTestOdd();
        calculatorTest.isEvenBooleanTestOddNegative();
        calculatorTest.isEvenBooleanTestEvenNegative();
    }

    public void isEvenBooleanTestEven() {
        int number = 10;
        CalculatorBoolean calculator = new CalculatorBoolean();
        boolean result = calculator.isEven(number);
        if (result == true) {
            System.out.println("isEvenBooleanTestEven test = OK");
        } else {
            System.out.println("isEvenBooleanTestEven test = FAIL");
        }
    }

    public void isEvenBooleanTestOdd() {
        int number = 9;
        CalculatorBoolean calculator = new CalculatorBoolean();
        boolean result = calculator.isEven(number);
        if (result == false) {
            System.out.println("isEvenBooleanTestOdd test = OK");
        } else {
            System.out.println("isEvenBooleanTestOdd test = FAIL");
        }
    }

    public void isEvenBooleanTestOddNegative() {
        int number = -9;
        CalculatorBoolean calculator = new CalculatorBoolean();
        boolean result = calculator.isEven(number);
        if (result == false) {
            System.out.println("isEvenBooleanTestOddNegative test = OK");
        } else {
            System.out.println("isEvenBooleanTestOddNegative test = FAIL");
        }
    }

    public void isEvenBooleanTestEvenNegative() {
        int number = -10;
        CalculatorBoolean calculator = new CalculatorBoolean();
        boolean result = calculator.isEven(number);
        if (result == true) {
            System.out.println("isEvenBooleanTestEvenNegative test = OK");
        } else {
            System.out.println("isEvenBooleanTestEvenNegative test = FAIL");
        }
    }


}