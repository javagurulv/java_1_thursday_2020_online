package student_igors_mihejevs.lesson_5.day_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input array length : ");
        int arrayLength = userInput.nextInt();
        int[] myArray = new int[arrayLength];

        System.out.println("Input " + myArray.length + " integer numbers");
        for (int counter = 0; counter < myArray.length; counter++) {
            System.out.print("Input number " + (counter + 1) + " : ");
            myArray[counter] = userInput.nextInt();
        }
        System.out.println("Numbers from array : " + Arrays.toString(myArray));
    }

}
