package student_diana_miranovica.lesson5.homeworks.day_4;

import java.util.Random;

class ArrayTask28 {

     public static void main(String[] args) {
         int[] mas = new int[4];
         Random random = new Random();

         for (int i = 0; i < 4; i++){
             mas[i] = random.nextInt(100);

         }
         for (int i =0; i < 4; i++  ){
             System.out.println("numbers["+ i +"]"+ "  in an array = "+ mas[i]);

         }
         int minNumber = mas[0];

         for (int tempNumber : mas){
             if (tempNumber < minNumber){
                 minNumber = tempNumber;
             }
         }

         System.out.println("Min number from array = " + minNumber);

     }

}
