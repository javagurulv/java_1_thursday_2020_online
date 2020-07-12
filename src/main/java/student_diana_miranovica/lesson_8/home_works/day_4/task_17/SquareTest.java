package student_diana_miranovica.lesson_8.home_works.day_4.task_17;

 class SquareTest {
  Square square = new Square("Square", 5);

  public static void main(String[] args) {
   SquareTest squareTest = new SquareTest();
   squareTest.calculateAreaTest();
   squareTest.calculatePerimeterTest();

  }

  public  void  calculateAreaTest(){
   showMeResult(square.calculateArea() == 25, "square area");
  }

  public void calculatePerimeterTest(){
   showMeResult(square.calculatePerimeter() == 20, "square perimeter");
  }

  private void showMeResult(boolean isResultOk, String nameOfTheTest) {
   if (isResultOk) {
    System.out.println("Circle Test - " + nameOfTheTest + " is Ok");
   } else {
    System.out.println("Circle Test - " + nameOfTheTest + " is Fail");
   }
  }


 }
