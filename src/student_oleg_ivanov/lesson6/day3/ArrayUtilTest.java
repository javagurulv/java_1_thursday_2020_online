package student_oleg_ivanov.lesson6.day3;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.testFindNumber();
        arrayUtilTest.testNumberCountInArray();

    }

    public void testFindNumber() {
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(15);
        test.findNumberInArrays(testArray);
        boolean result = test.isNumberInArray(9, testArray);
        printTestResult(true, result, "Find Number in array: ");

    }
    public void testNumberCountInArray() {
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(15);
        test.fillArray(testArray);
        int result = test.numberCountInArray(9, testArray);
        printTestResult(15, result,  "Number count in array: ");

    }
    public void printTestResult(boolean expectedResult, boolean result, String testName) {
        if (result == expectedResult) {
            System.out.println(testName + "Test OK, expected result: " + expectedResult + ". Result: " + result);
        } else {
            System.out.println("Test Fail, expected result: " + expectedResult + ". Result: " + result);
        }

    }
    public void printTestResult(int expectedResult, int result, String testName) {
        if (result == expectedResult) {
            System.out.println(testName + "Test OK, expected result: " + expectedResult + ". Result: " + result);
        } else {
            System.out.println("Test Fail, expected result: " + expectedResult + ". Result: " + result);
        }

    }

}

