package student_diana_miranovica.lesson_8.home_works.day_4.task_19;

 abstract class Shape {

     private String title;

     Shape(String title) {
         this.title = title;
     }

     abstract double calculateArea();

     abstract double calculatePerimeter();
}
