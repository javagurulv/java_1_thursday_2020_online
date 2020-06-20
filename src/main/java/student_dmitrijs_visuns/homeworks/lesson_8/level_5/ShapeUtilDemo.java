package student_dmitrijs_visuns.homeworks.lesson_8.level_5;

// Task_27

class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("This is a rectangle. It's area is " + rectangleArea + ", perimeter is " + rectanglePerimeter);

    }

}
