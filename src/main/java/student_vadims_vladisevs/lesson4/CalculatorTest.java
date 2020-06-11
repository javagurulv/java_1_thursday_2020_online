package student_vadims_vladisevs.lesson4;

class CalculatorTest {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();

    }
    public static void test1(){
        int firstNumber = -10;
        int secondNumber = -3;

        Calculator test = new Calculator();
        int actualResult = test.sum(firstNumber, secondNumber);

        if (actualResult == -13){
            System.out.println("Test1 COMPLETE!");
        }
        else {
            System.out.println("Test1 failed");
        }

    }

    public static void test2(){
        int firstNumber = 0;
        int secondNumber = 0;

        Calculator test = new Calculator();
        int actualResult = test.sum(firstNumber, secondNumber);

        if (actualResult == 0){
            System.out.println("Test2 COMPLETE!");
        }
        else {
            System.out.println("Test2 failed");
        }

    }

    public static void test3(){
        int firstNumber = 0;
        int secondNumber = 20;

        Calculator test = new Calculator();
        int actualResult = test.sum(firstNumber, secondNumber);

        if (actualResult == 20){
            System.out.println("Test3 COMPLETE!");
        }
        else {
            System.out.println("Test3 failed");
        }

    }

    public static void test4(){
        int firstNumber = 10;
        int secondNumber = 20;

        Calculator test = new Calculator();
        int actualResult = test.sum(firstNumber, secondNumber);

        if (actualResult == 30) {
            System.out.println("Test4 COMPLETE!");
        }
        else {
            System.out.println("Test4 failed");
        }

    }
}
