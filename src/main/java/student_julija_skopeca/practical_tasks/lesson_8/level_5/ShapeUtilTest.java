package student_julija_skopeca.practical_tasks.lesson_8.level_5;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.area();
        test.perimeter();
    }

    public void area (){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double result = shapeUtil.calculateArea(shapes);

        double circleArea = shapes[0].calculateArea();
        double squareArea = shapes[1].calculateArea();
        double rectangleArea = shapes[2].calculateArea();
        double triangleArea = shapes[3].calculateArea();
        double resultToCompare = circleArea + squareArea + rectangleArea + triangleArea;

        if (result == resultToCompare) {
            System.out.println("Test area - OK");
        } else {
            System.out.println("Test area - FALSE");
        }
    }

    public void perimeter (){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double result = shapeUtil.calculatePerimeter(shapes);

        double circlePerimeter = shapes[0].calculatePerimeter();
        double squarePerimeter = shapes[1].calculatePerimeter();
        double rectanglePerimeter = shapes[2].calculatePerimeter();
        double trianglePerimeter = shapes[3].calculatePerimeter();
        double resultToCompare = circlePerimeter + squarePerimeter + rectanglePerimeter + trianglePerimeter;

        if (result == resultToCompare) {
            System.out.println("Test perimeter - OK");
        } else {
            System.out.println("Test perimeter - FALSE");
        }
    }


}
