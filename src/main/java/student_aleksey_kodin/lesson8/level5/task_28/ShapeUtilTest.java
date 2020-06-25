package student_aleksey_kodin.lesson8.level5.task_28;

import student_aleksey_kodin.lesson8.level5.base_class.Shape;

class ShapeUtilTest {

    private final ShapeUtil shapeUtil = new ShapeUtil();
    private final Shape[] shape = new Shape[4];


    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();

        test.calculateAreaArray();
        test.calculatePerimeterArray();
    }
    private void calculateAreaArray() {
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();

        double circleArea = shape[0].calculateArea();
        double squareArea = shape[1].calculateArea();
        double rectangleArea = shape[2].calculateArea();
        double triangleArea = shape[3].calculateArea();
        double areaSum = circleArea + squareArea + rectangleArea + triangleArea;

        printTestResult(shapeUtil.calculateArea(shape) == areaSum, "Calculate total area");
    }
    private void calculatePerimeterArray() {
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();

        double circlePerimeter = shape[0].calculatePerimeter();
        double squarePerimeter = shape[1].calculatePerimeter();
        double rectanglePerimeter = shape[2].calculatePerimeter();
        double trianglePerimeter = shape[3].calculatePerimeter();
        double perimeterSum = circlePerimeter + squarePerimeter + rectanglePerimeter + trianglePerimeter;

        printTestResult(shapeUtil.calculatePerimeter(shape) == perimeterSum, "Calculate total perimeter");
    }

    private static void printTestResult(boolean isResultOk,String testName) {
        if (isResultOk) {
            System.out.println("test - " + testName + " = OK");
        } else {
            System.out.println("test - " + testName + " = FAIL");
        }
    }
}
