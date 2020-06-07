package student_julija_skopeca.practical_tasks.lesson_2.day_1;

import java.util.Scanner;

 class TaskFridayLevel1 {
    public static void main(String[] args) {

        Scanner myInput = new Scanner( System.in );
        System.out.println("Please enter Number A");
        int a = myInput.nextInt();

        System.out.println("Please enter Number B");
        int b = myInput.nextInt();

        System.out.println("A = " + a + ", B = " + b);
        System.out.println("A + B = " + a + "+" + b + " = " + (a + b));
        System.out.println("A - B = " + a + "-" + b + " = " + (a - b));
        System.out.println("A * B = " + a + "*" + b + " = " + (a * b));
        System.out.println("A / B = " + a + "/" + b + " = " + (a / b));
    }
}
