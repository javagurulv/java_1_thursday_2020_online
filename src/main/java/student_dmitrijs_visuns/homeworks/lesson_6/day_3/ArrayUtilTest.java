package student_dmitrijs_visuns.homeworks.lesson_6.day_3;


class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest newTest = new ArrayUtilTest();
        newTest.findNumberTest(); // Task_9
        newTest.howManyTimesIsNumberInArrayTest(); // Task_10
        newTest.replaceNumberInArrayTest(); // Task_11
        newTest.replaceAllTest(); // Task_12
        newTest.reverseArrayNumbersTest(); // Task_13

    }

    public void findNumberTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[]{3, 5, 9, 12, 78};
        if (arrayUtil.findNumberInArray(array, 5)) {
            System.out.println("Find number in array test - OK");
        } else {
            System.out.println("Find number in array test - FAIL");
        }
    }

    public void howManyTimesIsNumberInArrayTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[]{12, 5, 9, 12, 12};
        if (arrayUtil.howManyTimesIsNumberInArray(array, 12) == 3) {
            System.out.println("How many times is number in array test - OK");
        } else {
            System.out.println("How many times is number in array test - FAIL");
        }

    }

    public void replaceNumberInArrayTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[]{12, 5, 9, 12, 12};
        arrayUtil.replaceNumberInArray(array, 12, 3);
        if (array[0] == 3) {
            System.out.println("Replace number in array test - OK");
        } else {
            System.out.println("Replace number in array test - FAIL");
        }
    }

    public void replaceAllTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[]{12, 5, 9, 12, 12};
        arrayUtil.replaceAll(array, 12, 3);
        if ((array[0] == 3) && (array[3] == 3) && (array[4] == 3)) {
            System.out.println("Replace all given numbers in array test - OK");
        } else {
            System.out.println("Replace all given numbers in array test - FAIL");
        }
    }

    public void reverseArrayNumbersTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[]{1, 2, 3};
        arrayUtil.reverseArrayNumbers(array);
        if ((array[0] == 3) && (array[1] == 2) && (array[2] == 1)) {
            System.out.println("Reverse array numbers test - OK");
        } else {
            System.out.println("Reverse array numbers test - FAIL");
        }
    }

}