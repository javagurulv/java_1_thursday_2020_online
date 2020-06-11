package student_diana_miranovica.lesson5.lesson_code;

 class ArrayExample {

     public static void main(String[] args) {

         //9, 3, 4, 6, 7, 8, 9, 0...
         int mark1 = 9;
         int mark2 = 4;
         int mark3 = 3;
         int mark4 = 6;
         //          |_|_|_|_|
         // index -   0 1 2 3
         int[] marks = new int[4];

         // int -> 4 byte - new int[4]-> 4*4=16 byte RAM

         // |0|0|0|0|
         System.out.println(marks[1]);
         System.out.println(marks[2]);
         System.out.println(marks[3]);
         System.out.println(marks[0]);

         //primitive data type : int, float, boolean

         marks[0]=9;
         marks[1]=4;
         marks[2]=3;
         marks[3]=6;

         System.out.println(marks[1]);
         System.out.println(marks[2]);
         System.out.println(marks[3]);
         System.out.println(marks[0]);

         int sum = marks[0] + marks[1] + marks[2] + marks[3];
         System.out.println(sum);

         System.out.println("Array length = "+marks.length);









     }

}
