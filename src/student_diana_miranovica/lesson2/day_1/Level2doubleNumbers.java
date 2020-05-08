package student_diana_miranovica.lesson2.day_1;

import java.io.FileReader;
import java.util.Scanner;

public class Level2doubleNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first fractional number and press enter");
        double doubleNum1 =  scan.nextDouble();

        System.out.println("Enter your second fractional number and press enter");
        double doubleNum2 = scan.nextDouble();

        double result1 = doubleNum1 + doubleNum2;
        double result2 = doubleNum2 - doubleNum2;
        double result3 = doubleNum1 / doubleNum2;
        double result4 = doubleNum1 * doubleNum2;

        System.out.println("Your arithmetic solution of 2 numbers: ");
        System.out.println(doubleNum1 + " + " + doubleNum2 + " = " + result1);
        System.out.println(doubleNum1 + " - " + doubleNum2 + " = " + result2);
        System.out.println(doubleNum1 + " / " + doubleNum2 + " = " + result3);
        System.out.println(doubleNum1 + " * " + doubleNum2 + " = " + result4);
        }
    }

