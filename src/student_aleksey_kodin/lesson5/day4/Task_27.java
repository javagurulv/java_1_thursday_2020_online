package student_aleksey_kodin.lesson5.day4;

import java.util.*;

class Task_27 {
    public static void main(String[] args) {

            int[] array = new int [10];

            for (int count = 0; count < array.length; count++) {
                int rndValue = new Random().nextInt(11);
                array[count] = rndValue;
                System.out.println(array[count]);
            }
            System.out.println(Arrays.toString(array));
            int maxNumber = Arrays.stream(array).max().getAsInt();
            System.out.println("Array's max value - " + maxNumber);
    }
}
