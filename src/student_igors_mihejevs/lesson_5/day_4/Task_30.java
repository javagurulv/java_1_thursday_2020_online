package student_igors_mihejevs.lesson_5.day_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task_30 {

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

        System.out.print("All odd numbers from array : ");
        for (int i : myArray) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }

}
