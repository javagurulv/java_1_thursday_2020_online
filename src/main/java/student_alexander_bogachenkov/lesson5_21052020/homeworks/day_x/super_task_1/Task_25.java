package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_x.super_task_1;

import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length: ");
        int arrayLength = scanner.nextInt();
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(arrayLength);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number for " + i + " array cell: ");
            numbers[i] = scanner.nextInt();
        }

        arrayUtil.printArrayToConsole(numbers);
    }
}
