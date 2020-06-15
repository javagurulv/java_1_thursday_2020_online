package student_diana_miranovica.lesson6.home_works.day_3;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

class ArrayUtil {

     public int[] createArray(int arrayLength) {
        // в одну стороку! return new int[arrayLength];
		// переменную создавать не стоит
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
     public boolean isContainingCertainElement(int[] array, int elem){
         return IntStream.of(array).anyMatch(x -> x == elem);
    }



    public long repeatedNumberInArray(int[] array, int elem) {
		// в одну стороку! IntStream.of(array).filter(x -> x == elem).count();
		// переменную создавать не стоит
        long result = IntStream.of(array).filter(x -> x == elem).count();
        return result;
    }

    public void replace(int[] arr, int numberToReplace, int newNumber){
         for(int i = 0 ; i <arr.length; i++){
             if (arr[i] == numberToReplace){
                 arr[i] = newNumber;
                 break;
             }
         }
    }
    public void replaceAll(int[] arr, int numberToReplace, int newNumber){
        for(int i = 0 ; i <arr.length; i++){
            if (arr[i] == numberToReplace){
                arr[i] = newNumber;
            }
        }
    }
    public void rotateArray(int[]arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

}
