package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_2;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        numbers[0] = scanner.nextInt();
        System.out.println("Введите второе число: ");
        numbers[1] = scanner.nextInt();
        System.out.println("Введите третье число: ");
        numbers[2] = scanner.nextInt();

        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);
        System.out.println("numbers[2] = " + numbers[2]);
    }
}
