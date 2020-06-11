package student_vadims_vladisevs.lesson6.day_4.task_17;

 class WhileInfinityLoop {
     public static void main(String[] args) {

         int i = 1;
         while (i > 0) {
             System.out.println("Infinity loop!");
             i++;
             if (i == 10) {
                 break;
             }
         }
         System.out.println("Infinity loop was stopped!");
     }
 }

