package student_aleksey_kodin.lesson6.day3.task_9;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
        }
    }
    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

	//Если используется Stream API то тогда и возвращать надо Optional<Integer>. Иначе -1 как то не корректно.
	// Если этот метод вернёт -1 - то это что означает? Минимальное значение или его отсутсвие?
    public int findMaxNumber(int[] array) {
    int maxValue = -1;
        OptionalInt max = Arrays.stream(array).max();
        if (max.isPresent()) {
            maxValue = max.getAsInt();
        }
        return maxValue;
    }
    public int findMinNumber(int[] array) {
    int minValue = -1;
    OptionalInt min = Arrays.stream(array).min();
       if (min.isPresent()) {
          minValue = min.getAsInt();
       }
    return minValue;
    }
    public boolean checkHaveArrayNumber(int[] array,int number) {
        return IntStream.of(array).anyMatch(x-> x == number);
    }
}
