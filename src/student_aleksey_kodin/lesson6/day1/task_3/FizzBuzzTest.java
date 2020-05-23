package student_aleksey_kodin.lesson6.day1.task_3;

class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.testFizzBuzz(45);
        fizzBuzzTest.testBuzz(10);
        fizzBuzzTest.testFizz(9);
        fizzBuzzTest.testVoid(38);
    }
    void testFizzBuzz(int number) {
        String result = fizzBuzz.detect(number);
            printTestResult(result.equals("FizzBuzz"),"FizzBuzz");
    }
    void testBuzz(int number) {
        String result = fizzBuzz.detect(number);
            printTestResult(result.equals("Buzz"),"Buzz");
    }
    void testFizz(int number) {
        String result = fizzBuzz.detect(number);
            printTestResult(result.equals("Fizz"),"Fizz");
    }
    void testVoid(int number) {
        String result = fizzBuzz.detect(number);
            printTestResult(result.equals(Integer.toString(number)),"Number value");
    }
    private void printTestResult(boolean isResultOk,String returnNumberName) {
        if (isResultOk) {
            System.out.println("FizzBuzz test - " + returnNumberName + " = OK");
        } else {
            System.out.println("FizzBuzz test - " + returnNumberName + " = FAIL");
        }
    }
}
