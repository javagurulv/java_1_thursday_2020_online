package student_julija_skopeca.practical_tasks.lesson_8.level_4.task_19;

public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.area();
        test.perimetr();
    }

    public void area(){
        Triangle triangle = new Triangle(1,2);
        double result = triangle.calculateArea();
        if(result == 1){
            System.out.println("Area test - OK");
        } else {
            System.out.println("Area test - FALSE");
        }
    }

    public void perimetr(){
        Triangle triangle = new Triangle(1,2);
        double result = triangle.calculatePerimeter();
        if(result == 3){
            System.out.println("Perimetr test - OK");
        } else {
            System.out.println("Perimetr test - FALSE");
        }
    }
}
