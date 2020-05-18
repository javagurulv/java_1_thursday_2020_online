package student_aleksey_kodin.lesson5.day6;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldCreateArray();
        arrayUtilTest.shouldFillArrayWithRandomNumbers();
        arrayUtilTest.shouldFindMaxNumber();
        arrayUtilTest.shouldFindMinNumber();
        arrayUtilTest.testPrintArray();
    }
    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(10);
        if (testArray.length == 10) {
            System.out.println("ArrayUtil class test - Create array length = 10 = OK");
        } else {
            System.out.println("ArrayUtil class test - Create array length = 10 = FAIL");
        }
    }
    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(testArray);
        int sum = Arrays.stream(testArray).sum();
        if(sum > 0) {
            System.out.println("ArrayUtil class test - If Sum > 0 array fill test = OK");
        } else {
            System.out.println("ArrayUtil class test - Array fill test = FAIL");
        }
    }
    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(3);
        testArray[0] = 5;
        testArray[1] = 6;
        testArray[2] = 7;
        int max = arrayUtil.findMaxNumber(testArray);
        if (max == 7) {
            System.out.println("ArrayUtil class test - If max = 7 test = OK");
        } else {
            System.out.println("ArrayUtil class test - If max value test = FAIL");
        }
    }
    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(3);
        testArray[0] = 5;
        testArray[1] = 6;
        testArray[2] = 7;
        int min = arrayUtil.findMinNumber(testArray);
        if (min == 5) {
            System.out.println("ArrayUtil class test - If min = 5 test = OK");
        } else {
            System.out.println("ArrayUtil class test - If min value test = FAIL");
        }
    }
    public void testPrintArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(testArray);
        arrayUtil.printArrayToConsole(testArray);
    }
}
