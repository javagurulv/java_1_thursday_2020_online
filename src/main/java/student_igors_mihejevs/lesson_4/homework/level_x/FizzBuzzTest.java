package student_igors_mihejevs.lesson_4.homework.level_x;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzz1(); // the number is divided by 3
        fizzBuzzTest.fizzBuzz2(); // the number is divided by 5
        fizzBuzzTest.fizzBuzz3(); // the number is divided by 3 and 5
        fizzBuzzTest.fizzBuzz4(); // the number isn't divided by 3 and 5
    }


    public void fizzBuzz1() {
        FizzBuzz test = new FizzBuzz();
        if (test.detect(27).equals("Fizz")) System.out.println("Test1 = OK");
        else System.out.println("Test1 = FAIL");
    }

    public void fizzBuzz2() {
        FizzBuzz test = new FizzBuzz();
        if (test.detect(55).equals("Buzz")) System.out.println("Test2 = OK");
        else System.out.println("Test2 = FAIL");
    }

    public void fizzBuzz3() {
        FizzBuzz test = new FizzBuzz();
        if (test.detect(15).equals("FizzBuzz")) System.out.println("Test3 = OK");
        else System.out.println("Test3 = FAIL");
    }

    public void fizzBuzz4() {
        FizzBuzz test = new FizzBuzz();
        if (test.detect(28).equals("28")) System.out.println("Test4 = OK");
        else System.out.println("Test4 = FAIL");
    }

}
