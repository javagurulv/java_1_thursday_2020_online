package student_dmitrijs_visuns.homeworks.lesson_5.day_x;

import java.util.Scanner;

class Task_25_refactoring {

    Scanner sc = new Scanner(System.in);


    public int[] createArray() {
        System.out.println("Enter array length: ");
        int arrayLength = sc.nextInt();
        return new int[arrayLength];
    }


    public void enterArrayIntegers(int[] array) {
        for (int i : array) {
            System.out.println("Enter array integer # " + i);
            int arrayNumber = sc.nextInt();
            array[i] = arrayNumber;
        }
    }


    public void printArrayIntegers (int[] array) {
            for (int i : array) {
                System.out.println("Array integer # " + i + " is " + array[i]);
            }
    }


}