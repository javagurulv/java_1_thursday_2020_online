package student_diana_miranovica.lesson6.home_works.day_1.task_1;


 class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenTest();

        // как минимум тут должно быть два теста!
		// положительный и отрицательный.

    }
    public void isEvenTest(){
        int firstNumber =8;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        if (result){
            System.out.println("Even Test = OK");
        }else {
            System.out.println("Even Test = Fail");
        }
    }
}
