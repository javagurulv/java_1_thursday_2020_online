package student_igors_mihejevs.lesson_5.day_2;

import java.util.Arrays;
import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.println("Input " + numbers.length + " integer numbers");
        for (int counter = 0; counter < numbers.length; counter++) {
            System.out.print("Input number " + (counter + 1) + " : ");
            numbers[counter] = myInput.nextInt();
        }
        System.out.println("Numbers from array : " + Arrays.toString(numbers));
    }

}
