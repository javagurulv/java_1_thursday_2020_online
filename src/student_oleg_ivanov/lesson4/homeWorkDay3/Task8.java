package student_oleg_ivanov.lesson4.homeWorkDay3;

import java.util.Scanner;

class Task8 {
    public static void main(String[] args) {


        System.out.println("Please enter first number: ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        Scanner sc2 = new Scanner(System.in);
        int number2 = sc2.nextInt();

        System.out.println("Please enter third number: ");
        Scanner sc3 = new Scanner(System.in);
        int number3 = sc3.nextInt();

        if ((number1 == number2) && (number2 == number3)) {
            System.out.println("All numbers are equal");}

        if ((number1 != number2) && (number2 != number3) && (number1 != number3)){
            System.out.println("All numbers are different"); }

        else {
        System.out.println("Neither all are equal or different"); }


    }
}
