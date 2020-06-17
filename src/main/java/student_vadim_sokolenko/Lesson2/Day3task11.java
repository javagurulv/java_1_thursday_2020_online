package student_vadim_sokolenko.Lesson2;

import java.util.Scanner;

class Day3task11 {

    public static void main(String[] args) {

        //1. Ask user first number
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Please enter 1st number: ");
        int firstNumber = Scanner.nextInt();

        //2. Ask user second number
        System.out.print("Please enter 2nd number: ");
        int secondNumber = Scanner.nextInt();


        //3. Ask user third Number
        Scanner myInput3 = new Scanner(System.in);
        System.out.print("Please enter 3rd number: ");
        int thirdNumber = Scanner.nextInt();


        //4. Average of 3 numbers
        int average = (firstNumber + secondNumber + thirdNumber) / 3;

        //5. Print result in scanner
        System.out.print(average);



    }
}





