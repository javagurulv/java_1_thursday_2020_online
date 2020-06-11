package student_dmitrijs_visuns.homeworks.lesson_5.day_6;


class ArrayUtilTest {

   public static void main(String[] args) {
            ArrayUtilTest test = new ArrayUtilTest();
            test.shouldCreateArray();
            test.shouldFillArrayWithRandomNumbers();
            test.shouldFindMaxNumber();
            test.shouldFindMinNumber();
        }

        public void shouldCreateArray() {
            ArrayUtil testArray = new ArrayUtil();
            int[] result = testArray.createArray(5);

            if (result.length == 5) {
                System.out.println("Create array test - OK");
            } else {
                System.out.println("Create array test - FAIL");
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

        public void shouldFindMaxNumber() {
            ArrayUtil testArray = new ArrayUtil();
            int[] array = {10, 4, 56, 99};

            if (testArray.findMaxNumber(array) == 99) {
                System.out.println("Array max number test - OK");
            } else {
                System.out.println("Array max number test - FAIL");
            }
        }

        public void shouldFindMinNumber() {
            ArrayUtil testArray = new ArrayUtil();
            int[] array = {10, 4, 56, 99};

            if (testArray.findMinNumber(array) == 4) {
            System.out.println("Array min number test - OK");
            } else {
                System.out.println("Array min number test - FAIL");
            }
        }

}
