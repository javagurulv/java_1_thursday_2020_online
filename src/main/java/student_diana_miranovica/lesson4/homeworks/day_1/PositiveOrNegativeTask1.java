package student_diana_miranovica.lesson4.homeworks.day_1;
//Написать программу, которая запрашивает у
//пользователя
//целое число и выводит на консоль
//положительное оно или отрицательное.
import java.util.Scanner;

class PositiveOrNegativeTask1 {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter int value: ");
         int firstNumber = scanner.nextInt();

         if(firstNumber > 0){
             System.out.println("Your value is positive!");
         }else{
             System.out.println("Your value is negative!");
         }

         System.out.println("Enter int value: ");
         int secondNumber = scanner.nextInt();

         if(secondNumber < 0){
             System.out.println("Your value is negative!");
         }else if (secondNumber > 0){
             System.out.println("Your value is positive!");
         }else {
             System.out.println("Zero");
         }


     }
 }
