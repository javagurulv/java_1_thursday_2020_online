package student_vadims_vladisevs.lesson5.day_4;


import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter array length :");
        int arrayLength = scr.nextInt();

        int[] numbersArray = new int[arrayLength];

        for (int i = 0; i < numbersArray.length; i++){
            System.out.println("Enter number :");
            numbersArray[i] = scr.nextInt();
        }

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println( (i+1) + " number = " + numbersArray[i]);
        }

    }
}
