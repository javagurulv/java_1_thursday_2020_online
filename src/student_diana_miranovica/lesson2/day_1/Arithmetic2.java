package student_diana_miranovica.lesson2.day_1;

import java.io.FileReader;
import java.util.Scanner;

 class Arithmetic2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first fractional number and press enter");
        double doubleNum1 =  scan.nextDouble();

        System.out.println("Enter your second fractional number and press enter");
        double doubleNum2 = scan.nextDouble();

        double addResult = doubleNum1 + doubleNum2;
        double subtractionResult = doubleNum2 - doubleNum2;
        double divisionResult = doubleNum1 / doubleNum2;
        double multiplicationResult = doubleNum1 * doubleNum2;

        System.out.println("Your arithmetic solution of 2 numbers: ");
        System.out.println(doubleNum1 + " + " + doubleNum2 + " = " + addResult);
        System.out.println(doubleNum1 + " - " + doubleNum2 + " = " + subtractionResult);
        System.out.println(doubleNum1 + " / " + doubleNum2 + " = " + divisionResult);
        System.out.println(doubleNum1 + " * " + doubleNum2 + " = " + multiplicationResult);
        }
    }

