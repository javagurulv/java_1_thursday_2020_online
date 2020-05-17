package student_aleksey_kodin.lesson5.day2;

import java.util.Arrays;
import java.util.Random;

class Task_15 {
        public static void main(String[] args) {
            int[] array = new int[3];

            for(int count = 0; count < array.length; count++) {
                int rndValue = new Random().nextInt(11);
                array[count] = rndValue;
                System.out.println(array[count]);
            }
            System.out.println(Arrays.toString(array));
            for(int count = 0; count < array.length; count++) {
                array[count] += 2;
                System.out.println(array[count]);
            }
            System.out.println(Arrays.toString(array));
        }
}
