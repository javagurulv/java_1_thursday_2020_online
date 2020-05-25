package student_diana_miranovica.lesson5.homeworks.day_4;

import java.util.Random;
import java.util.Scanner;

class ArrayTask26 {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter array length");
         int arrayLength = scanner.nextInt();
         int[] numbers = new int[arrayLength];

         for (int count = 0; count < arrayLength; count++){
             Random random = new Random();
             numbers[count] = random.nextInt(10);

         }
         for (int count =0; count < arrayLength; count++  ){
             System.out.println("["+ count +"]"+ " numbers in an array = "+ numbers[count]);

         }
     }
}
