package student_oleg_ivanov.lesson2.homeWork.day3;

import java.util.Scanner;

class AverageOfThreeNumbers {
    public static void main(String[] args){

        //get from use tree numbers
        System.out.println("Average of your three numbers");
        System.out.println("Please enter your first number: ");
        Scanner myInput = new Scanner(System.in);
        double firstNumber = myInput.nextDouble();

        System.out.println("Please enter your second number: ");
        Scanner myInput1 = new Scanner(System.in);
        double secondNumber = myInput1.nextDouble();

        System.out.println("Please enter your third number: ");
        Scanner myInput3 = new Scanner(System.in);
        double thirdNumber = myInput3.nextDouble();

        //solution
        double result = (firstNumber + secondNumber + thirdNumber) / 3;

        //give result to console for user
        System.out.println("Average of your three numbers is = " +result);

    }
}
