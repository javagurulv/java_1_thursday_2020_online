package student_vadims_vladisevs.lesson6.day_4.task_18;

public class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest temp = new TwoDimensionalArrayTest();
        temp.testCreateArray();
        temp.testFillArrayWithRandomNumbers();
        temp.testArraySum();
    }

    public void testArraySum(){
        TwoDimensionalArray test = new TwoDimensionalArray();
        int[][] testArray = test.createArray(2,2);
        testArray[0][0] = 1;
        testArray[0][1] = 1;
        testArray[1][0] = 1;
        testArray[1][1] = 1;

        int result = test.arraySum(testArray);
        printTestResult(4, result);
    }

    public void testFillArrayWithRandomNumbers(){
        TwoDimensionalArray test = new TwoDimensionalArray();
        int[][] testArray = test.createArray(3,3);
        test.fillArrayWithRandomNumbers(testArray);
        int sum = test.arraySum(testArray);
        boolean result = (sum > 0);
        printTestResult(true, result);
    }


    public void testCreateArray(){
        TwoDimensionalArray test = new TwoDimensionalArray();
        int[][] testArray = test.createArray(2,3);
        boolean result = ((testArray.length == 2) && (testArray[0].length == 3));
        printTestResult(true, result);

    }


    public void printTestResult(boolean expectedResult, boolean result){
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        if (result == expectedResult) {
            System.out.println(testName + " OK;" + " expected result: " + expectedResult + "; result: " + result);
        } else {
            System.out.println(testName + " FAIL;" + " expected result: " + expectedResult + "; result: " + result);
        }
    }

    public void printTestResult(int expectedResult, int result){
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        if (result == expectedResult) {
            System.out.println(testName + " OK;" + " expected result: " + expectedResult + "; result: " + result);
        } else {
            System.out.println(testName + " FAIL;" + " expected result: " + expectedResult + "; result: " + result);
        }
    }
}
