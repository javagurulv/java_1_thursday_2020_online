package student_vadim_sokolenko.Lesson6HomeWorks.Day3;

//import student_vadim_sokolenko.Lesson5HomeWorks.Day5.ArrayUtil;

public class ArrayUtilTest {


    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.arrayIsContainingCertainNumberTest1();
        test.arrayIsContainingCertainNumberTest2();
        test.howManyTimesArrayContainsCertainNumberTest();
        test.replaceNumberInArrayTest();
        test.reverseNumberOrderTest();
    }


    public void arrayIsContainingCertainNumberTest1() {
        boolean expectedResult = true;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(5);
        testArray[0] = 2;
        testArray[1] = 5;
        testArray[2] = 3;
        testArray[3] = 9;
        testArray[4] = 1;
        boolean actualResult = arrayUtil.arrayIsContainingCertainNumber(testArray, 5);

        if (actualResult == expectedResult) {
            System.out.println("Array is containing certain number TEST - OK");
        } else {
            System.out.println("Array is containing certain number TEST - Fail");
        }
    }

    public void arrayIsContainingCertainNumberTest2() {
        boolean expectedResult = false;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(5);
        testArray[0] = 2;
        testArray[1] = 5;
        testArray[2] = 3;
        testArray[3] = 9;
        testArray[4] = 1;
        boolean actualResult = arrayUtil.arrayIsContainingCertainNumber(testArray, 7);

        if (actualResult == expectedResult) {
            System.out.println("Array is containing certain number TEST - OK");
        } else {
            System.out.println("Array is containing certain number TEST - Fail");
        }
    }

    public void howManyTimesArrayContainsCertainNumberTest() {
        int expectedResult = 3;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(5);
        testArray[0] = 2;
        testArray[1] = 3;
        testArray[2] = 4;
        testArray[3] = 4;
        testArray[4] = 4;
        int actualResult = arrayUtil.howManyTimesArrayContainsCertainNumber(testArray, 4);

        if (actualResult == expectedResult) {
            System.out.println("How Many Times Array Contains Certain Number Test-ok");
        } else {
            System.out.println("HowMany Times Array Contains Certain Number Test-Fail");
        }
    }

    public void replaceNumberInArrayTest() {
        int expectedResult = 5;
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = arrayUtil.createArray(5);
        testArray[0] = 2;
        testArray[1] = 6;
        testArray[2] = 9;
        testArray[3] = 9;
        testArray[4] = 8;
        arrayUtil.replaceNumberInArray(testArray, 9, 5);
        int actualResult = testArray[2];

        if ((actualResult == expectedResult) && (testArray[3] != expectedResult)) {
            System.out.println("Replace Number In Array Test ok");
        } else {
            System.out.println("Replace Number In Array Test FAIL");
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
            System.out.println("Reverse Number Order Test OK");
        } else {
            System.out.println("Reverse Number Order Test FAIL! ");
        }
    }
}








