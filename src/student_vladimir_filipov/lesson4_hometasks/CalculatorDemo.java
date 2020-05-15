package student_vladimir_filipov.lesson4_hometasks;

import java.util.Scanner;

class CalculatorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        System.out.println("Result = " + result);

    }
}
