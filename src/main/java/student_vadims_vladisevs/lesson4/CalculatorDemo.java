package student_vadims_vladisevs.lesson4;

import java.util.Scanner;

class CalculatorDemo {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int firstNumber = scr.nextInt();
        int secondNumber = scr.nextInt();

        Calculator test = new Calculator();

        int result = test.sum(firstNumber, secondNumber);

        System.out.println("Result: " + result);

    }
}
