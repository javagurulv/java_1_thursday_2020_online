package student_vadim_sokolenko.Lesson6Code;

import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userNumber = sc.nextInt();
        while (userNumber != 0) {

            System.out.println("Your number = " + userNumber);
            userNumber = sc.nextInt();
        }
            System.out.println("End");
    }
}
