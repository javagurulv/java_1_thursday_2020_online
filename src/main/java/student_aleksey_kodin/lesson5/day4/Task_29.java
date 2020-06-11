package student_aleksey_kodin.lesson5.day4;

import java.util.Arrays;
import java.util.Random;

class Task_29 {
    public static void main(String[] args) {

        int[] array = new int [10];

        for (int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
            if (isEven(rndValue)) {
                System.out.print(array[count] + " - " + array[count] + " is even\n");
            } else {
                System.out.print(array[count] + " ------------> " +  "is odd\n");
            }
        }
        System.out.println(Arrays.toString(array));
    }
    private static boolean isEven(int rndValue) {
        return rndValue % 2 == 0;
    }
}
