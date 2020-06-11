package student_oleg_ivanov.lesson3.homeworks.day2;

import java.util.Scanner;

class Task9 {
    public static void main(String[] arg) {

        System.out.println("What is the user name? ");
        Scanner name = new Scanner(System.in);
        String user = name.nextLine();

        String greeting = "Hello " + user + "!";
        System.out.println(greeting);



    }
}
