package student_julija_skopeca.practical_tasks.lesson_5.day_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task_26_filledWithRandom {

    public static void main(String[] args) {

        System.out.println("Enter a size of a array");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();

        int[] numbers = new int [arraySize];
        Random random = new Random();

        for (int i=0; i < numbers.length; i++) {
            int randomnumbers = random.nextInt(10);
            numbers[i] = randomnumbers;

        }

        System.out.println("The array is " + Arrays.toString(numbers));
    }
}
