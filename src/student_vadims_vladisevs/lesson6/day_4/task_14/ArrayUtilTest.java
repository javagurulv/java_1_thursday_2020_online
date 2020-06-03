package student_vadims_vladisevs.lesson6.day_4.task_14;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest temp = new ArrayUtilTest();
        temp.testArraySortIncrease();
        temp.testArraySortDecrease();
    }



    public void testArraySortIncrease(){
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(10);
        test.fillArrayWithRandomNumbers(testArray);
        test.arraySortIncrease(testArray);
        int resultMax = test.findMaxNumber(testArray);
        int resultMin = test.findMinNumber(testArray);
        boolean isFirstNumberMinAndLastNumberMax = ((resultMax == testArray[testArray.length - 1]) && (resultMin == testArray[0]));
        printTestResult(true, isFirstNumberMinAndLastNumberMax);
    }

    public void testArraySortDecrease(){
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(10);
        test.fillArrayWithRandomNumbers(testArray);
        test.arraySortDecrease(testArray);
        int resultMax = test.findMaxNumber(testArray);
        int resultMin = test.findMinNumber(testArray);
        boolean isFirstNumberMaxAndLastNumberMin = ((resultMax == testArray[0]) && (resultMin == testArray[testArray.length - 1]));
        printTestResult(true, isFirstNumberMaxAndLastNumberMin);
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
