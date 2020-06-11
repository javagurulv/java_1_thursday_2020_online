package student_aleksey_kodin.lesson5.day2;

import java.util.Arrays;
import java.util.Random;

class Task_13 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int arraySum = 0;

		// обычно переменные цикла называют: i, j, ...
		// count - это не совсем привычное название переменной для цикла for
		for(int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
            arraySum += rndValue;
        }
        int arraySumThroughStream = Arrays.stream(array).sum();

        System.out.println("Use value in loop: ");
        System.out.println("Array's sum = " + arraySum);
        System.out.println("Use stream: ");
        System.out.println("Array's sum = " + arraySumThroughStream);
        System.out.println(Arrays.toString(array));
    }
}
