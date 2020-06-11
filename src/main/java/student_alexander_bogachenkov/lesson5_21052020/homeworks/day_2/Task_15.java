package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_2;

import java.util.Random;

class Task_15 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Numbers before adding 2:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
        }

        System.out.println("Numbers after adding 2:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
