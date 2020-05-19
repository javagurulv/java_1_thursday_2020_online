package student_vadims_vladisevs.lesson4.homework.day_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scr.nextInt();

        if ((number > 0)){
            System.out.println(number + " is positive number");
        } else {
            System.out.println(number + " is negative number");
        }
    }
}
