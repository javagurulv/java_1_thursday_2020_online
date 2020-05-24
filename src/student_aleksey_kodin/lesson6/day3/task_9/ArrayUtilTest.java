package student_aleksey_kodin.lesson6.day3.task_9;

import java.util.Arrays;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.testShouldCreateArray();
        arrayUtilTest.testShouldFillArrayWithRandomNumbers();
        arrayUtilTest.testShouldFindMaxNumber();
        arrayUtilTest.testShouldFindMinNumber();
        arrayUtilTest.testPrintArray();
        arrayUtilTest.testCheckHaveArrayNumber();
    }
    public void testShouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(10);
        printTestResult(testArray.length == 10,"Create array test");
    }
    public void testShouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(testArray);
        int sum = Arrays.stream(testArray).sum();
        printTestResult(sum > 0,"Random fill test");
    }
    public void testShouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(3);
        testArray[0] = 5;
        testArray[1] = 6;
        testArray[2] = 7;
        int max = arrayUtil.findMaxNumber(testArray);
        printTestResult(max == 7,"Max test");
    }
    public void testShouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(3);
        testArray[0] = 5;
        testArray[1] = 6;
        testArray[2] = 7;
        int min = arrayUtil.findMinNumber(testArray);
        printTestResult(min == 5,"Min test");
    }
    public void testPrintArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(testArray);
        arrayUtil.printArrayToConsole(testArray);
    }
    public void testCheckHaveArrayNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(3);
        testArray[0] = 5;
        testArray[1] = 6;
        testArray[2] = 7;
        boolean result = arrayUtil.checkHaveArrayNumber(testArray,6);
        printTestResult(result,"check array have number" );
        boolean result2 = arrayUtil.checkHaveArrayNumber(testArray,4);
        printTestResult(!result2,"check array have't number");
    }
    private void printTestResult(boolean isResultOk,String arrayTest) {
        if (isResultOk) {
            System.out.println("ArrayUtil class test - " + arrayTest + " = OK");
        } else {
            System.out.println("ArrayUtil class test - " + arrayTest + " = FAIL");
        }
    }
}
