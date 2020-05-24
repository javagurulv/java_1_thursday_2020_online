package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_4;

import java.util.Random;

class Task_29 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " cell number is " + numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            int residue = numbers[i] % 2;
            if (residue == 0) {
                System.out.println("Even number from array is " + numbers[i]);
            }
        }
    }
}
