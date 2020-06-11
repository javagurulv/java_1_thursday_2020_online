package student_oleg_ivanov.lesson6.day4.task14;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.testArraySortInCrease();
    }
    public void testArraySortInCrease() {
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(5);
        test.fillArrayWithRandomNumbers(testArray);
        test.arraySortInCrease(testArray);
        int resultMax = test.findMaxNumber(testArray);
        int resultMin = test.findMinNumber(testArray);
        boolean firsNumberLessSecondNumber = ((resultMax == testArray[testArray.length -1])&& (resultMin == testArray [0]));
        printTestResult(true, firsNumberLessSecondNumber, "Array Sort In Crease");


    }
    public void printTestResult(boolean expectedResult, boolean result, String testName) {
        if (result == expectedResult) {
            System.out.println(testName + "Test OK, expected result: " + expectedResult + ". Result: " + result);
        } else {
            System.out.println("Test Fail, expected result: " + expectedResult + ". Result: " + result);
        }
    }

}
