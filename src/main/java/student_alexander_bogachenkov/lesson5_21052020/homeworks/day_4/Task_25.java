package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_4;

import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length: ");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number for " + i + " array cell: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " cell number is " + numbers[i]);
        }
    }
}
