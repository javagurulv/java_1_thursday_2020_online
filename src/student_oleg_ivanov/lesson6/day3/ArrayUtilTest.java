package student_oleg_ivanov.lesson6.day3;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.testFindNumber();
        arrayUtilTest.testNumberCountInArray();
        arrayUtilTest.testReplaceNumberInArray();
        arrayUtilTest.testReplaceAllNumbers();
        arrayUtilTest.testRotationNumbers();
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
    public void testReplaceNumberInArray()  {
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(15);
        test.fillArrayWithNumber(testArray);
        test.replaceNumber(testArray, 1, 7);
        printTestResult(7, testArray[0], "Replace number");

    }
    public void testReplaceAllNumbers() {
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(15);
        test.fillArray(testArray);
        test.replaceAllNumbers(testArray, 9, 11);
        printTestResult(11, testArray[0],"Replace all numbers");
    }
    public void testRotationNumbers() {
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(15);
        test.fillArrayWithNumber(testArray);
        test.rotationAllNumberInArray(testArray);
        printTestResult(1, testArray[14], "Rotation all numbers");


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

