package student_igors_mihejevs.lesson_5.day_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayLength1 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println("Array length = : " + Array.getLength(numbers));
        System.out.println("Numbers from array : " + Arrays.toString(numbers));
    }

}