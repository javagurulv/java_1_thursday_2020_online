package student_julija_skopeca.practical_tasks.lesson_5.day_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25_fillArrayFromConsole {

    public static void main(String[] args) {

        System.out.println("Enter a size of an array");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();

        int[] numbers = new int [arraySize];

        System.out.println("Please enter " + arraySize + " numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (sc.nextInt());

        }

        System.out.println("The array consists of - " + Arrays.toString(numbers));




    }
}
