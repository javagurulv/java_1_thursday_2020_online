package student_julija_skopeca.practical_tasks.lesson_4.day_2;

import java.util.Scanner;

class Task_7_equalsOrDiffrnt {

    public static void main(String[] args) {

        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();

        System.out.println("Enter the second number");
        int number2 = sc.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers are equals");
        }
        else {
            System.out.println("Numbers are different");
        }
    }
}
