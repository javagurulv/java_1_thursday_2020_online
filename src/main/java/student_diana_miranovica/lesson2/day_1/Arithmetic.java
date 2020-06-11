package student_diana_miranovica.lesson2.day_1;

import java.util.Scanner;

 class Arithmetic {

    public static void main(String[] args) {
        //Get first number from user
        Scanner myInput = new Scanner(System.in);
        System.out.println("Press first number please");
        int firstNumber = myInput.nextInt();

        //Get second number from user
        System.out.println("Press second number please");
        int secondNumber = myInput.nextInt();

        //Result of operations with numbers
        int addResult = firstNumber + secondNumber;
        int subtractionResult = firstNumber - secondNumber;
        int divisionResult = firstNumber / secondNumber;
        int multiplicationResult = firstNumber * secondNumber;

        //Display the result on the console
        System.out.println("Your result of addition of numbers is  "+ firstNumber + "+" + secondNumber + "=" + addResult);
        System.out.println("Your result of subtraction of numbers is  "+ firstNumber + "-" + secondNumber + "=" + subtractionResult);
        System.out.println("Your result of division of numbers is  " + firstNumber + "/" + secondNumber + "=" +  divisionResult);
        System.out.println("Your result of multiplication of numbers is  " + firstNumber + "*" + secondNumber + "=" + multiplicationResult);
    }
}
