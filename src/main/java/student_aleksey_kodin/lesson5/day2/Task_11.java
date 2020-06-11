package student_aleksey_kodin.lesson5.day2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        byte[] array = new byte[3];
        try {
            System.out.println("Please enter first byte value: ");
            byte firstValue = (byte) new Scanner(System.in).nextInt();

            System.out.println("Please enter second byte value: ");
            byte secondValue = (byte) new Scanner(System.in).nextInt();

            System.out.println("Please enter third byte value: ");
            byte thirdValue = (byte) new Scanner(System.in).nextInt();

            array[0] = firstValue;
            array[1] = secondValue;
            array[2] = thirdValue;
            for (byte arrayValue: array) {
                System.out.println(arrayValue);
            }
            System.out.println(Arrays.toString(array));

        }  catch (InputMismatchException e) {
            System.out.println("Please enter Int value and try again");
            System.exit(-1);
        }
    }
}
