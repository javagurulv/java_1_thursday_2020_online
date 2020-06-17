package student_vadim_sokolenko.Lesson2;

import java.util.Scanner;

class Calculator1Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();


        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        System.out.println("Result=" + result);



    }
}
