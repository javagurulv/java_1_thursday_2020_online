package student_vadims_vladisevs.lesson8.day_5;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle area = " + circleArea);
        System.out.println("Circle perimeter = " + circlePerimeter);


        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Square area = " + squareArea);
        System.out.println("Square perimeter = " + squarePerimeter);

        Shape rectangle = shapeUtil.createRandomCircle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Rectangle area = " + rectangleArea);
        System.out.println("Rectangle perimeter = " + rectanglePerimeter);

        Shape triangle = shapeUtil.createRandomCircle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Triangle area = " + triangleArea);
        System.out.println("Triangle perimeter = " + trianglePerimeter);

    }

}
