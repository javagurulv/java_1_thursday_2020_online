package student_diana_miranovica.lesson6.lesson_code;

import java.util.Scanner;

class BreakExample {

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         while (true){
             System.out.println("Infinite Loop");
             System.out.println("Enter magic number: ");
             int userNumber = scanner.nextInt();
             if(userNumber == 5){
                 break;
             }
         }
         System.out.println("End!");
        /*for (;;){
           System.out.println("Infinite Loop");
        }*/
     }
 }
