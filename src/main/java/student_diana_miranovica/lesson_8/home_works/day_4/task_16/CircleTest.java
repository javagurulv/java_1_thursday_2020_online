package student_diana_miranovica.lesson_8.home_works.day_4.task_16;


class CircleTest {

  private Circle circle = new Circle("Circle",5);

  public static void main(String[] args) {
   CircleTest circleTest = new CircleTest();
   circleTest.calculateAreaTest();
   circleTest.calculatePerimeterTest();


  }

  public void calculateAreaTest(){
      System.out.println(circle.calculateArea());
   showMeResult(circle.calculateArea() == 79,
           "calculateArea");

  }

  public void calculatePerimeterTest(){
      System.out.println(circle.calculatePerimeter());
   showMeResult(circle.calculatePerimeter() == 31,
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
