package student_oleg_ivanov.lesson8.Day4.Task15;

class Circle extends Shape {

        private double radius;
        Circle(double radius){
            super("Circle");
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return (Math.PI * Math.pow(radius, 2));
        }

        @Override
        double calculatePerimeter() {
            return (Math.PI * 2 * radius);
        }

}
