package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_4;

import java.util.Random;

class Task_27 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " cell number is " + numbers[i]);
        }

        int maxArrayNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxArrayNum) {
                maxArrayNum = numbers[i];
            }
        }

        System.out.println("Maximal array number is " + maxArrayNum);
    }
}
