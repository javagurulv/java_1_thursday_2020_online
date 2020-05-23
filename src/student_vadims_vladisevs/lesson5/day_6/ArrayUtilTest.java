package student_vadims_vladisevs.lesson5.day_6;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
//        test.shouldCreateArray();                 <- day_5
//        test.shouldFillArrayWithRandomNumbers();   <- day_5
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }


    public void shouldFindMaxNumber() {
        ArrayUtil testArray = new ArrayUtil();
        int[] tempArray = {1, 2, 3, 4, 5};

        int maxNumber = testArray.findMaxNumber(tempArray);
        printResult(5,maxNumber);
    }

    public void shouldFindMinNumber() {
        ArrayUtil testArray = new ArrayUtil();
        int[] tempArray = {1, 2, 3, 4, 5};

        int maxNumber = testArray.findMinNumber(tempArray);
        printResult(1,maxNumber);

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


