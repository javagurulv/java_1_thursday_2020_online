package student_vadims_vladisevs.lesson2.homework.day_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scr.nextInt();
        for (int i = 1; i < 11; i++){
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
