package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_x.super_task_1;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.testFizz();
        test.testBuzz();
        test.testFizzBuzz();
        test.testNotFizzNotBuzz();
    }

    public void testFizz() {
        int number = 9;
        String expectedResult = "Fizz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);

        if (actualResult.equals(expectedResult)) {
            System.out.println("testFizz PASSED");
        } else {
            System.out.println("testFizz FAILED");
            System.out.println("Expected result is: " + expectedResult + ", but actual is " + actualResult);
        }
    }

    public void testBuzz() {
        int number = 20;
        String expectedResult = "Buzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);

        if (actualResult.equals(expectedResult)) {
            System.out.println("testBuzz PASSED");
        } else {
            System.out.println("testBuzz FAILED");
            System.out.println("Expected result is: " + expectedResult + ", but actual is " + actualResult);
        }
    }

    public void testFizzBuzz() {
        int number = 15;
        String expectedResult = "FizzBuzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);

        if (actualResult.equals(expectedResult)) {
            System.out.println("testFizzBuzz PASSED");
        } else {
            System.out.println("testFizzBuzz FAILED");
            System.out.println("Expected result is: " + expectedResult + ", but actual is " + actualResult);
        }
    }

    public void testNotFizzNotBuzz() {
        int number = 7;
        String expectedResult = "" + number;

        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(number);

        if (actualResult.equals(expectedResult)) {
            System.out.println("testNotFizzNotBuzz PASSED");
        } else {
            System.out.println("testNotFizzNotBuzz FAILED");
            System.out.println("Expected result is: " + expectedResult + ", but actual is: " + actualResult);
        }
    }
}
