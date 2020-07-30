package student_igors_mihejevs.lesson_4.homework.level_1;

import java.util.Scanner;

class Task_4 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Input integer number between : ");
        int firstNumber = myInput.nextInt();
        if (firstNumber % 2 == 0) {
            System.out.println("Number " + firstNumber + " is even");
        }
        else {
            System.out.println("Number " + firstNumber + " is odd");
        }
    }

}
