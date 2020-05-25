package student_vadims_vladisevs.lesson5.day_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
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

    public void printResult(int expectedResult, int result){
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        if (result == expectedResult){
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }


}