package student_oleg_ivanov.lesson6.day4.task14;

import java.util.Random;

class ArrayUtil {
    public void arraySortInCrease (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = arr[i];
                arr[i] = arr[min_i];
                arr [min_i] = temp;
            }
        }

    }
    public int[] createArray(int arrLength) {
        return new int[arrLength];
    }
    public void fillArrayWithRandomNumbers(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }
    public int findMinNumber(int[] arr) {
        int min = arr[0];
        for (int temp : arr){
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }
    public int findMaxNumber(int[] arr) {
        int max = arr[0];
        for (int temp : arr) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

}
