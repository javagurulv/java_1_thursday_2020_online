package student_julija_skopeca.practical_tasks.lesson_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        test1();
    }

        //test 1: f = -1; s = -3; r = -13
        public static void  test1() {
          int firstnumber = -10;
          int secondnumber = -3;
          Calculator calculator = new Calculator();
          int actualresult = calculator.sum(firstnumber, secondnumber);

          if (actualresult == -13) {
              System.out.println("Test 1 = ok");
          } else {
              System.out.println("Test 1 = fail");
          }

        }
        //test 2: f = 0; s= 0;  r = 0
        public static void  test2() {


        }
        //test 3:
        public static void  test3() {


        }
        //test 4:
        public static void  test4() {


        }
    }

