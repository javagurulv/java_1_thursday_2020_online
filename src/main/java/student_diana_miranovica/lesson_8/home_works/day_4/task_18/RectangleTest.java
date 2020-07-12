package student_diana_miranovica.lesson_8.home_works.day_4.task_18;

public class RectangleTest {

    Rectangle rectangle = new Rectangle("Rectangle", 3 , 5);

    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.calculateAreaTest();
        rectangleTest.calculatePerimeterTest();


    }

    public void calculateAreaTest(){
        showMeResult(rectangle.calculateArea() == 15.0,
                "calculateArea");

    }

    public void calculatePerimeterTest(){
        showMeResult(rectangle.calculatePerimeter() == 16.0,
                "calculatePerimeter");

    }

    private void showMeResult(boolean isResultOk, String nameOfTheTest){
        if(isResultOk){
            System.out.println( "Circle Test - " + nameOfTheTest + " is Ok");
        }else {
            System.out.println("Circle Test - " + nameOfTheTest + " is Fail");
        }

    }
}
