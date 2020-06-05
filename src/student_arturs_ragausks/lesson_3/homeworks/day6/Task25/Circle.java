package student_arturs_ragausks.lesson_3.homeworks.day6.Task25;

 class Circle {

     private double radius;
     public Circle(double circleRadius) {
         this.radius = circleRadius;
     }
     public double calculateArea() {
         double area = Math.PI * (this.radius * this.radius);
         return area;
     }

     public void circleArea() {
         System.out.println("Circle radius is " + this.radius + " circle area is " + calculateArea());
     }
 }
