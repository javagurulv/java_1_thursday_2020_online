package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_4;

import java.util.Random;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length: ");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " cell number is " + numbers[i]);
        }
    }
}
