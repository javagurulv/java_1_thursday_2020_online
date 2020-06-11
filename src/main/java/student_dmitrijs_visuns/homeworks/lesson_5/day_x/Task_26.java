package student_dmitrijs_visuns.homeworks.lesson_5.day_x;

import java.util.Random;
import java.util.Scanner;

class Task_26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = sc.nextInt();

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = arrayUtil.createArray(arrayLength);

        arrayUtil.fillArrayWithRandomNumbers(newArray);

        arrayUtil.printArrayToConsole(newArray);


    }

}
