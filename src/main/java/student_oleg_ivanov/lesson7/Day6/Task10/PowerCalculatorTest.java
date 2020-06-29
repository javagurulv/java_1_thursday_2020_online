package student_oleg_ivanov.lesson7.Day6.Task10;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.exponentiationTest1();
        powerCalculatorTest.exponentiationTest2();
        powerCalculatorTest.exponentiationTest3();

    }
    public void exponentiationTest1(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.calculator(2, 2);
        if(result == 4){
            System.out.println("Exponentiation Test is OK");
        } else {
            System.out.println("Exponentiation Test is Fail!");
        }
    }
    public void exponentiationTest2(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.calculator(3, 2);
        if(result == 9){
            System.out.println("Exponentiation Test is OK");
        } else {
            System.out.println("Exponentiation Test is Fail!");
        }
    }
    public void exponentiationTest3(){
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.calculator(10, 2);
        if(result == 100){
            System.out.println("Exponentiation Test is OK");
        } else {
            System.out.println("Exponentiation Test is Fail!");
        }
    }
}
