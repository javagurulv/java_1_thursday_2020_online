package student_igors_mihejevs.lesson_8.homework.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

        System.out.println("Shape = " + circle.getTitle());
        System.out.println("Radius = " + ((Circle) circle).getRadius());
        System.out.println("Area = " + circle.calculateArea());
        System.out.println("Perimeter = " + circle.calculatePerimeter() + "\n");

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);

        System.out.println("Shape = " + square.getTitle());
        System.out.println("Side = " + ((Square) square).getSide());
        System.out.println("Area = " + square.calculateArea());
        System.out.println("Perimeter = " + square.calculatePerimeter() + "\n");

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);

        System.out.println("Shape = " + rectangle.getTitle());
        System.out.print("Width = " + ((Rectangle) rectangle).getWidth() + ", ");
        System.out.println("Height = " + ((Rectangle) rectangle).getHeight());
        System.out.println("Area = " + rectangle.calculateArea());
        System.out.println("Perimeter = " + rectangle.calculatePerimeter() + "\n");

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);

        System.out.println("Shape = " + triangle.getTitle());
        System.out.print("Side A = " + ((Triangle) triangle).getSideA() + ", ");
        System.out.print("Side B = " + ((Triangle) triangle).getSideB() + ", ");
        System.out.println("Side C = " + ((Triangle) triangle).getSideC());
        System.out.println("Area = " + triangle.calculateArea());
        System.out.println("Perimeter = " + triangle.calculatePerimeter());

    }

}
