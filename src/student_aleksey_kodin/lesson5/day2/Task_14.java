package student_aleksey_kodin.lesson5.day2;

import java.util.Arrays;
import java.util.Random;

class Task_14 {
    public static void main(String[] args) {
        int[] array = new int[3];
        int arraySum = 0;

		// объявляйте переменные там где вы их первый раз используете! Заранее объявлять переменные не стоит.
        double arrayAverage;

		for(int count = 0; count < array.length; count++) {
            int rndValue = new Random().nextInt(11);
            array[count] = rndValue;
            arraySum += rndValue;
        }
        arrayAverage = (double) arraySum / array.length;
        double arrayAverageThroughStream = Arrays.stream(array).average().orElse(Double.NaN);

        System.out.println("Use value in loop: ");
        System.out.println("Array's average = " + arrayAverage);
        System.out.println("Use stream: ");
        System.out.println("Array's average = " + arrayAverageThroughStream);
        System.out.println(Arrays.toString(array));
    }
}
