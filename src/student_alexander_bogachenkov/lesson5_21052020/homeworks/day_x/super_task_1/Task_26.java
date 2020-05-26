package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_x.super_task_1;

import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length: ");
        int arrayLength = scanner.nextInt();
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(arrayLength);

        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
    }
}
