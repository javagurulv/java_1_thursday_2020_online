package student_julija_skopeca.practical_tasks.lesson_2.day_1;

import java.util.Scanner;

 class TaskFriday0105Level2 {
    public static void main(String[] args) {

        Scanner myInput = new Scanner( System.in );
        System.out.println("Please enter Number A");
        float a = myInput.nextFloat();

        System.out.println("Please enter Number B");
        float b = myInput.nextFloat();

        System.out.println("A = " + a + ", B = " + b);
        System.out.println("A + B = " + a + "+" + b + " = " + (a + b));
        System.out.println("A - B = " + a + "-" + b + " = " + (a - b));
        System.out.println("A * B = " + a + "*" + b + " = " + (a * b));
        System.out.println("A / B = " + a + "/" + b + " = " + (a / b));
    }
}
