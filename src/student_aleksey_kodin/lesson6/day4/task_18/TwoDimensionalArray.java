package student_aleksey_kodin.lesson6.day4.task_18;

import java.util.Random;

class TwoDimensionalArray {

    public int[][] createTwoDimensionalArray(int row,int column) {
        return new int[row][column];
    }
    public void addRandomValueArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                array[row][column] = new Random().nextInt(10);
            }
        }
    }
    public int sumArray(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int column = 0; column < array[0].length; column++) {
                sum += ints[column];
            }
        }
    return sum;
    }
    public void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println();
            for (int column = 0; column < array[0].length; column++) {
                System.out.print(row[column] + " ");
            }
        }
        System.out.println();
    }
}
