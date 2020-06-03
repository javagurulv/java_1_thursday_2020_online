package student_aleksey_kodin.lesson5.day2;

import java.util.Arrays;
import java.util.Random;

class Task_12 {
    public static void main(String[] args) {
        int[] array = new int[3];

        // обычно переменные цикла называют: i, j, ...
		// count - это не совсем привычное название переменной для цикла for
        for(int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
            System.out.println(array[count]);
        }
        System.out.println(Arrays.toString(array));
    }
}
