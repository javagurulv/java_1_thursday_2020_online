package student_vadims_vladisevs.lesson6.day_1.task_3;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest temp = new FizzBuzzTest();
        temp.testReturnFizz();
        temp.testReturnBuzz();
        temp.testReturnFizzBuzz();
        temp.testReturnNumber();

    }

    public void testReturnFizzBuzz(){
        FizzBuzz test = new FizzBuzz();
        String result = test.detect(15);
        printTestResult("FizzBuzz", result);
    }

    public void testReturnBuzz(){
        FizzBuzz test = new FizzBuzz();
        String result = test.detect(25);
        printTestResult("Buzz", result);
    }

    public void testReturnFizz(){
        FizzBuzz test = new FizzBuzz();
        String result = test.detect(9);
        printTestResult("Fizz", result);
    }

    public void testReturnNumber(){
        FizzBuzz test = new FizzBuzz();
        String result = test.detect(1);
        printTestResult("1", result);
    }



    public void printTestResult(String expectedResult, String result){
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        if (result.equals(expectedResult)) {
            System.out.println(testName + " OK;" + " expected result: " + expectedResult + "; result: " + result);
        } else {
            System.out.println(testName + " FAIL;" + " expected result: " + expectedResult + "; result: " + result);
        }
    }
}
