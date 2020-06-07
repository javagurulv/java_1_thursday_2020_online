package student_julija_skopeca.practical_tasks.lesson_4.day_1;

import java.util.Scanner;

class Task_4_positiveNegative {

    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();

        if (number1 % 2 == 0) {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }
    }
}
