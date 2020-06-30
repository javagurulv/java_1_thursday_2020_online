package student_julija_skopeca.practical_tasks.lesson_8.level_4.task_17;

class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.area();
        test.perimiter();
    }

    public void area(){
        Square square = new Square(2);
        double result = square.calculateArea();
        if(result == 4) {
            System.out.println("Area test - OK");
        } else {
            System.out.println("Area test - FALSE");
        }
    }

    public void perimiter(){
        Square square = new Square(2);
        double result = square.calculatePerimeter();
        if(result == 8) {
            System.out.println("Perimiter test - OK");
        } else {
            System.out.println("Perimiter test - FALSE");
        }
    }

}
