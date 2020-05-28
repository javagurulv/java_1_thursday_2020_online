package student_vadim_sokolenko.Lesson5HomeWorks.Day4;

import java.util.Random;

public class ArrayMinNumber {

    public static void main(String[] args) {


        int [] numbers = new int[4];
        Random random = new Random();

        for (int i = 0; i < numbers.length ; i++) {
            int randomNumbers = random.nextInt(15);
            numbers[i] = randomNumbers;

        }
    }
}
