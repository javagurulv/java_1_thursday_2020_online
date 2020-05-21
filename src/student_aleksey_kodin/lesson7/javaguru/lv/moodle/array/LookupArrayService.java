package student_aleksey_kodin.lesson7.javaguru.lv.moodle.array;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

class LookupArrayService {

    int findMax(int[] array) {
        if (array.length == 0) return 0;
        OptionalInt max = Arrays.stream(array).max();
        return max.getAsInt();
    }
    int findMin(int[] array) {
        if (array.length == 0) return 0;
        OptionalInt min = Arrays.stream(array).min();
        return min.getAsInt();
    }
    int indexOf(int[] array, int value) {
        return IntStream.range(0, array.length)
                .filter(i -> value == array[i])
                .findFirst()
                .orElse(-1);
    }
    int indexOfMax(int[] array) {
        return indexOf(array,findMax(array));
    }
    int indexOfMin(int[] array) {
        return indexOf(array,findMin(array));
    }
}
