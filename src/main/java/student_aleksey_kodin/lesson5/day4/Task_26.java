package student_aleksey_kodin.lesson5.day4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Task_26 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter array's length: ");
            int arrayLength =  new Scanner(System.in).nextInt();
            int[] array = new int [arrayLength];

            for (int count = 0; count < array.length; count++) {
                int rndValue = new Random().nextInt(11);
                array[count] = rndValue;
                System.out.println(array[count]);
            }
            System.out.println(Arrays.toString(array));

        }  catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
