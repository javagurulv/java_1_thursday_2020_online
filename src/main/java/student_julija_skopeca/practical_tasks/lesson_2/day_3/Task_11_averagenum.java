package student_julija_skopeca.practical_tasks.lesson_2.day_3;

import java.util.Scanner;

 class Task_11_averagenum {

    public static void main(String[] args) {

        System.out.println("Enter a number 1");
        Scanner myInput = new Scanner(System.in);
            int number1 = myInput.nextInt();

        System.out.println("Enter a number 2");
            int number2 = myInput.nextInt();

        System.out.println("Enter a number 3");
            int number3 = myInput.nextInt();

            int averageNum = (number1 + number2 + number3) / 3;

        System.out.println("Average number of (" + number1
            + ", " + number2 + ", " + number3 + ") = " + averageNum);
    }
}
