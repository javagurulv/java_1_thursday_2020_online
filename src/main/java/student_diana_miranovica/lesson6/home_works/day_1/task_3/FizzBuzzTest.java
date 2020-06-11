package student_diana_miranovica.lesson6.home_works.day_1.task_3;

 class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.buzzTest(10);
        fizzBuzzTest.fizzTest(9);
        fizzBuzzTest.fizzBuzzTest(15);
        fizzBuzzTest.voidTest(4);



    }
    public void printTestResult(boolean isOk, String numberName){
        if(isOk){
            System.out.println("FizzBuzz test - "+ numberName + "is OK");
        }else {
            System.out.println("FizzBuzz test - "+ numberName + "is Fail");
        }
    }

    public  void  fizzTest(int number){
        String result = fizzBuzz.detect(number);
            printTestResult(result.equals("Fizz"),"Fizz");

    }
    public  void  buzzTest(int number){
        String result = fizzBuzz.detect(number);
        printTestResult(result.equals("Buzz"),"Buzz");

    }
    public  void  fizzBuzzTest(int number){
        String result = fizzBuzz.detect(number);
        printTestResult(result.equals("FizzBuzz"),"FizBuzz");

    }
    public  void  voidTest(int number){
        String result = fizzBuzz.detect(number);
        printTestResult(result.equals(Integer.toString(number)),"Number value");

    }
}
