package student_julija_skopeca.practical_tasks.lesson_6.day_1.task_3_FizzBuzz;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.Test1FizzBuzz();
        fizzBuzzTest.Test2Fizz();
        fizzBuzzTest.Test3Buzz();
        fizzBuzzTest.Test4Nothing();
    }

    public void Test1FizzBuzz() {
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);
        if (result == "FizzBuzz") {
            System.out.println("Test1FizzBuzz test - OK");
        } else {
            System.out.println("Test1FizzBuzz test - FAIL");
        }
    }

    public void Test2Fizz() {
        int number = 9;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);
        if (result == "Fizz") {
            System.out.println("Test2Fizz test - OK");
        } else {
            System.out.println("Test2Fizz test - FAIL");
        }
    }

    public void Test3Buzz() {
        int number = 10;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);
        if (result == "Buzz") {
            System.out.println("Test3Buzz test - OK");
        } else {
            System.out.println("Test3Buzz test - FAIL");
        }
    }

    public void Test4Nothing() {
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
       String result = fizzBuzz.detect(number);
        if (Integer.toString(number).equals(result)) {
            System.out.println("Test4Nothing test - OK");
        } else {
            System.out.println("Test4Nothing test - FAIL");
        }
    }
}
