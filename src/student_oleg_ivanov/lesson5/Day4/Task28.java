package student_oleg_ivanov.lesson5.Day4;

import java.util.Random;

class Task28 {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] arrayNumbers = new int[15];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = randomNumbers.nextInt(50);
            System.out.println("Array number " + i + " is random number " + arrayNumbers[i]);
        }

        int minNumber = arrayNumbers [0];
        for (int i = 1; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < minNumber) {
                minNumber = arrayNumbers [i];
            }
        } System.out.println("Random min number = " + minNumber);
    }

}
