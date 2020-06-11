package student_oleg_ivanov.lesson5.Day5;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
		// проще в одну строку: return new int [arrayLength];
		int [] arrayNew = new int[arrayLength];
        return arrayNew;
    }
    public void fillArrayWithRandomNumbers(int[] array) {

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
    }
}
