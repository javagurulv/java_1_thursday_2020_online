package student_vadim_sokolenko.Lesson5HomeWorks.Day4;

import java.util.Random;

class ArrayMinNumber {

    public static void main(String[] args) {


        int[] numbers = new int[4];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        int minNumber = numbers[0];
        for (int tempNumber : numbers) {
            if (tempNumber < minNumber) {
                minNumber = tempNumber;
            }
        }
        System.out.println("Min number from array = " + minNumber);
    }
}

