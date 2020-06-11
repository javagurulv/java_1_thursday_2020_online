package student_vadims_vladisevs.lesson5.day_2;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int[] numbersArray = new int[3];

        for (int i = 0; i < numbersArray.length; i++){
        System.out.println("Enter number :");
        numbersArray[i] = scr.nextInt();
        }

        System.out.println("Entered numbers :");
        for (int number : numbersArray){
            System.out.println(number);
        }
    }
}
