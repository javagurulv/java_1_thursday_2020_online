package student_aleksey_kodin.lesson4.dayx.supertask1;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.testFizzBuzz();
        fizzBuzzTest.testBuzz();
        fizzBuzzTest.testFizz();
        fizzBuzzTest.testVoid();
    }
    void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String result = fizzBuzz.detect(number);
        if(result.equals("FizzBuzz")) {
            System.out.println("FizzBuzz test - FizzBuzz value = OK");
        } else {
            System.out.println("FizzBuzz test - FizzBuzz value = FAIL");
        }
    }
    void testBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 10;
        String result = fizzBuzz.detect(number);
        if(result.equals("Buzz")) {
            System.out.println("FizzBuzz test - Buzz value = OK");
        } else {
            System.out.println("FizzBuzz test - Buzz value = FAIL");
        }
    }
    void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 9;
        String result = fizzBuzz.detect(number);
        if(result.equals("Fizz")) {
            System.out.println("FizzBuzz test - Fizz value = OK");
        } else {
            System.out.println("FizzBuzz test - Fizz value = FAIL");
        }
    }
    void testVoid() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 38;
        String result = fizzBuzz.detect(number);
        if(result.equals(Integer.toString(number))) {
            System.out.println("FizzBuzz test - Number value = OK");
        } else {
            System.out.println("FizzBuzz test - Number value = FAIL");
        }
    }
}
