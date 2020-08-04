package student_igors_mihejevs.lesson_4.homework.level_1;

import java.util.Scanner;

class Task_1 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print( "Enter integer number : " );
        int firstNumber = myInput.nextInt();
        if (firstNumber >= 0) {
            System.out.println("Number " + firstNumber + " is positive");
        }
        else {
            System.out.println("Number " + firstNumber + " is negative");
        }
    }

}
