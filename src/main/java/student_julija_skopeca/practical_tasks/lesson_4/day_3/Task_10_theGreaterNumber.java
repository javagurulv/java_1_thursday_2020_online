package student_julija_skopeca.practical_tasks.lesson_4.day_3;

import java.util.Scanner;

class Task_10_theGreaterNumber {

    public static void main(String[] args) {

        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();

        System.out.println("Enter the second number");
        int number2 = sc.nextInt();

        System.out.println("Enter the third number");
        int number3 = sc.nextInt();

        //number1 > number2 > number3
        //number1 > number2 < number3

        if ((number1 > number2) && (number1 > number3) ) {
            System.out.println("The biggest number is " + number1);
        }

        //number1 < number2 > number3

        else if (number2 > number3) {
            System.out.println("The biggest number is " + number2);
        }
        //number1 < number2 < number3
        else {
            System.out.println("The biggest number is " + number3);
        }
    }
}
