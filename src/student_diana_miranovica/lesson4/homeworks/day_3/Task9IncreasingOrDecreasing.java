package student_diana_miranovica.lesson4.homeworks.day_3;
//Write a program that accepts three numbers from the user and prints:
//- "increasing" if the numbers are in increasing order,
//- "decreasing" if the numbers are in decreasing order,
//- "Neither increasing or decreasing order" otherwise.
import java.util.Scanner;

class Task9IncreasingOrDecreasing {
     public static void main(String[] args) {

         System.out.println("Your 1 number");
         int firstNum = new Scanner(System.in).nextInt();
         System.out.println("Your 2 number");
         int secondNum = new Scanner(System.in).nextInt();
         System.out.println("Your 3 number");
         int thirdNum = new Scanner(System.in).nextInt();

         if(firstNum>secondNum&&secondNum>thirdNum&&firstNum>thirdNum){
             System.out.println("increasing");
         }else if (firstNum<secondNum&&secondNum<thirdNum&&firstNum<thirdNum){
             System.out.println("decreasing");
         }else {
             System.out.println("Neither increasing or decreasing order");

         }

     }
}
