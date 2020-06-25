package student_julija_skopeca.practical_tasks.lesson_8.level_4.task_16;

class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.area();
        test.perimiter();
    }

    public void area() {
      Circle circle = new Circle(1);
      double result = circle.calculateArea();
      if (result == 3.0) {
          System.out.println("test Area - ok");
      } else {
          System.out.println("test Area - false");
      }
    }

    public void perimiter() {
        Circle circle = new Circle(1);
        double result = circle.calculatePerimeter();
        if (result == 6.0) {
            System.out.println("test Area - ok");
        } else {
            System.out.println("test Area - false");
        }
    }

}
