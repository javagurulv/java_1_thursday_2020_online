package student_dmitrijs_visuns.homeworks.lesson_6.day_3;


class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest newTest = new ArrayUtilTest();
        newTest.findNumberTest(); // Task_9
        newTest.howManyTimesIsNumberInArrayTest(); // Task_10
        newTest.replaceNumberInArrayTest(); // Task_11

    }

    public void findNumberTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[] {3, 5, 9, 12, 78};
        if (arrayUtil.findNumberInArray(array, 5)) {
            System.out.println("Find number in array test - OK");
        } else {
            System.out.println("Find number in array test - FAIL");
        }
    }

    public void howManyTimesIsNumberInArrayTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[] {12, 5, 9, 12, 12};
        if (arrayUtil.howManyTimesIsNumberInArray(array, 12) == 3) {
            System.out.println("How many times is number in array test - OK");
        } else {
                System.out.println("How many times is number in array test - FAIL");
        }

    }

    public void replaceNumberInArrayTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[] {12, 5, 9, 12, 12};
        arrayUtil.replaceNumberInArray(array, 12, 3);
        System.out.println(array[0]);
        if (array[0] == 3) {
            System.out.println("Replace number in array test - OK");
        } else {
            System.out.println("Replace number in array test - FAIL");
        }
    }
}
