package student_igors_mihejevs.lesson_5.homework.level_1;

import java.lang.reflect.Array;
import java.util.Arrays;

class ArrayLength3 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println("Array length = : " + numbers.length);
        System.out.println("Array length = : " + Array.getLength(numbers));
        System.out.println("Numbers from array : " + Arrays.toString(numbers));
    }

}
