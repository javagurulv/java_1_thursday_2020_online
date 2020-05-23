package student_vadims_vladisevs.lesson5.day_4;

import java.util.Random;

class Task_30 {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int[] numbersArray = new int[10];

        for (int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = randomNumber.nextInt(100);
            System.out.println( (i+1) + " random number = " + numbersArray[i]);
        }

        System.out.println("Odd numbers : ");
        for (int oddNumber : numbersArray){
            if (oddNumber % 2 != 0){
                System.out.println(oddNumber);
            }
        }
    }
}
