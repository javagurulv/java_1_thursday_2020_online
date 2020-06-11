package student_dmitrijs_visuns.homeworks.lesson_5.day_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
    }

    public void shouldCreateArray() {

        ArrayUtil testArray = new ArrayUtil();
        int[] result = testArray.createArray(5);

        if (result.length == 5) {
            System.out.println("Array create test - OK");
        } else {
            System.out.println("Array create test - FAIL");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil testArray = new ArrayUtil();
        int[] result = testArray.createArray(5);
        testArray.fillArrayWithRandomNumbers(result);

        int arraySum = 0;
        for (int arrayCount = 0; arrayCount < result.length; arrayCount++) {
            arraySum += result[arrayCount];
        }

        if (arraySum > 0) {
            System.out.println("Fill array with random numbers test - OK");
        } else {
            System.out.println("Fill array with random numbers test - FAIL");
        }
    }

}
