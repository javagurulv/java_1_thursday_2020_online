package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_4.task_14;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldSort();
    }

    public void shouldSort() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(5);
        testArray[0] = 4;
        testArray[1] = 1;
        testArray[2] = 3;
        testArray[3] = 9;
        testArray[4] = 6;
        arrayUtil.sort(testArray);

        if (testArray[0] == 1 &&
            testArray[1] == 3 &&
            testArray[2] == 4 &&
            testArray[3] == 6 &&
            testArray[4] == 9) {
            System.out.println("shouldSort PASSED");
        } else {
            System.out.println("shouldSort FAILED");
        }
    }
}
