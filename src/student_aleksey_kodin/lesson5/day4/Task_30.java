package student_aleksey_kodin.lesson5.day4;

import java.util.Arrays;
import java.util.Random;

class Task_30 {
    public static void main(String[] args) {

        int[] array = new int [10];

        for (int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
            if (isOdd(rndValue)) {
                System.out.print(array[count] + " - " + array[count] + " is odd\n");
            } else {
                System.out.print(array[count] + " ------------> " +  "is even\n");
            }
        }
        System.out.println(Arrays.toString(array));
    }
    private static boolean isOdd(int rndValue) {
        return rndValue % 2 == 1;
    }
}
