package student_diana_miranovica.lesson4.homeworks.day_2;
//Написать программу, которая запрашивает у пользователя
//два целых числа и выводит на консоль наибольшее из них.

import java.util.Scanner;

class Task5GreaterValue {

   public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     System.out.println("Press first integer ");
     int firstInteger = scanner.nextInt();

     System.out.println("Press second integer");
     int secondInteger = scanner.nextInt();

    System.out.println("Your greater value is " + Math.max(firstInteger,secondInteger));



  }
}
