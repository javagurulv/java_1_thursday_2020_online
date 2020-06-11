package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_1.task_3;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.shouldReturnFizzBuzz();
        test.shouldReturnFizz();
        test.shouldReturnBuzz();
        test.shouldReturnNumber();
    }

    public void shouldReturnFizzBuzz() {
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(15);

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldReturnFizzBuzz PASSED");
        } else {
            System.out.println("shouldReturnFizzBuzz FAILED");
        }
    }

    public void shouldReturnFizz() {
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(9);

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldReturnFizz PASSED");
        } else {
            System.out.println("shouldReturnFizz FAILED");
        }
    }

    public void shouldReturnBuzz() {
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(10);

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldReturnBuzz PASSED");
        } else {
            System.out.println("shouldReturnBuzz FAILED");
        }
    }

    public void shouldReturnNumber() {
        String expectedResult = "" + 13;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(13);

        if (actualResult.equals(expectedResult)) {
            System.out.println("shouldReturnNumber PASSED");
        } else {
            System.out.println("shouldReturnNumber FAILED");
        }
    }
}
