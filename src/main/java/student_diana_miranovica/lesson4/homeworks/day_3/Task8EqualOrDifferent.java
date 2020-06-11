package student_diana_miranovica.lesson4.homeworks.day_3;

import java.util.Scanner;

//Write a Java program that accepts three numbers and prints:
//- "All numbers are equal" if all three numbers are equal,
//- "All numbers are different" if all three numbers are different
//- "Neither all are equal or different" otherwise.
 class Task8EqualOrDifferent {
    public static void main(String[] args) {

        System.out.println("Enter first numeral");
        int firstNum = new Scanner(System.in).nextInt();
        System.out.println("Enter second numeral");
        int secondNum = new Scanner(System.in).nextInt();
        System.out.println("Enter third numeral");
        int thirdNum = new Scanner(System.in).nextInt();

        if(firstNum == secondNum&& secondNum==thirdNum){
            System.out.println("All numbers are equal");
        }else if(firstNum != secondNum&& secondNum != thirdNum){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }
}
