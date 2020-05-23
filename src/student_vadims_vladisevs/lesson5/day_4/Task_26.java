package student_vadims_vladisevs.lesson5.day_4;

import java.util.Random;
import java.util.Scanner;

class Task_26 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Random randomNumber = new Random();
        System.out.println("Enter array length :");
        int arrayLength = scr.nextInt();

        int[] numbersArray = new int[arrayLength];

        for (int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = randomNumber.nextInt(100);
            System.out.println( (i+1) + " random number = " + numbersArray[i]);
        }
    }
}
