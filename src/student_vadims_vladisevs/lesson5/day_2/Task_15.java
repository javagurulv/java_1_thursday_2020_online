package student_vadims_vladisevs.lesson5.day_2;

import java.util.Random;

class Task_15 {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int[] numbersArray = new int[3];

        for(int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = randomNumber.nextInt(100);
            System.out.println( (i+1) + " random number = " + numbersArray[i]);
        }

        System.out.println("Random numbers +2 :");

        for (int number : numbersArray){
            System.out.println((number + 2));
        }
    }
}
