package student_igors_mihejevs.lesson_5.homework.level_1;

import java.lang.reflect.Array;
import java.util.Arrays;

class ArrayLength1 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Array length = : " + Array.getLength(numbers));
        System.out.println("Numbers from array : " + Arrays.toString(numbers));
    }

}
