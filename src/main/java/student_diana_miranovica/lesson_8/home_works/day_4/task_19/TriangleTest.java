package student_diana_miranovica.lesson_8.home_works.day_4.task_19;

public class TriangleTest {

    Triangle triangle = new Triangle("Triangle", 3, 5, 8, 7);

    public static void main(String[] args) {
        TriangleTest triangleTest = new TriangleTest();
        triangleTest.calculateAreaTest();
        triangleTest.calculatePerimeterTest();

    }

    public void calculateAreaTest() {
        showMeResult(triangle.calculateArea() == 11,
                "calculateArea");

    }

    public void calculatePerimeterTest() {
        showMeResult(triangle.calculatePerimeter() == 16.0,
                "calculatePerimeter");

    }

    private void showMeResult(boolean isResultOk, String nameOfTheTest) {
        if (isResultOk) {
            System.out.println("Circle Test - " + nameOfTheTest + " is Ok");
        } else {
            System.out.println("Circle Test - " + nameOfTheTest + " is Fail");
        }

    }
}
