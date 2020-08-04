package student_igors_mihejevs.lesson_4.homework.level_3;

import java.util.Scanner;

class Task_8 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input first number : ");
        int firstNumber = myInput.nextInt();
        System.out.print("Input second number : ");
        int secondNumber = myInput.nextInt();
        System.out.print("Input third number : ");
        int thirdNumber = myInput.nextInt();

        if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)) {
            System.out.println("All numbers are equal");
        }
        else if ((firstNumber != secondNumber) && (firstNumber != thirdNumber) && (secondNumber != thirdNumber)) {
            System.out.println("All numbers are different");
        }
        else System.out.println("Neither all are equal or different");
    }

}
