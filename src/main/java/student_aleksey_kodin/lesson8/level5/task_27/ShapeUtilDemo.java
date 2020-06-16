package student_aleksey_kodin.lesson8.level5.task_27;

import student_aleksey_kodin.lesson8.level5.base_class.Shape;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

        System.out.println("Circle Area - " + circleArea);
        System.out.println("Circle Perimeter - " + circlePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);

        System.out.println("Square Area - " + squareArea);
        System.out.println("Square Perimeter - " + squarePerimeter);

    }
}
