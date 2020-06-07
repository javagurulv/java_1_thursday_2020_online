package student_julija_skopeca.practical_tasks.lesson_2.day_3;

import java.util.Scanner;

 class Task_9_multTable {

    public static void main(String[] args) {

        System.out.println("Please enter a number");

        Scanner myInput = new Scanner(System.in);
        int number = myInput.nextInt();

        System.out.println("Multiplication table of " + number);

        for (int a = 1; a <= 10; a++)

        System.out.println(number + " x " + a + " = " + (number * a));
    }
}