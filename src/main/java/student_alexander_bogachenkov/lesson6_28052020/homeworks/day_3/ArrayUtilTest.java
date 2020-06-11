package student_alexander_bogachenkov.lesson6_28052020.homeworks.day_3;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.isContainingCertainNumberTest1();
        test.isContainingCertainNumberTest2();
        test.howManyTimesArrayContainsCertainNumberTest();
        test.replaceNumberInArrayTest();
        test.replaceNumbersInArrayTest();
        test.reverseNumberOrderTest();
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

    public void howManyTimesArrayContainsCertainNumberTest() {
        int expectedResult = 4;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(5);
        testArray[0] = 2;
        testArray[1] = 6;
        testArray[2] = 6;
        testArray[3] = 6;
        testArray[4] = 6;
        int actualResult = arrayUtil.howManyTimesArrayContainsCertainNumber(testArray, 6);

        if (actualResult == expectedResult) {
            System.out.println("howManyTimesArrayContainsCertainNumberTest PASSED");
        } else {
            System.out.println("howManyTimesArrayContainsCertainNumberTest FAILED");
        }
    }

    public void replaceNumberInArrayTest() {
        int expectedResult = 10;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(5);
        testArray[0] = 2;
        testArray[1] = 6;
        testArray[2] = 9;
        testArray[3] = 9;
        testArray[4] = 8;
        arrayUtil.replaceNumberInArray(testArray, 9,10);
        int actualResult = testArray[2];

        if ((actualResult == expectedResult) && (testArray[3] != expectedResult)) {
            System.out.println("replaceNumberInArrayTest PASSED");
        } else {
            System.out.println("replaceNumberInArrayTest FAILED");
        }
    }

    public void replaceNumbersInArrayTest() {
        int expectedResult = 10;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(5);
        testArray[0] = 2;
        testArray[1] = 6;
        testArray[2] = 9;
        testArray[3] = 9;
        testArray[4] = 8;
        arrayUtil.replaceNumbersInArray(testArray, 9,10);

        if ((testArray[2] == expectedResult) && (testArray[3] == expectedResult)) {
            System.out.println("replaceNumbersInArrayTest PASSED");
        } else {
            System.out.println("replaceNumbersInArrayTest FAILED");
        }
    }

    public void reverseNumberOrderTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(5);
        testArray[0] = 1;
        testArray[1] = 2;
        testArray[2] = 3;
        testArray[3] = 4;
        testArray[4] = 5;
        arrayUtil.reverseNumberOrder(testArray);

        if ((testArray[0] == 5) &&
            (testArray[1] == 4) &&
            (testArray[2] == 3) &&
            (testArray[3] == 2) &&
            (testArray[4] == 1)) {
            System.out.println("reverseNumberOrderTest PASSED");
        } else {
            System.out.println("reverseNumberOrderTest FAILED");
        }
    }
}
