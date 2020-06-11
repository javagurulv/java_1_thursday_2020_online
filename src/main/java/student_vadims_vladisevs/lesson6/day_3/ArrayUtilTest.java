package student_vadims_vladisevs.lesson6.day_3;

class ArrayUtilTest {
    public static void main(String[] args) {
    ArrayUtilTest temp = new ArrayUtilTest();
    temp.testFindNumber();
    temp.testNumberCountInArray();
    temp.testReplaceNumber();
    temp.testReplaceAllNumbers();
    temp.testArrayRotation();
    }


    public void testArrayRotation(){
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(10);
        test.fillArrayFromOne(testArray);
        test.arrayRotation(testArray);
        boolean result = ((testArray[0] == 10) && testArray[9] == 1);
        printTestResult(true, result);
    }

    public void testReplaceAllNumbers() {
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(10);
        test.fillArrayFromOne(testArray);
        test.replaceNumber(testArray, 1, 100);
        test.replaceAll(testArray, 2, 100);
        boolean result = ((testArray[0] == 100) && (testArray[1] == 100));
        printTestResult(true, result);
    }

    public void testReplaceNumber() {
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(10);
        test.fillArrayFromOne(testArray);
        test.replaceNumber(testArray, 1, 100);
        printTestResult(100, testArray[0]);
    }



    public void testNumberCountInArray(){
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(10);
        test.fillArrayWithFive(testArray);
        int result = test.numberCountInArray(5, testArray);
        printTestResult(10, 10);
    }

    public void testFindNumber(){
        ArrayUtil test = new ArrayUtil();
        int[] testArray = test.createArray(10);
        test.fillArrayFromOne(testArray);
        boolean result = test.isNumberInArray(5, testArray);
        printTestResult(true, result);
    }

    public void printTestResult(boolean expectedResult, boolean result){
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        if (result == expectedResult) {
            System.out.println(testName + " OK;" + " expected result: " + expectedResult + "; result: " + result);
        } else {
            System.out.println(testName + " FAIL;" + " expected result: " + expectedResult + "; result: " + result);
        }
    }

    public void printTestResult(int expectedResult, int result){
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        if (result == expectedResult) {
            System.out.println(testName + " OK;" + " expected result: " + expectedResult + "; result: " + result);
        } else {
            System.out.println(testName + " FAIL;" + " expected result: " + expectedResult + "; result: " + result);
        }
    }
}
