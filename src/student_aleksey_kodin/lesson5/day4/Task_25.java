package student_aleksey_kodin.lesson5.day4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter array's length: ");
            int arrayLength =  new Scanner(System.in).nextInt();
            int[] array = new int [arrayLength];

            for (int count = 0; count < array.length; count++) {
                System.out.println("Please enter array's element" + "[" + count + "]:");
                int arrayElementValue = new Scanner(System.in).nextInt();
                array[count] = arrayElementValue;
            }
            for (int count : array) {
                System.out.println(count);
            }
            System.out.println(Arrays.toString(array));

        }  catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
