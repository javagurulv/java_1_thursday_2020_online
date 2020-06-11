package student_dmitrijs_visuns.homeworks.lesson_4.day_3;

import java.util.Scanner;

class Task_9 {

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = inputNumber.nextInt();

        System.out.println("Enter second number");
        int secondNumber = inputNumber.nextInt();

        System.out.println("Enter third number");
        int thirdNumber = inputNumber.nextInt();

        if ((firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
            System.out.println ("Increasing!");
        } else if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)) {
            System.out.println ("Decreasing!");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

    }

}
