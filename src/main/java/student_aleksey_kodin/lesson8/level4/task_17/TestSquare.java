package student_aleksey_kodin.lesson8.level4.task_17;

class TestSquare {
    private final Square square = new Square(3);
    public static void main(String[] args) {
        TestSquare test = new TestSquare();
        test.testCalculateArea();
        test.testCalculatePerimeter();
    }
    private void testCalculateArea() {
        printTestResult(square.calculateArea() == 9,"Calculate area");
    }
    private void testCalculatePerimeter() {
        printTestResult(square.calculatePerimeter() == 12,"Calculate perimeter");
    }
    private void printTestResult(boolean isResultOk,String testName) {
        if (isResultOk) {
            System.out.println("Square test - " + testName + " = OK");
        } else {
            System.out.println("Square test - " + testName + " = FAIL");
        }
    }
}
