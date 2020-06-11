package student_vadim_sokolenko.Lesson6Code;

import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Infinite Loop");
            System.out.println("Enter number");
            int userNumber = sc.nextInt();
            if(userNumber == 5){
                break;
            }
            System.out.println("Continue");
        }

        System.out.println("End!");
    }
}