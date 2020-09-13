package student_igors_mihejevs.lesson_6.homework.level_1;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.test("Fizz", 27); // the number is divided by 3
        fizzBuzzTest.test("Buzz", 55); // the number is divided by 5
        fizzBuzzTest.test("FizzBuzz", 15); // the number is divided by 3 and 5
        fizzBuzzTest.test("" +  28, 28); // the number isn't divided by 3 and 5
    }

    public void test(String answerName, int testNumber) {
        FizzBuzz test = new FizzBuzz();
        if (test.detect(testNumber).equals(answerName)) System.out.println(answerName + " test = OK");
        else System.out.println(answerName + " test = FAIL");
    }

}
