package student_vadim_sokolenko.Lesson5HomeWorks.Day4;

import java.util.Random;

public class Task29 {


    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayNumbers = new int[10];

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = random.nextInt(50);
            System.out.println("Array number " + i + " is random number" + arrayNumbers[i]);

        }

        int evenNumber;
        for (int i = 1; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] % 2 == 0) {
                evenNumber = arrayNumbers[i];
                {
                    System.out.println("Even number " + evenNumber);
                }
            }
        }
    }
}

