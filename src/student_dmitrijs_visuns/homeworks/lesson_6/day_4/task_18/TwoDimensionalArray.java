package student_dmitrijs_visuns.homeworks.lesson_6.day_4.task_18;

import java.util.Random;

public class TwoDimensionalArray {

    public int[][] createTwoDimensionalArray (int arrayRows, int arrayColumns) {
        return new int[arrayRows][arrayColumns];
    }

    public void fillArrayWithRandomNumbers (int[][] array) {
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
            }
        }

    }

    public int sumArrayNumbers (int[][] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        return sum;
    }

}
