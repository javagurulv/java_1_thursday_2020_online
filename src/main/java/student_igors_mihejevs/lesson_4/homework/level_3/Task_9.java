package student_igors_mihejevs.lesson_4.homework.level_3;

import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input first number : ");
        int firstNumber = myInput.nextInt();
        System.out.print("Input second number : ");
        int secondNumber = myInput.nextInt();
        System.out.print("Input third number : ");
        int thirdNumber = myInput.nextInt();

        if ((firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
            System.out.println("increasing");
        }
        else if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)) {
            System.out.println("decreasing");
        }
        else System.out.println("Neither increasing or decreasing order");
    }

}