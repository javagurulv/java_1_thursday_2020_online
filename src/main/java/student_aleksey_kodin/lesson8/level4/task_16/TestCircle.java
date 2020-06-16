package student_aleksey_kodin.lesson8.level4.task_16;

class TestCircle {
    private final Circle circle = new Circle(10);
    public static void main(String[] args) {
        TestCircle test = new TestCircle();
        test.testCalculateArea();
        test.testCalculatePerimeter();
    }
    private void testCalculateArea() {
        printTestResult(circle.calculateArea() == 314.0,"Calculate area");
    }
    private void testCalculatePerimeter() {
        printTestResult(circle.calculatePerimeter() == 63.0,"Calculate perimeter");
    }
    private void printTestResult(boolean isResultOk,String testName) {
        if (isResultOk) {
            System.out.println("Circle test - " + testName + " = OK");
        } else {
            System.out.println("Circle test - " + testName + " = FAIL");
        }
    }
}
