package student_vadims_vladisevs.lesson5.day_4;

import java.util.Random;

class Task_29 {
    public static void main(String[] args) {
        Random  randomNumber = new Random();
        int[] numbersArray = new int[10];

        for (int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = randomNumber.nextInt(100);
            System.out.println( (i+1) + " random number = " + numbersArray[i]);
        }

        System.out.println("Even numbers : ");
        for (int evenNumber : numbersArray){
            if (evenNumber % 2 == 0){
                System.out.println(evenNumber);
            }
        }
    }
}
