package student_diana_miranovica.lesson5.homeworks.day_5day_6;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {
     public int[] createArray(int arrayLength) {
         int[] array = new int[arrayLength];
         return array;
     }

     public void fillArrayWithRandomNumbers(int[] array){
         Random random = new Random();
         for(int i = 0; i < array.length; i++){
             array[i] = random.nextInt(250);

         }
     }
    public void printArrayToConsole(int[] array) {
        for (int i =0; i < array.length; i++  ){
            System.out.println("array["+ i +"]"+ "  in an array = "+ array[i]);

        }
           // System.out.println("Numbers from array : " + Arrays.toString(array));
        }

    public int findMaxNumber(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int counter = 0;
        while (counter < array.length) {
            if (array[counter] > maxNumber) maxNumber = array[counter];
            counter++;
        }
        return maxNumber;
    }

    // minimum number in array
    public int findMinNumber(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int counter = 0;
        while (counter < array.length) {
            if (array[counter] < minNumber) minNumber = array[counter];
            counter++;
        }
        return minNumber;
    }
}
