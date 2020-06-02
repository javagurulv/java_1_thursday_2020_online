package student_dmitrijs_visuns.homeworks.lesson_6.day_4.task_14;


class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest newTest = new ArrayUtilTest();
        newTest.sortArrayTest();

    }

    public void sortArrayTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[]{3, 5, 2, 4, 1};
        arrayUtil.sortArray(array);

        if (array[0] == 1 &&
            array[1] == 2 &&
            array[2] == 3 &&
            array[3] == 4 &&
            array[4] == 5) {
            System.out.println("Sort array test - OK");
        } else {
            System.out.println("Sort array test #1 - FAIL");
        }
    }


}
