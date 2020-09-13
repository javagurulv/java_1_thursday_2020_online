package student_igors_mihejevs.lesson_8.homework.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeDemo {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(8, 5);
        Shape triangle = new Triangle(10, 10, 10);

        System.out.println("Shape = " + circle.getTitle());
        System.out.println("Radius = " + ((Circle) circle).getRadius());
        System.out.println("Area = " + circle.calculateArea());
        System.out.println("Perimeter = " + circle.calculatePerimeter() + "\n");

        System.out.println("Shape = " + square.getTitle());
        System.out.println("Side = " + ((Square) square).getSide());
        System.out.println("Area = " + square.calculateArea());
        System.out.println("Perimeter = " + square.calculatePerimeter() + "\n");

        System.out.println("Shape = " + rectangle.getTitle());
        System.out.print("Width = " + ((Rectangle) rectangle).getWidth() + ", ");
        System.out.println("Height = " + ((Rectangle) rectangle).getHeight());
        System.out.println("Area = " + rectangle.calculateArea());
        System.out.println("Perimeter = " + rectangle.calculatePerimeter() + "\n");

        System.out.println("Shape = " + triangle.getTitle());
        System.out.print("Side A = " + ((Triangle) triangle).getSideA() + ", ");
        System.out.print("Side B = " + ((Triangle) triangle).getSideB() + ", ");
        System.out.println("Side C = " + ((Triangle) triangle).getSideC());
        System.out.println("Area = " + triangle.calculateArea());
        System.out.println("Perimeter = " + triangle.calculatePerimeter());

    }

}
