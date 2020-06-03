package student_oleg_ivanov.lesson6.day1.Task3;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.testReturnFizz();
        fizzBuzzTest.testReturnBuzz();
        fizzBuzzTest.testReturnFizzBuzz();
        fizzBuzzTest.testInitialNumber();


    }
    public void testReturnFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(9);
        printResult("Fizz", result);
    }
    public void testReturnBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(20);
        printResult("Buzz", result);
    }
    public void testReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(30);
        printResult("FizzBuzz", result);
    }
    public void testInitialNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(31);
        printResult("31", result);
    }

    public void printResult(String expectedResult, String result) {
        if (result.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Fail");
        }
    }

}
