package student_vadims_vladisevs.lesson5.day_5;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        // Write implementation here !!!
		// проще в одну строку: return new int [arrayLength];
        int[] tempArray = new int[arrayLength];
        return tempArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        // Write implementation here !!!
        Random randomNumber = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = randomNumber.nextInt(100);
        }
    }

}