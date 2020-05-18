package student_igors_mihejevs.lesson_5.day_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class Task_26 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random randomNumber = new Random();

        System.out.print("Input array length : ");
        int arrayLength = userInput.nextInt();
        int[] myArray = new int[arrayLength];

        for (int counter = 0; counter < myArray.length; counter++) {
            myArray[counter] = randomNumber.nextInt(1000);
        }
        System.out.println("Numbers from array : " + Arrays.toString(myArray));
    }

}
