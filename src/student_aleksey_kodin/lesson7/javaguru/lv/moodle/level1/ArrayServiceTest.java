package student_aleksey_kodin.lesson7.javaguru.lv.moodle.level1;


class ArrayServiceTest {
    private static int[] array = new int[0];
    private static final int[] emptyArray = new int[0];
    private static final ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.testCreateArray(5);
        arrayServiceTest.testFillRandomly(array);
        arrayServiceTest.testSum(array);
        arrayServiceTest.testAvg(array);
        arrayServiceTest.testAvgArrayLengthZero(emptyArray);
        System.out.println("---------------------------------");
        arrayService.printArray(array);
        System.out.println("Sum = " + arrayService.sum(array));
        System.out.println("Avg = " + arrayService.avg(array));
    }
    public void testCreateArray(int size) {
        array = arrayService.create(size);
        printTestResult(array.length == size, "Create array");
    }
    public void testFillRandomly(int[] array) {
        arrayService.fillRandomly(array);
        printTestResult(arrayService.sum(array) > 0, "Fill Randomly");
    }
    public void testSum(int[] array) {
        int result = arrayService.sum(array);
        printTestResult(result == array[0] + array[1] + array[2] + array[3] + array[4], "Sum");
    }
    public void testAvg(int[] array) {
        double result = arrayService.avg(array);
        printTestResult(result == (double) (array[0] + array[1] + array[2] + array[3] + array[4]) / 5, "Avg");
    }
    public void testAvgArrayLengthZero(int[] array) {
        double result = arrayService.avg(array);
        printTestResult(result == 0, "Avg return 0 if [Array.length = 0]");
    }
    private void printTestResult(boolean isResultOk,String arrayFunction) {
        if (isResultOk) {
            System.out.println("ArrayService test - " + arrayFunction + " = OK");
        } else {
            System.out.println("ArrayService test - " + arrayFunction + " = FAIL");
        }
    }
}
