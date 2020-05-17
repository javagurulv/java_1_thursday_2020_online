package student_diana_miranovica.lesson4.homeworks.day_1;

import java.util.Scanner;

//Написать программу, которая запрашивает у пользователя
//целое число и выводит на консоль
//положительное оно, отрицательное или равно нулю.
 class NumberClassifyTask2 {
     public static void main(String [] args){

         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter first int value: ");
         int firstNumber = scanner.nextInt();

         if (firstNumber >0){
             System.out.println("Value is positive");
         }else if(firstNumber == 0){
             System.out.println(" Value is Zero");
         }else if (firstNumber < 0){
             System.out.println("Value is negative");
         }

         System.out.println("Enter second int value");
         int secondNumber = scanner.nextInt();

         if (secondNumber >0){
             System.out.println("Value is positive");
         }else if(secondNumber == 0){
             System.out.println("Value is Zero");
         }else if (secondNumber < 0){
             System.out.println("Value negative");
         }

     }
 }

