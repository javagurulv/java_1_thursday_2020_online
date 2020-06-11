package student_julija_skopeca.practical_tasks.lesson_4.day_3;

import java.util.Scanner;

class Task_9_increasingDecreasing {

    public static void main(String[] args) {

        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();

        System.out.println("Enter the second number");
        int number2 = sc.nextInt();

        System.out.println("Enter the third number");
        int number3 = sc.nextInt();

        if ((number1 < number2) && (number2 < number3)) {
            System.out.println("increasing");
        }
        else if ((number1 > number2) && (number2 > number3)) {
            System.out.println("decreasing");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
