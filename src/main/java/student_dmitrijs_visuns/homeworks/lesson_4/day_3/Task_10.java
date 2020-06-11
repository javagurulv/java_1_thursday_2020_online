package student_dmitrijs_visuns.homeworks.lesson_4.day_3;

import java.util.Scanner;

class Task_10 {

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Enter first whole number");
        int firstNumber = inputNumber.nextInt();

        System.out.println("Enter second whole number");
        int secondNumber = inputNumber.nextInt();

        System.out.println("Enter third whole number");
        int thirdNumber = inputNumber.nextInt();

        if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
            System.out.println(firstNumber + " is the biggest number you entered");
        } else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
            System.out.println(secondNumber + " is the biggest number you entered");
        } else if ((thirdNumber >= firstNumber) && (thirdNumber >= secondNumber)) {
            System.out.println(thirdNumber + " is the biggest number you entered");
        }
    }

}
