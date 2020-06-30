package student_julija_skopeca.practical_tasks.lesson_8.level_4.task_18;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.area();
        test.perimeter();
    }

    public void area(){
        Rectangle rectangle = new Rectangle(1,2);
        double result = rectangle.calculateArea();
        if (result == 2){
            System.out.println("Area test - OK");
        } else {
            System.out.println("Area test - FALSE");
        }
    }

    public void perimeter(){
        Rectangle rectangle = new Rectangle(1,2);
        double result = rectangle.calculatePerimeter();
        if (result == 4){
            System.out.println("Perimiter test - OK");
        } else {
            System.out.println("Perimiter test - FALSE");
        }
    }
}
