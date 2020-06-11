package student_diana_miranovica.lesson6.lesson_code;

 class WhileExample2 {

     public static void main(String[] args) {

         int num = 0;
         int sum = 0;

         while(sum < 100 ){
             sum += num;

             System.out.println("Number = "+ num +"  Sum = "+ sum);
             num++;
         }

     }
 }
