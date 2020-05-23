package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_2;

import java.util.Random;

class Task_14 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        numbers[0] = random.nextInt(100);
        numbers[1] = random.nextInt(100);
        numbers[2] = random.nextInt(100);

        int sum = numbers[0] + numbers[1] + numbers[2];
        int averageNumber = sum / numbers.length;
        System.out.println("The average number is " + averageNumber);
    }
}
