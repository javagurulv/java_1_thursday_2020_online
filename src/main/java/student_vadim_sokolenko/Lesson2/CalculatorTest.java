package student_vadim_sokolenko.Lesson2;

class CalculatorTest {

    public static void main(String[] args) {

    }

    //Test 1: f = -10: s = -3; r = -13

    public void test1(){
        int firstNumber = -10;
        int secondNumber = -3;
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(firstNumber, secondNumber);

        if (actualResult == -13){
            System.out.println("Test2 = OK");

        }


    }
}
    //Test 2: f = 0: s = 0; r = 0

    //Test 3: f = -10: s = -3; r = -13

    //Test 4: f = -10: s = -3; r = -13