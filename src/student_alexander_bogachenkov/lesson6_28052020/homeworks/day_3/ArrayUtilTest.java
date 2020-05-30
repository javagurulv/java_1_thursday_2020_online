package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_3;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.isContainingCertainNumberTest1();
        test.isContainingCertainNumberTest2();
    }

    public void isContainingCertainNumberTest1() {
        boolean expectedResult = false;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(3);
        testArray[0] = 2;
        testArray[1] = 5;
        testArray[2] = 8;
        boolean actualResult = arrayUtil.isContainingCertainNumber(testArray,7);

        if (actualResult == expectedResult) {
            System.out.println("isContainingCertainNumberTest1 PASSED");
        } else {
            System.out.println("isContainingCertainNumberTest1 FAILED");
        }
    }

    public void isContainingCertainNumberTest2() {
        boolean expectedResult = true;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(3);
        testArray[0] = 2;
        testArray[1] = 5;
        testArray[2] = 8;
        boolean actualResult = arrayUtil.isContainingCertainNumber(testArray,8);

        if (actualResult == expectedResult) {
            System.out.println("isContainingCertainNumberTest2 PASSED");
        } else {
            System.out.println("isContainingCertainNumberTest2 FAILED");
        }
    }
}
