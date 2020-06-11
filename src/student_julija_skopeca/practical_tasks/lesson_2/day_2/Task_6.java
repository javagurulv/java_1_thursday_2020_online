package student_julija_skopeca.practical_tasks.lesson_2.day_2;

import java.util.Scanner;

 class Task_6 {

    public static void main(String[] args) {

        System.out.println("Please, enter your name");

        Scanner myInput = new Scanner( System.in );
        
        String name = myInput.nextLine();

        System.out.println("Hello, " + name);
    }
}
