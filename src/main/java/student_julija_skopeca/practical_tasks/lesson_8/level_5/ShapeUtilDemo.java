package student_julija_skopeca.practical_tasks.lesson_8.level_5;

class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle Area " + "- " + circleArea);
        System.out.println("Circle Perimeter " + "- " + circlePerimeter);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Circle Area " + "- " + triangleArea);
        System.out.println("Circle Perimeter " + "- " + trianglePerimeter);
    }
}
