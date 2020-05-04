package student_diana_miranovica.lesson2.day_1;

import java.util.Scanner;

public class level1IntNumbers {

    public static void main(String[] args) {
        //Get first number from user
        Scanner myInput = new Scanner(System.in);
        System.out.println("Press first number please");
        int firstNumber = myInput.nextInt();

        //Get second number from user
        System.out.println("Press second number please");
        int secondNumber = myInput.nextInt();

        //Result of operations with numbers
        int result1 = firstNumber + secondNumber;
        int result2 = firstNumber - secondNumber;
        int result3 = firstNumber / secondNumber;
        int result4 = firstNumber * secondNumber;

        //Display the result on the console
        System.out.println("Your result of addition of numbers is  "+ firstNumber + "+" + secondNumber + "=" + result1);
        System.out.println("Your result of subtraction of numbers is  "+ firstNumber + "-" + secondNumber + "=" + result2);
        System.out.println("Your result of division of numbers is  " + firstNumber + "/" + secondNumber + "=" +  result3);
        System.out.println("Your result of multiplication of numbers is  " + firstNumber + "*" + secondNumber + "=" + result4);
    }
}
