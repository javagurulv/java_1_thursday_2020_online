package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_4.task_18;

import java.util.Random;

class TwoDimensionalArray {

    public void fillWithRandomNumbers(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Random random = new Random();
                array[i][j] = random.nextInt(100);
            }
        }
    }

    public int sumAllNumbers(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
