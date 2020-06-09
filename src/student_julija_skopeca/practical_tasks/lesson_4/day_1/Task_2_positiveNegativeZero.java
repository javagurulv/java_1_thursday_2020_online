package student_julija_skopeca.practical_tasks.lesson_4.day_1;

import java.util.Scanner;

class Task_2_positiveNegativeZero {

    public static void main(String[] args) {

        System.out.println("Please a number");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();

        if (number1 > 0) {
            System.out.println("The number is positive");
        }
        else if (number1 == 0) {
            System.out.println("The number is zero");
        }
        else {
            System.out.println("The number is negative");
        }

    }
}
