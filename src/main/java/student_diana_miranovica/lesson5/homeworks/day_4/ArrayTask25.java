package student_diana_miranovica.lesson5.homeworks.day_4;

import java.util.Scanner;

class ArrayTask25 {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter Array length: ");
         int arrayLengthFromUser = scanner.nextInt();
         int[] count = new int[arrayLengthFromUser];

         // вместо value лучше использовать общепризнаные переменные цикла такие как i, j, ...
         for (int value = 0; value < arrayLengthFromUser; value++){
             System.out.println("Enter some count" + "["+ value + "] for array");
             count[value] = scanner.nextInt();
         }

		 // вместо value лучше использовать общепризнаные переменные цикла такие как i, j, ...
		 for (int value =0; value < arrayLengthFromUser; value++){
             System.out.println("["+ value +"]"+ " numbers in an array = "+ count[value]);
         }


     }




   //- распечатайте на консоль все элементы массива./



}
