package student_oleg_ivanov.lesson6.day4.task18;

class TwoDimensionalArrayTest {
    public static void main(String[] args){
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.twoDimensionalArray();
        twoDimensionalArrayTest.fillArrayWithRandomNumbers();
        twoDimensionalArrayTest.sumAllNumbersInArray();

    }
    public void twoDimensionalArray() {
        TwoDimensionalArray test = new TwoDimensionalArray();
        int [][] testArray = test.createArray(3,3);
        boolean result = ((testArray.length == 3) && (testArray[0].length ==3));
        printTestResult(true, result, "Two Dimension Array");

    }
    public  void fillArrayWithRandomNumbers(){
        TwoDimensionalArray test = new TwoDimensionalArray();
        int[][] testArray = test.createArray(3,3);
        test.fillArrayWithRandomNumbers(testArray);
        int sum = test.sumAllNumbersInArray(testArray);
        boolean result = sum > 0;
        printTestResult(true, result, "Fill Array With Random Numbers");


    }
    public void sumAllNumbersInArray() {
        TwoDimensionalArray test = new TwoDimensionalArray();
        int[][] testArray = test.createArray(3,3);
        testArray[0][0]= 1;
        testArray[1][0]= 1;
        testArray[0][1]= 1;
        testArray[1][1]= 1;
        testArray[2][1]= 1;
        testArray[1][2]= 2;

        int result = test.sumAllNumbersInArray(testArray);
        printTestResult(7, result, "Sum All Numbers");

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
