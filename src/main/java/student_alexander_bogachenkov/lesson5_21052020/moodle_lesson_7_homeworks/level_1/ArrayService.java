package student_alexander_bogachenkov.lesson5_21052020.moodle_lesson_7_homeworks.level_1;

import java.util.Random;

class ArrayService {

    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array " + i + " cell number is " + array[i]);
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public double avg(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        int average = sum / array.length;
        return average;
    }
}
