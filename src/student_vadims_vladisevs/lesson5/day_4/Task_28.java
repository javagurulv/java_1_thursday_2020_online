package student_vadims_vladisevs.lesson5.day_4;

import java.util.Random;

class Task_28 {
    public static void main(String[] args) {
        Random  randomNumber = new Random();
        int[] numbersArray = new int[10];


        for (int i = 0; i < numbersArray.length; i++){
            numbersArray[i] = randomNumber.nextInt(100);
            System.out.println( (i+1) + " random number = " + numbersArray[i]);
        }

        int minNumber = numbersArray[0];

        for (int tempNumber : numbersArray){
            if (tempNumber < minNumber){
                minNumber = tempNumber;
            }
        }

        System.out.println("Min number from array = " + minNumber);
    }
}
