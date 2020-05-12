package student_julija_skopeca.practical_tasks.lesson_3.day_2;

import java.util.Scanner;

 class task_9 {

    public static void main(String[] args) {

        System.out.println("Please enter your name");

        Scanner enteredName = new Scanner(System.in);
        String name = enteredName.nextLine();

        System.out.println("Hello " + name + " :-)");

    }
}
