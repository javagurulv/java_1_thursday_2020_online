package student_alexander_bogachenkov.lesson8_11062020.homeworks.day_5;

class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle area is " + circleArea);
        System.out.println("Circle perimeter is " + circlePerimeter);
    }

}
