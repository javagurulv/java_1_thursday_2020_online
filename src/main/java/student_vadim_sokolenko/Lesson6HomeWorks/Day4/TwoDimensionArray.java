package student_vadim_sokolenko.Lesson6HomeWorks.Day4;

import java.util.Random;

public class TwoDimensionArray {

//    public static void main(String[] args) {
//
//        int[][] arr = new int[2][3];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = j;
//                System.out.print(arr[i][j] + "");
//            }
//            System.out.println("");

    public void fillArrayWithRandomNumber(int[][] array) {
        Random random = new Random(15);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int randomNumber = random.nextInt();
                array[i][j] = randomNumber;
            }
        }
    }

    public int sumOfTwoDimensionArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum = sum + array[i][j];
            }
        }
        return sum;
    }
}





