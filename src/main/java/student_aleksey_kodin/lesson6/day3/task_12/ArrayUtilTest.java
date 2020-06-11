package student_aleksey_kodin.lesson6.day3.task_12;

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
        arrayUtilTest.testArrayCountRepeatNumber();
        arrayUtilTest.testReplace();
        arrayUtilTest.testReplaceAll();
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
    public void testArrayCountRepeatNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(3);
        testArray[0] = 5;
        testArray[1] = 5;
        testArray[2] = 7;
        long result= arrayUtil.arrayCountRepeatNumber(testArray,5);
        printTestResult(result == 2,"repeat number counter test");
        long result2= arrayUtil.arrayCountRepeatNumber(testArray,1);
        printTestResult(result2 == 0,"number no include to array " +
                                                      "[arrayCountRepeatNumber return = 0] test");
    }
    public void testReplace() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(3);
        testArray[0] = 5;
        testArray[1] = 5;
        testArray[2] = 7;
        arrayUtil.replace(testArray,5,0);
        boolean result = (testArray[0] == 0) && (testArray[1] != 0);
        printTestResult(result,"replace number test");
    }
    public void testReplaceAll() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(3);
        testArray[0] = 5;
        testArray[1] = 5;
        testArray[2] = 7;
        arrayUtil.replaceAll(testArray,5,0);
        boolean result = (testArray[0] == 0) && (testArray[1] == 0);
        printTestResult(result,"replace all number test");
    }
    private void printTestResult(boolean isResultOk,String arrayTest) {
        if (isResultOk) {
            System.out.println("ArrayUtil class test - " + arrayTest + " = OK");
        } else {
            System.out.println("ArrayUtil class test - " + arrayTest + " = FAIL");
        }
    }
}
