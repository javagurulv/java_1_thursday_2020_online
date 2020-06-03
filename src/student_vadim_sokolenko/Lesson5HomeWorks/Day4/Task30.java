package student_vadim_sokolenko.Lesson5HomeWorks.Day4;

import java.util.Random;

public class Task30 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayNumbers = new int[15];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = random.nextInt(100);
            System.out.println("Array number " + i + " is random number" + arrayNumbers[i]);

        }

        int oddNumber;
        for (int i = 1; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 != 0) {
                oddNumber = arrayNumbers[i];
                {
                    System.out.println("Odd number " + oddNumber);
                }
            }
        }
    }
}
