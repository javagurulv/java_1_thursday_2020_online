package student_dmitrijs_visuns.homeworks.lesson_6.day_1.task_3;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest newTest = new FizzBuzzTest();
        newTest.testForFizz();
        newTest.testForBuzz();
        newTest.testForFizzBuzz();
        newTest.testForReturnWrongNumber();


    }



    public void testForFizz () {
        FizzBuzz fizz = new FizzBuzz();
        if (fizz.detect(3).equals("Fizz")) {
            System.out.println("Test for FIZZ - OK");
        } else {
            System.out.println("Test for FIZZ - FAIL");
        }

    }


    public void testForBuzz () {
        FizzBuzz buzz = new FizzBuzz();
        if (buzz.detect(5).equals("Buzz")) {
            System.out.println("Test for BUZZ - OK");
        } else {
            System.out.println("Test for BUZZ - FAIL");
        }

    }


    public void testForFizzBuzz () {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if (fizzBuzz.detect(15).equals("FizzBuzz")) {
            System.out.println("Test for FIZZBUZZ - OK");
        } else {
            System.out.println("Test for FIZZBUZZ - FAIL");
        }

    }


    public void testForReturnWrongNumber () {
        FizzBuzz returnNumber = new FizzBuzz();
        if (returnNumber.detect(31).equals("31")) {
            System.out.println("Test for wrong number return - OK");
        } else {
            System.out.println("Test for wrong number return - FAIL");
        }

    }


}
