package student_dmitrijs_visuns.homeworks.lesson_5.day_x;

import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = sc.nextInt();

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = arrayUtil.createArray(arrayLength);

        for (int i:newArray) {
            System.out.println("Enter array integer # " + i);
            newArray[i] = sc.nextInt();;
        }

        arrayUtil.printArrayToConsole(newArray);

    }

}