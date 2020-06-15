package student_aleksey_kodin.lesson8.level4.task_18;

class TestRectangle {
    private final Rectangle rectangle = new Rectangle(3,5);
    public static void main(String[] args) {
        TestRectangle test = new TestRectangle();
        test.testCalculateArea();
        test.testCalculatePerimeter();
    }
    private void testCalculateArea() {
        printTestResult(rectangle.calculateArea() == 15,"Calculate area");
    }
    private void testCalculatePerimeter() {
        printTestResult(rectangle.calculatePerimeter() == 16,"Calculate perimeter");
    }
    private void printTestResult(boolean isResultOk,String testName) {
        if (isResultOk) {
            System.out.println("Rectangle test - " + testName + " = OK");
        } else {
            System.out.println("Rectangle test - " + testName + " = FAIL");
        }
    }
}
