package student_aleksey_kodin.lesson5.day5;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldCreateArray();
        arrayUtilTest.shouldFillArrayWithRandomNumbers();
    }
    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(10);
        if (testArray.length == 10) {
            System.out.println("ArrayUtil class test - Create array length=10 = OK");
        } else {
            System.out.println("ArrayUtil class test - Create array length=10 = FAIL");
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
}
