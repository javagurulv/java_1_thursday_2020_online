package student_julija_skopeca.practical_tasks.lesson_4.day_2;

import java.util.Scanner;

class Task_6_twoNumbersCompareV2 {

    public static void main(String[] args) {

        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();

        System.out.println("Enter the second number");
        int number2 = sc.nextInt();

        if (number1 < number2) {
            System.out.println("The lower number is " + number1);
        }
        else if (number1 > number2) {
            System.out.println("The lower number is " + number2);
        }
        else {System.out.println("The numbers are similar");}
    }
}
