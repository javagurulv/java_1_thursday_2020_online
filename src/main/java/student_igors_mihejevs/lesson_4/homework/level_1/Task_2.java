package student_igors_mihejevs.lesson_4.homework.level_1;

import java.util.Scanner;

class Task_2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Input integer number : ");
        int firstNumber = myInput.nextInt();
        if (firstNumber > 0) {
            System.out.println("Number " + firstNumber + " is positive");
        }
        else {
            if (firstNumber < 0) {
                System.out.println("Number " + firstNumber + " is negative");
            }
            else {
                System.out.println("Number " + firstNumber + " is zero");
            }
        }
    }

}
