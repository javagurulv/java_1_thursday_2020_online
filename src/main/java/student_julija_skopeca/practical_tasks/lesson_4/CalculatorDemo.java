package student_julija_skopeca.practical_tasks.lesson_4;

import java.util.Scanner;

class CalculatorDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        System.out.println("Result = " + result);

        //test 1: f = -1; s = -3; r = -13
        //test 2: f = 0; s= 0;
    }
}
