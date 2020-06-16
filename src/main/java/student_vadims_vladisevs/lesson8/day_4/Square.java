package student_vadims_vladisevs.lesson8.day_4;

 class Square extends Shape{

     private double length;

     Square(double length){
         super("Square");
        this.length = length;

     }
     @Override
     double calculateArea() {
         return Math.pow(length, 2);
     }

     @Override
     double calculatePerimeter() {
         return (4 * length);
     }
 }
