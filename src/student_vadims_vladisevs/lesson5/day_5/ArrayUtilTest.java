package student_vadims_vladisevs.lesson5.day_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFillArrayWithRandomNumbersV2();
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
        ArrayUtil tempArray = new ArrayUtil();
        int[] testArray = tempArray.createArray(5);
        printResult(5, testArray.length);
    }

    public void shouldFillArrayWithRandomNumbers() {
        // Write test implementation here !!!
        ArrayUtil tempArray = new ArrayUtil();
        int[] testArray = tempArray.createArray(10);
        tempArray.fillArrayWithRandomNumbers(testArray);

        int failCount = 0;

        for (int number : testArray){
            if( (number < 0) || (number > 100) ){
                failCount++;
            }
        }

        printResult(0, failCount);
    }

    public void shouldFillArrayWithRandomNumbersV2() {
        // Write test implementation here !!!
        ArrayUtil tempArray = new ArrayUtil();
        int[] testArray = tempArray.createArray(10);
        tempArray.fillArrayWithRandomNumbers(testArray);

        int sum = 0;
        for (int temp : testArray){
            sum += temp;
        }

        printResult((sum > 0), (sum > 0));
    }

    public void printResult(int expectedResult, int result){
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        if (result == expectedResult){
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void printResult(boolean expectedResult, boolean result){
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        if (result == expectedResult){
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }


}