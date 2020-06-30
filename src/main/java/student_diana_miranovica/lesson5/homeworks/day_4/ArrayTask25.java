package student_diana_miranovica.lesson5.homeworks.day_4;

import java.util.Scanner;

class ArrayTask25 {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter Array length: ");
         int arrayLengthFromUser = scanner.nextInt();
         int[] count = new int[arrayLengthFromUser];

         // вместо value лучше использовать общепризнаные переменные цикла такие как i, j, ...
         for (int i = 0; i < arrayLengthFromUser; i++){
             System.out.println("Enter some count" + "["+ i + "] for array");
             count[i] = scanner.nextInt();
         }

		 // вместо value лучше использовать общепризнаные переменные цикла такие как i, j, ...
		 for (int i =0; i < arrayLengthFromUser; i++){
             System.out.println("["+ i +"]"+ " numbers in an array = "+ count[i]);
         }


     }




   //- распечатайте на консоль все элементы массива./



}
