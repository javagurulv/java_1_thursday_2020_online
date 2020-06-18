package student_oleg_ivanov.lesson8.Day4.Task15;

class TriangleTest {
    private  Triangle triangle = new Triangle(8.0, 6.0, 7.0,8.0);

    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.testArea();
        triangleTest.testPerimeter();

    }
    private void testArea() {
        Triangle triangle = new Triangle(8.0, 6.0, 7.0,8.0);
        double result = triangle.calculateArea();
        printTestResult("Triangle Area ", 32, result);
    }
    private void testPerimeter() {
        Triangle triangle = new Triangle(8.0, 6.0, 7.0,8.0);
        double result = triangle.calculatePerimeter();
        printTestResult("Triangle Perimeter ", 21, result);
    }
    public void printTestResult( String name, double expectedResult, double result) {
        if (result == expectedResult) {
            System.out.println(name + "Test OK, expected result: " + expectedResult + ". Result: " + result);
        } else {
            System.out.println(name+ "Test Fail, expected result: " + expectedResult + ". Result: " + result);
        }
    }

}

