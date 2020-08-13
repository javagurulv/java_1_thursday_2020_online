package student_diana_miranovica.lesson_8.home_works.day_5.base;

class Circle extends Shape {

     private double radius;

     public Circle( String title, double radius) {
         super(title);
         this.radius  = radius;
     }

     @Override
     double calculateArea() {
        return Math.round((Math.PI * radius * radius));
     }

     @Override
     double calculatePerimeter() {
         return Math.round((2 * Math.PI * radius));
     }
 }
