package student_aleksey_kodin.lesson7.javaguru.lv.moodle.level2;

import java.util.Arrays;
import java.util.Random;

class ArrayService {

    int[] create(int size) {
        return new int[size];
    }

    void fillRandomly(int[] array) {
        for(int count = 0; count < array.length; count++) {
            int randomValue = new Random().nextInt(101);
            array[count] = randomValue;
        }
    }
    void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
    int sum(int[] array) {
        return Arrays.stream(array).sum();
    }
    double avg(int[] array) {
        if (array.length == 0) return 0;
        return  (double) sum(array) / array.length;
    }
    int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }
    int[] swap(int[] array) {
        for (int count = 0; count < array.length / 2 ; count++) {
            int tempSaveLastArrayElement = array[array.length - 1 - count];
            array[array.length- 1 - count] = array[count];
            array[count] = tempSaveLastArrayElement;
        }
    return array;
    }
}
