package student_igors_mihejevs.lesson_4.homework.level_2;

import java.util.Scanner;

class Task_7 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Input first number : ");
        int firstNumber = myInput.nextInt();
        System.out.print("Input second number : ");
        int secondNumber = myInput.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("Numbers are different");
        }
    }

}