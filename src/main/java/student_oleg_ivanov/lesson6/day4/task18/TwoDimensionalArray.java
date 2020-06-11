package student_oleg_ivanov.lesson6.day4.task18;

import java.util.Random;

class TwoDimensionalArray {
    public int[][] createArray(int vertical, int horizontal){
        return new int[vertical][horizontal];
    }

    public void fillArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(20);
            }
        }
    }
    public int sumAllNumbersInArray(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

}
