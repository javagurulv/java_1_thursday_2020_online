package student_aleksey_kodin.lesson6.day4.task_18;

class TwoDimensionalArrayTest {
    private int[][] testArray;
    private final TwoDimensionalArray arrayUtil = new TwoDimensionalArray();

    public static void main(String[] args) {
        TwoDimensionalArrayTest arrayTest = new TwoDimensionalArrayTest();
        arrayTest.testCreateArray();
        arrayTest.testSum();
    }
    public void testCreateArray() {
        testArray = arrayUtil.createTwoDimensionalArray(2,2);
        printTestResult(((testArray.length == 2) && (testArray[0].length == 2)),"create array");
    }
    public void testSum() {
        arrayUtil.addRandomValueArray(testArray);
        int result = arrayUtil.sumArray(testArray);
        int resultSumArray = testArray[0][0] + testArray[0][1] + testArray[1][0] + testArray[1][1];
        printTestResult(result == resultSumArray,"array sum");
    }
    private void printTestResult(boolean isResultOk,String arrayTest) {
        if (isResultOk) {
            System.out.println("Two Dimensional Array test - " + arrayTest + " = OK");
        } else {
            System.out.println("Two Dimensional Array test - " + arrayTest + " = FAIL");
        }
    }
}
