package student_diana_miranovica.lesson_8.home_works.day_5.base;

class Triangle extends Shape {

     private double baseA;
     private double baseB;
     private double baseC;
     private double height;

     public Triangle(String title, double baseA, double baseB, double baseC, double height) {
         super("Triangle");
         this.baseA = baseA;
         this.baseB = baseB;
         this.baseC = baseC;
         this.height = height;
     }

     @Override
     double calculateArea() {
         return Math.round((0.5 * baseA * height));
     }

     @Override
     double calculatePerimeter() {
         return Math.round((baseA + baseB + baseC));
     }
 }
