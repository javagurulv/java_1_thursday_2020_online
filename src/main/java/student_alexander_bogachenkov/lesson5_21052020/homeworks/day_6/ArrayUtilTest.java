package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_6;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] actualResult = arrayUtil.createArray(5);

        if (actualResult.length == 5) {
            System.out.println("shouldCreateArray PASSED");
        } else {
            System.out.println("shouldCreateArray FAILED");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] actualResult = arrayUtil.createArray(5);
        Arrays.fill(actualResult, -1);
        arrayUtil.fillArrayWithRandomNumbers(actualResult);

        int sum = 0;
        for (int i = 0; i < actualResult.length; i++) {
            sum += actualResult[i];
        }

        if (sum >= 0) {
            System.out.println("shouldFillArrayWithRandomNumbers PASSED");
        } else {
            System.out.println("shouldFillArrayWithRandomNumbers FAILED");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(5);
        testArray[0] = 9;
        testArray[1] = 3;
        testArray[2] = 5;
        testArray[3] = 16;
        testArray[4] = 7;
        int actualResult = arrayUtil.findMaxNumber(testArray);

        if (actualResult == 16) {
            System.out.println("shouldFindMaxNumber PASSED");
        } else {
            System.out.println("shouldFindMaxNumber FAILED");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(5);
        testArray[0] = 9;
        testArray[1] = 3;
        testArray[2] = 5;
        testArray[3] = 16;
        testArray[4] = 7;
        int actualResult = arrayUtil.findMinNumber(testArray);

        if (actualResult == 3) {
            System.out.println("shouldFindMinNumber PASSED");
        } else {
            System.out.println("shouldFindMinNumber FAILED");
        }
    }
}