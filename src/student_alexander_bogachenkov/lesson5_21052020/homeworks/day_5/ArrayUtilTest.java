package student_alexander_bogachenkov.lesson5_21052020.homeworks.day_5;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
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
}
