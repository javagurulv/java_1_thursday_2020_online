package student_aleksey_kodin.lesson8.level4.task_19;

class TestTriangle {
    private final Triangle triangle = new Triangle(3,5,5,10);
    public static void main(String[] args) {
        TestTriangle test = new TestTriangle();
        test.testCalculateArea();
        test.testCalculatePerimeter();
    }
    private void testCalculateArea() {
        printTestResult(triangle.calculateArea() == 15,"Calculate area");
    }
    private void testCalculatePerimeter() {
        printTestResult(triangle.calculatePerimeter() == 13,"Calculate perimeter");
    }
    private void printTestResult(boolean isResultOk,String testName) {
        if (isResultOk) {
            System.out.println("Triangle test - " + testName + " = OK");
        } else {
            System.out.println("Triangle test - " + testName + " = FAIL");
        }
    }
}
