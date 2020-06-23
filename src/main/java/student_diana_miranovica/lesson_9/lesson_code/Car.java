package student_diana_miranovica.lesson_9.lesson_code;

 class Car {

     boolean isSwithedOn;
     double fuel = 100.0;

     void start() {
         if (fuel > 0) {
             this.isSwithedOn = true;
             System.out.println();
         } else {
             System.out.println("Can not Start!");
         }
     }


 }