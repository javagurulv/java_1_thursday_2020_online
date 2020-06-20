package student_oleg_ivanov.lesson8.Day4.Task15;

class SquareTest {
    private  Square square = new Square(3);

    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.testArea();
        squareTest.testPerimeter();

    }
    private void testArea() {
        Square square = new Square(3);
        double result = square.calculateArea();
        printTestResult("Square Area ", 9, result);
    }
    private void testPerimeter() {
        Square square = new Square(3);
        double result = square.calculatePerimeter();
        printTestResult("Square Perimeter ", 12, result);
    }
    public void printTestResult( String name, double expectedResult, double result) {
        if (result == expectedResult) {
            System.out.println(name + "Test OK, expected result: " + expectedResult + ". Result: " + result);
        } else {
            System.out.println(name+ "Test Fail, expected result: " + expectedResult + ". Result: " + result);
        }
    }

}
