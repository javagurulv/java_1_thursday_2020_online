package student_dmitrijs_visuns.homeworks.lesson_5.day_5;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }


    public void fillArrayWithRandomNumbers(int[] array) {

        Random random = new Random();

        for (int inputCount = 1; inputCount <= array.length; inputCount++) {
            int randomNumber = random.nextInt(100);
            array[inputCount - 1] = randomNumber;
        }

    }

}
