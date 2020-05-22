package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_2;

import java.util.Random;

class Task_13 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        numbers[0] = random.nextInt(100);
        numbers[1] = random.nextInt(100);
        numbers[2] = random.nextInt(100);

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum = " + sum);
    }
}
